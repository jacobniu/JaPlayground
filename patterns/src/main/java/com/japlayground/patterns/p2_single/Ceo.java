package com.japlayground.patterns.p2_single;

/**
 * DCL(Double Check Lock.)模式，优点是在需要时才进行类的实例化，线程是安全的，而且实例化之后调用getInstance方法不进行同步锁。
 * @author niupengjie
 * @since 2019/3/21
 */
public class Ceo {
    // 加入volatile关键字避免"双重检查锁定失效"问题
    private volatile static Ceo instance;
    private Ceo() {}

    public static Ceo getInstance() {
        if (instance == null) {
            synchronized (Ceo.class) {
                if (instance == null) {
                    instance = new Ceo();
                }
            }
        }
        return instance;
    }
}
