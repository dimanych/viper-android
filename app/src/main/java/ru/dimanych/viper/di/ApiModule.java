package ru.dimanych.viper.di;

import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import auto.parcelgson.gson.AutoParcelGsonTypeAdapterFactory;
import dagger.Module;
import dagger.Provides;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.dimanych.viper.net.ApiWebService;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
    }

    @Provides
    GsonConverterFactory provideGsonConverterFactory() {
        return GsonConverterFactory.create(new GsonBuilder()
                .registerTypeAdapterFactory(new AutoParcelGsonTypeAdapterFactory())
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create());
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient httpClient, GsonConverterFactory gsonConverterFactory) {
        RxJava2CallAdapterFactory rxAdapter = RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io());
        return new Retrofit.Builder()
                .baseUrl("http://ya.ru")
                .addConverterFactory(gsonConverterFactory)
                .client(httpClient)
                .addCallAdapterFactory(rxAdapter)
                .build();
    }

    @Provides
    @Singleton
    ApiWebService provideRestApi(Retrofit retrofit) {
        return retrofit.create(ApiWebService.class);
    }


}
