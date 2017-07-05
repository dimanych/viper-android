package ru.dimanych.viper.util;

import android.content.SharedPreferences;

public class SharedPreferencesHelper {

    private SharedPreferences mPreferences;

    public SharedPreferencesHelper(SharedPreferences preferences) {
        mPreferences = preferences;
    }

    public void put(String key, boolean value) {
        mPreferences
                .edit()
                .putBoolean(key, value)
                .apply();
    }

    public boolean get(String key, boolean defaultValue) {
        return mPreferences.getBoolean(key, defaultValue);
    }

    public int get(String key, int defaultValue) {
        return mPreferences.getInt(key, defaultValue);
    }

}
