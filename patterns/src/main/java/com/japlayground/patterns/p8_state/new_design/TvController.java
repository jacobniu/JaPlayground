package com.japlayground.patterns.p8_state.new_design;

import com.japlayground.patterns.p8_state.TvLog;

/**
 * @author niupengjie
 * @since 2019/3/20
 */
public class TvController implements PowerController {

    private TvState mState;

    public void setState(TvState mState) {
        this.mState = mState;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
        TvLog.powerOn();
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        TvLog.powerOff();
    }

    public void nextChannel() {
        mState.nextChannel();
    }

    public void prevChannel() {
        mState.prevChannel();
    }

    public void turnUp() {
        mState.turnUp();
    }

    public void turnDown() {
        mState.turnDown();
    }
}
