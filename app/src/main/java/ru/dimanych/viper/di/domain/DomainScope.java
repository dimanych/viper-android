package ru.dimanych.viper.di.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * <p>Use for activity depends components</p>
 *
 * @author Dmitriy Grigoriev
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface DomainScope {
}
