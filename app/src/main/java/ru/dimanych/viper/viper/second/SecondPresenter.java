package ru.dimanych.viper.viper.second;

import com.arellomobile.mvp.InjectViewState;

import javax.inject.Inject;

import ru.dimanych.viper.ViperApplication;
import ru.dimanych.viper.base.BasePresenter;
import ru.dimanych.viper.di.domain.DomainModule;
import ru.dimanych.viper.util.Screens;
import ru.terrakok.cicerone.Router;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@InjectViewState
public class SecondPresenter extends BasePresenter<SecondView> {

    @Inject
    Router mRouter;
    @Inject
    SecondInteractor mInteractor;

    public SecondPresenter() {
        ViperApplication.getInstance().getAppComponent()
                .plus(new DomainModule())
                .inject(this);
    }

    public void goToMain() {
        mRouter.replaceScreen(Screens.ACTIVITY_MAIN);
    }

    @Override
    protected void onStop() {
        mInteractor.detachAll();
    }
}
