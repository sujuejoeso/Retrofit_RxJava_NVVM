package com.joeso.retrofitplusrxjavatranslator;

import android.annotation.SuppressLint;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataRepositary {
    public WebApi mApi;

    public DataRepositary(){
        Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://fitstop.pixelforcesystems.com.au")
                .build();
        mApi= mRetrofit.create(WebApi .class);
    }

    public LiveData<User> logIn(String phone, String code){
        MutableLiveData<User> result = new MutableLiveData<>();
        mApi.signIn(phone, code)
                .compose(Schedulers.io())
                .subscribe(user -> result.setValue(user),throwable -> result.setValue(null));
        return result;

    }
}
