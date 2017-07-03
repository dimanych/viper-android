package ru.dimanych.viper.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import ru.dimanych.viper.R;
import ru.dimanych.viper.base.BaseActivity;
import ru.dimanych.viper.base.BasePresenter;
import ru.dimanych.viper.base.Layout;
import ru.dimanych.viper.viper.main.MainNavigator;
import ru.dimanych.viper.viper.main.MainPresenter;
import ru.dimanych.viper.viper.main.MainView;
import ru.terrakok.cicerone.Navigator;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Layout(R.layout.activity_main)
public class MainActivity extends BaseActivity implements MainView {

    @BindView(R.id.load_from_interactor)
    Button mLoadButton;

    @InjectPresenter(type = PresenterType.LOCAL)
    MainPresenter mPresenter;

    @Inject
    MainNavigator mNavigator;

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

    @Override
    public void onFound(String text) {
        Toast.makeText(this, "hey! ".concat(text), Toast.LENGTH_SHORT).show();
        Log.d(MainActivity.class.getSimpleName(), "onFound: ");
        mLoadButton.setText("Loaded");
    }

    @OnClick(R.id.load_from_interactor)
    void loadData() {
        mPresenter.findText();
    }

    @OnClick(R.id.go_to_second)
    void goToSecondSceen() {
        mPresenter.goToSecond();
    }

}
