package ru.dimanych.viper.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.terrakok.cicerone.Cicerone;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Module
public class NavigationModule {

    private Cicerone<Router> mCicerone;

    public NavigationModule() {
        mCicerone = Cicerone.create();
    }

    @Provides
    @Singleton
    Router provideRouter() {
        return mCicerone.getRouter();
    }

    @Provides
    @Singleton
    NavigatorHolder provideNavigatorHolder() {
        return mCicerone.getNavigatorHolder();
    }
}
