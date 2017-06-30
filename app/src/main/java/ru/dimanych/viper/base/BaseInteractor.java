package ru.dimanych.viper.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public abstract class BaseInteractor {

    private CompositeDisposable subs = new CompositeDisposable();

    public void subscribe(Disposable subscription) {
        subs.add(subscription);
    }

    public void detachAll() {
        if (subs.isDisposed()) subs.clear();
    }

}
