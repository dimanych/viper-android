package ru.dimanych.viper.ui.second;

import android.os.Bundle;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

import javax.inject.Inject;

import butterknife.OnClick;
import ru.dimanych.viper.R;
import ru.dimanych.viper.base.BaseActivity;
import ru.dimanych.viper.base.BasePresenter;
import ru.dimanych.viper.base.Layout;
import ru.dimanych.viper.viper.second.SecondNavigator;
import ru.dimanych.viper.viper.second.SecondPresenter;
import ru.dimanych.viper.viper.second.SecondView;
import ru.terrakok.cicerone.Navigator;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Layout(R.layout.activity_second)
public class SecondActivity extends BaseActivity implements SecondView {

    @InjectPresenter(type = PresenterType.LOCAL)
    SecondPresenter mPresenter;

    @Inject
    SecondNavigator mNavigator;

    @Override
    public Navigator navigator() {
        return mNavigator;
    }

    @Override
    public BasePresenter presenter() {
        return mPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @OnClick(R.id.go_back)
    void goMain() {
        mPresenter.goToMain();
    }
}
