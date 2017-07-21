package ru.dimanych.viper.net;

import java.util.Map;

import io.reactivex.Flowable;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public interface ApiWebService {

    @Multipart
    @POST("file/upload")
    Flowable<Response<Object>> sendPicture(@PartMap Map<String, RequestBody> params);

}
