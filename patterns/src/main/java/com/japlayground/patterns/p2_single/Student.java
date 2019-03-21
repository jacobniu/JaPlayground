package com.japlayground.patterns.p2_single;

/**
 * 枚举实现的单例具备前面几种的优点，并且在反序列化时不会产生新的对象，而之前几种会产生新的对象。
 *
 * @author niupengjie
 * @since 2019/3/21
 */
public enum Student {
    INSTANCE;

    public void doSomething() {
    }
}