package ru.dimanych.viper.di.domain;

import dagger.Subcomponent;
import ru.dimanych.viper.viper.main.MainPresenter;
import ru.dimanych.viper.viper.second.SecondPresenter;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@DomainScope
@Subcomponent(modules = {DomainModule.class})
public interface DomainComponent {

    void inject(MainPresenter mainPresenter);

    void inject(SecondPresenter secondPresenter);
}
