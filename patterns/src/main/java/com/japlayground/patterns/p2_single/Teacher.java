package com.japlayground.patterns.p2_single;

/**
 * 饿汉单例模式，类实例在类加载时实例化
 * @author niupengjie
 * @since 2019/3/21
 */
public class Teacher {
    private static final Teacher instance = new Teacher();

    private Teacher() {}

    public static Teacher getInstance() {
        return instance;
    }
}
