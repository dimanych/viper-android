package ru.dimanych.viper.di.activity;

import dagger.Subcomponent;
import ru.dimanych.viper.base.BaseActivity;
import ru.dimanych.viper.ui.main.MainActivity;
import ru.dimanych.viper.ui.second.SecondActivity;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(BaseActivity baseActivity);

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);

}
