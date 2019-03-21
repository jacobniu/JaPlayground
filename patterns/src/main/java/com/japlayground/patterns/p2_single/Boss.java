package com.japlayground.patterns.p2_single;

/**
 * 《Java并发编程》中提出的单例实现方式。
 * @author niupengjie
 * @since 2019/3/21
 */
public class Boss {
    private Boss() {}
    public static Boss getInstance() {
        return BossHolder.instance;
    }

    private static class BossHolder {
        private static final Boss instance = new Boss();
    }
}
