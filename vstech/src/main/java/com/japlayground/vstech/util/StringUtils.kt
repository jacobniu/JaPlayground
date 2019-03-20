package com.japlayground.vstech.util

import androidx.annotation.IntRange
import java.util.*

/**
 * @author niupengjie
 * @since 2019/3/20
 */

/**
 * 假定的获取随机字符串的字符集
 */
private const val ALLOWED_CHARACTERS = "0123456789qwertyuiopasdfghjklzxcvbnm"

/**
 * 获取指定长度的随机字符串
 */
fun randomString(@IntRange(from = 1) length: Int): String {
    val random = Random()
    val sb = StringBuilder(length)
    for (i in 0 until length) {
        sb.append(ALLOWED_CHARACTERS[random.nextInt(ALLOWED_CHARACTERS.length)])
    }
    return sb.toString()
}