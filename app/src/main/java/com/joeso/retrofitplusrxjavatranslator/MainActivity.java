package com.joeso.retrofitplusrxjavatranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String phone="0405060771";
    String code="1111";
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        final TextView result=findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建Retrofit对象，针对Gson格式
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .baseUrl("http://fitstop.pixelforcesystems.com.au")
                        .build();
                //通过Retrofit对象创建Api接口实体
                WebApi api= retrofit.create(WebApi .class);
                //采用Observable<T> 形式对retrofit call（request）进行封装
                Observable<User> observableUser=api.signIn(phone,code);
                //向服务器发送request，使用 observable.subscribe(consumer<T> , consumer<Throwable>)的方法重载
                observableUser
                        .subscribeOn(Schedulers.io())               // 在IO线程进行网络请求
                        .observeOn(AndroidSchedulers.mainThread())  // 回到主线程 处理请求结果
                        .subscribe(new Consumer<User>() {
                    @Override
                    public void accept(User user) throws Exception {
                        String text="User Name: "+user.firstName+" "+user.lastName+"\n";
                        text+="email: "+user.email+"\n";
                        text+="Date of Birth: "+user.dateOfBirth;
                        result.setText(text);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        result.setText(throwable.getMessage());
                    }
                });
            }
        });
    }
}
