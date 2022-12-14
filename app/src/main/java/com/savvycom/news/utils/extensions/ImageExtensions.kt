package com.savvycom.news.utils.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

internal fun ImageView.loadImage(url: String?) {
    Glide.with(this.context).load(url).centerCrop()
        .transition(DrawableTransitionOptions.withCrossFade(200)).dontAnimate().into(this)
}