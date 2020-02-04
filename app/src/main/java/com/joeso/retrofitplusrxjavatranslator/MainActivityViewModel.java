package com.joeso.retrofitplusrxjavatranslator;

import android.app.Application;
import android.util.Pair;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

public class MainActivityViewModel extends AndroidViewModel {
    DataRepositary mDataRepositary=new DataRepositary();

    public MutableLiveData<String> CodeLivedata = new MutableLiveData<>();
    public MutableLiveData<String> phoneLiveData = new MutableLiveData<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<User> login(String phone,String code) {
        phoneLiveData.setValue(phone);
        CodeLivedata.setValue(code);
        return mDataRepositary.logIn(phoneLiveData.getValue(), CodeLivedata.getValue());
    }
}
