package ru.dimanych.viper.util;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Inject;

import static com.bumptech.glide.request.RequestOptions.circleCropTransform;

public class ImageLoader {

    private Context context;

    @Inject
    public ImageLoader(Context context) {
        this.context = context;
    }

    public void loadImage(String url, ImageView imageView) {
        loadImage(Uri.parse(url), imageView);
    }

    public void loadImage(Uri uri, ImageView imageView) {
        Glide.with(context)
                .load(uri)
                .into(imageView);
    }

    public void loadImage(@DrawableRes int drawaId, ImageView imageView) {
        Glide.with(context)
                .load(drawaId)
                .into(imageView);
    }

    public void loadImageRounded(@DrawableRes int drawId, ImageView imageView) {
        Glide.with(context)
                .load(drawId)
                .apply(circleCropTransform())
                .into(imageView);
    }


}
