package ru.dimanych.viper.viper.second;

import android.content.Intent;
import android.widget.Toast;

import javax.inject.Inject;

import ru.dimanych.viper.base.BaseActivity;
import ru.dimanych.viper.ui.main.MainActivity;
import ru.dimanych.viper.util.Screens;
import ru.terrakok.cicerone.Navigator;
import ru.terrakok.cicerone.commands.Command;
import ru.terrakok.cicerone.commands.Replace;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class SecondNavigator implements Navigator {

    BaseActivity mActivity;

    @Inject
    SecondNavigator(BaseActivity activity) {
        mActivity = activity;
    }


    @Override
    public void applyCommand(Command command) {
        forward((Replace) command);
    }

    private void forward(Replace command) {
        switch (command.getScreenKey()) {
            case Screens.ACTIVITY_MAIN:
                mActivity.startActivity(new Intent(mActivity.getApplicationContext(), MainActivity.class));
                break;
            default:
                Toast.makeText(mActivity, "I will rest", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
