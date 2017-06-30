package ru.dimanych.viper.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.dimanych.viper.di.activity.ActivityComponent;
import ru.dimanych.viper.di.activity.ActivityModule;
import ru.dimanych.viper.di.domain.DomainComponent;
import ru.dimanych.viper.di.domain.DomainModule;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Singleton
@Component(modules = {AppModule.class, NavigationModule.class})
public interface AppComponent {

    ActivityComponent plus(ActivityModule activityModule);

    DomainComponent plus(DomainModule domainModule);

}
