package ru.dimanych.viper;

import android.app.Application;

import ru.dimanych.viper.di.AppComponent;
import ru.dimanych.viper.di.AppModule;
import ru.dimanych.viper.di.DaggerAppComponent;
import ru.dimanych.viper.di.NavigationModule;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class ViperApplication extends Application {

    private AppComponent mAppComponent;

    private static ViperApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .navigationModule(new NavigationModule())
                .build();
    }

    public static ViperApplication getInstance() {
        return mApplication;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
