package ru.dimanych.viper.viper.main;

import android.util.Log;

import io.reactivex.Flowable;
import ru.dimanych.viper.base.BaseInteractor;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class MainInteractor extends BaseInteractor {

    public Flowable<String> loadData() {
        Log.d("TAG", "loadData: ran");
        return Flowable.just("MainInteractorData");
    }

}
