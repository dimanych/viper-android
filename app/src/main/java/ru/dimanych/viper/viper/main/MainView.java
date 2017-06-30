package ru.dimanych.viper.viper.main;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@StateStrategyType(SingleStateStrategy.class)
public interface MainView extends MvpView {

    void onFound(String text);

}
