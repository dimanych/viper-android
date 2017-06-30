package ru.dimanych.viper.viper.main;

import android.content.Intent;
import android.widget.Toast;

import javax.inject.Inject;

import ru.dimanych.viper.base.BaseActivity;
import ru.dimanych.viper.ui.second.SecondActivity;
import ru.dimanych.viper.util.Screens;
import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.commands.Command;
import ru.terrakok.cicerone.commands.Forward;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class MainNavigator implements Navigator {

    BaseActivity mActivity;

    @Inject
    public MainNavigator(BaseActivity activity) {
        mActivity = activity;
    }


    @Override
    public void applyCommand(Command command) {
        forward((Forward) command);
    }

    private void forward(Forward command) {
        switch (command.getScreenKey()) {
            case Screens.ACTIVITY_SECOND:
                mActivity.startActivity(new Intent(mActivity.getApplicationContext(), SecondActivity.class));
                break;
            default:
                Toast.makeText(mActivity, "I will rest", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
