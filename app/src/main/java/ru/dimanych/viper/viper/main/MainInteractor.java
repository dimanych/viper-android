package ru.dimanych.viper.viper.main;

import io.reactivex.Flowable;
import ru.dimanych.viper.base.BaseInteractor;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class MainInteractor extends BaseInteractor {

    public Flowable<String> loadData() {
        return Flowable.just("MainInteractorData");
    }

}
