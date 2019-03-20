package com.japlayground.patterns.p8_state.old_design;

import com.japlayground.patterns.p8_state.TvLog;

/**
 * 这是一个电视遥控器的传统实现方式，定义了两种状态，四种操作。弊端在于在执行每种操作时都需要对状态进行判断。
 * 一旦操作和状态增加则代码重复，相对混乱。
 * @author niupengjie
 * @since 2019/3/20
 */
public class TvController {
    private static final String TAG = "TvController";
    // 开机状态
    private static final int POWER_ON = 1;
    // 关机状态
    private static final int POWER_OFF = 2;
    private int mState = POWER_OFF;

    public void powerOn() {
        if (mState == POWER_OFF) {
            TvLog.powerOn();
        }
        mState = POWER_ON;
    }

    public void powerOff() {
        if (mState == POWER_ON) {
            TvLog.powerOff();
        }
        mState = POWER_OFF;
    }

    public void nextChannel() {
        if (mState == POWER_ON) {
            TvLog.nextChannel();
        } else {
            TvLog.offTips();
        }
    }

    public void prevChannel() {
        if (mState == POWER_ON) {
            TvLog.prevChannel();
        } else {
            TvLog.offTips();
        }
    }

    public void turnUp() {
        if (mState == POWER_ON) {
            TvLog.turnUp();
        } else {
            TvLog.offTips();
        }
    }

    public void turnDown() {
        if (mState == POWER_ON) {
            TvLog.turnDown();
        } else {
            TvLog.offTips();
        }
    }
}
