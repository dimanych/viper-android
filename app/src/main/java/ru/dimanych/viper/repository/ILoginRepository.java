package ru.dimanych.viper.repository;


import io.reactivex.Flowable;
import ru.dimanych.viper.entity.User;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public interface ILoginRepository<T> {

    Flowable<User> loadUser(T authData);

}
