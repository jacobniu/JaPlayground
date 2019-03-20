package com.japlayground.vstech.util

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

/**
 * @author niupengjie
 * @since 2019/3/20
 */

/**
 * 默认的动画时长
 */
private const val defDuration = 400L

/**
 * 对给定的[View]执行改变透明度的动画
 */
fun View.animAlpha(v: View, from: Float, to: Float, duration: Long = defDuration) {
    ObjectAnimator.ofFloat(v, View.ALPHA, from, to).setDuration(duration).start()
}

/**
 * 对给定的[View]执行缩放的动画
 */
fun View.animScale(v: View, from: Float, to: Float, duration: Long = defDuration) {
    AnimatorSet().apply {
        playTogether(
            ObjectAnimator.ofFloat(v, View.SCALE_X, from, to).setDuration(duration),
            ObjectAnimator.ofFloat(v, View.SCALE_Y, from, to).setDuration(duration)
        )
        start()
    }
}