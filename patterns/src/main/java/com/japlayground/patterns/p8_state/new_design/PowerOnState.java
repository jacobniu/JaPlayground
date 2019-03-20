package com.japlayground.patterns.p8_state.new_design;

import com.japlayground.patterns.p8_state.TvLog;

/**
 * 开机状态下，功能都是有效的
 * @author niupengjie
 * @since 2019/3/20
 */
public class PowerOnState implements TvState {

    @Override
    public void nextChannel() {
        TvLog.nextChannel();
    }

    @Override
    public void prevChannel() {
        TvLog.prevChannel();
    }

    @Override
    public void turnUp() {
        TvLog.turnUp();
    }

    @Override
    public void turnDown() {
        TvLog.turnDown();
    }
}
