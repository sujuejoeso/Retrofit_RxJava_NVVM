package com.joeso.retrofitplusrxjavatranslator;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WebApi{

    @POST("/api/v1/auth/sign_in")
    Observable<User> signIn(@Query("phone") String phone, @Query("code") String code);
}
