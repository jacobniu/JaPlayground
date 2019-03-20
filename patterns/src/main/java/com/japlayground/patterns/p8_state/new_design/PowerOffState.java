package com.japlayground.patterns.p8_state.new_design;

import com.japlayground.patterns.p8_state.TvLog;

/**
 * 关机状态，此时只有电视机开机功能才是有效的
 * @author niupengjie
 * @since 2019/3/20
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        TvLog.offTips();
    }

    @Override
    public void prevChannel() {
        TvLog.offTips();
    }

    @Override
    public void turnUp() {
        TvLog.offTips();
    }

    @Override
    public void turnDown() {
        TvLog.offTips();
    }
}
