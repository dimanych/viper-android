package ru.dimanych.viper.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.dimanych.viper.ViperApplication;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Module
public class AppModule {

    private final ViperApplication mApplication;

    public AppModule(ViperApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    ViperApplication provideApplication() {
        return mApplication;
    }

    @Provides
    Context provideContext() {
        return mApplication;
    }
}
