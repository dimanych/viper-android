package ru.dimanych.viper.di.domain;

import dagger.Module;
import dagger.Provides;
import ru.dimanych.viper.viper.main.MainInteractor;
import ru.dimanych.viper.viper.second.SecondInteractor;

@Module
public class DomainModule {

    @Provides
    @DomainScope
    MainInteractor provideMainInteractor() {
        return new MainInteractor();
    }

    @Provides
    @DomainScope
    SecondInteractor provideSecondInteractor() {
        return new SecondInteractor();
    }

}
