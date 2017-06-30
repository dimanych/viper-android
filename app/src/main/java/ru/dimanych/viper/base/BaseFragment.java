package ru.dimanych.viper.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;

import butterknife.ButterKnife;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public abstract class BaseFragment extends MvpAppCompatFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Class cls = getClass();
        if (!cls.isAnnotationPresent(Layout.class)) return null;
        Layout layout = (Layout) cls.getAnnotation(Layout.class);
        View view = inflater.inflate(layout.value(), null);
        ButterKnife.bind(this, view);
        return view;
    }

}
