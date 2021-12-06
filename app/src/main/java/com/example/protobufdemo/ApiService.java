package com.example.protobufdemo;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import tm.LoginRequestOuterClass;

/**
 * 所有的web接口都在此
 * @author HDL
 */
public interface ApiService {
    /**
     * 登录
     * http://192.168.0.162:8080/protobuf/login.action
     * @return
     */
    @POST("login.action")
    Observable<LoginRequestOuterClass.LoginResponse> login(@Body RequestBody bytes);
}




