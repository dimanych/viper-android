package ru.dimanych.viper.base;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import ru.dimanych.viper.ViperApplication;
import ru.dimanych.viper.di.activity.ActivityComponent;
import ru.dimanych.viper.di.activity.ActivityModule;
import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.NavigatorHolder;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public abstract class BaseActivity extends MvpAppCompatActivity {

    protected ActivityComponent mActivityComponent;

    @Inject
    protected NavigatorHolder mNavigatorHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Class cls = getClass();
        if (!cls.isAnnotationPresent(Layout.class)) return;
        Layout layout = (Layout) cls.getAnnotation(Layout.class);
        setContentView(layout.value());

        ButterKnife.bind(this);

        mActivityComponent = ((ViperApplication) getApplication())
                .getAppComponent()
                .plus(new ActivityModule(this));
        mActivityComponent.inject(this);

        mNavigatorHolder.setNavigator(navigator());
    }

    public abstract Navigator navigator();

    public abstract BasePresenter presenter();

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        mNavigatorHolder.setNavigator(navigator());
    }

    @Override
    protected void onPause() {
        mNavigatorHolder.removeNavigator();
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter().onStop();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
