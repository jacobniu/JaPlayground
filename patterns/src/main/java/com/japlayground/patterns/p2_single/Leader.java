package com.japlayground.patterns.p2_single;

/**
 * 饿汉单例模式，在第一次使用时实例化。缺点在于每次调用getInstance方法都会进行同步，造成不必要但资源浪费。
 * @author niupengjie
 * @since 2019/3/21
 */
public class Leader {
    private static Leader instance;
    private Leader() {}

    public static synchronized Leader getInstance() {
        if (instance == null) {
            instance = new Leader();
        }
        return instance;
    }
}
