package ru.dimanych.viper.di.activity;

import dagger.Module;
import dagger.Provides;
import ru.dimanych.viper.base.BaseActivity;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Module
public class ActivityModule {

    private BaseActivity mActivity;

    public ActivityModule(BaseActivity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityScope
    public BaseActivity provideActivity() {
        return mActivity;
    }

}
