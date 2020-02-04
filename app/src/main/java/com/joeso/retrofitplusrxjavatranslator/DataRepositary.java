package com.joeso.retrofitplusrxjavatranslator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataRepositary {
    private WebApi mApi;

    public DataRepositary(){
        Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://fitstop.pixelforcesystems.com.au")
                .build();
        mApi= mRetrofit.create(WebApi .class);
    }

    public LiveData<User> logIn(String phone, String code){
        final MutableLiveData<User> result = new MutableLiveData<>();
        mApi.signIn(phone, code)
                .subscribeOn(Schedulers.io())               // 在IO线程进行网络请求
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<User>() {
                    @Override
                    public void accept(User user) throws Exception {
                        result.setValue(user);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        result.setValue(null);
                    }
                });

        return result;

    }
}
