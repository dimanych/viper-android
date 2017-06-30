package ru.dimanych.viper.viper.main;

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
public class MainPresenter extends BasePresenter<MainView> {

    @Inject
    Router mRouter;
    @Inject
    MainInteractor mInteractor;

    public MainPresenter() {
        ViperApplication.getInstance().getAppComponent()
                .plus(new DomainModule())
                .inject(this);
    }

    public void findText() {
        mInteractor.loadData()
                .subscribe(getViewState()::onFound);
    }

    public void goToSecond() {
        mRouter.navigateTo(Screens.ACTIVITY_SECOND);
    }

    @Override
    protected void onStop() {
        mInteractor.detachAll();
    }
}
