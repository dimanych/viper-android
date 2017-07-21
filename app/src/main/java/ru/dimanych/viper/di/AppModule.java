package ru.dimanych.viper.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.dimanych.viper.ViperApplication;
import ru.dimanych.viper.entity.UserSettings;
import ru.dimanych.viper.util.SharedPreferencesHelper;

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

    @Provides
    @Singleton
    SharedPreferencesHelper provideSharedPreference(Context context) {
        return new SharedPreferencesHelper(
                context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE)
        );
    }

    @Provides
    @Singleton
    UserSettings provideUserSettings() {
        return new UserSettings();
    }
}
