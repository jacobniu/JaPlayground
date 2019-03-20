package com.japlayground.patterns.p8_state.new_design;

/**
 * 电视状态接口，定义了电视的操作的函数
 * @author niupengjie
 * @since 2019/3/20
 */
public interface TvState {

    void nextChannel();

    void prevChannel();

    void turnUp();

    void turnDown();
}
