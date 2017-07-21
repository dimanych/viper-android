package ru.dimanych.viper.entity;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class UserSettings {

    private volatile String mToken;

    public synchronized UserSettings token(String token) {
        mToken = token;
        return this;
    }
}
