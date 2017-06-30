package ru.dimanych.viper.base;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public abstract class BasePresenter<T extends MvpView> extends MvpPresenter<T> {

    protected abstract void onStop();

}
