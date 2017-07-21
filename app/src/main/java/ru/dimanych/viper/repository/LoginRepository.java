package ru.dimanych.viper.repository;

import javax.inject.Inject;

import io.reactivex.Flowable;
import ru.dimanych.viper.di.domain.DomainScope;
import ru.dimanych.viper.entity.User;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@DomainScope
public class LoginRepository implements ILoginRepository<String> {

    @Inject
    public LoginRepository() {
    }

    @Override
    public Flowable<User> loadUser(String s) {
        return Flowable.just(s)
                .map(User::new);
    }
}
