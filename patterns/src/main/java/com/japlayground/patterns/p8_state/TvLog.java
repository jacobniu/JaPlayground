package com.japlayground.patterns.p8_state;

import android.util.Log;

/**
 * @author niupengjie
 * @since 2019/3/20
 */
public class TvLog {

    private static final String TAG = "TvLog";

    public static void powerOn() {
        Log.d(TAG, "开机啦.");
    }

    public static void powerOff() {
        Log.d(TAG, "关机啦.");
    }

    public static void offTips() {
        Log.d(TAG, "两个红灯提示没有开机.");
    }

    public static void nextChannel() {
        Log.d(TAG, "下一个频道");
    }

    public static void prevChannel() {
        Log.d(TAG, "上一个频道.");
    }

    public static void turnUp() {
        Log.d(TAG, "音量增大.");
    }

    public static void turnDown() {
        Log.d(TAG, "音量减小.");
    }
}
