package ru.dimanych.viper.viper.second;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface SecondView extends MvpView {


}
