package ru.dimanych.viper.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import ru.dimanych.viper.R;
import ru.dimanych.viper.base.BaseFragment;
import ru.dimanych.viper.base.Layout;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Layout(R.layout.fragment_fragment1)
public class Fragment2 extends BaseFragment {

    @BindView(R.id.caption)
    TextView mCaption;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mCaption.setText("Fragment 2");
    }
}
