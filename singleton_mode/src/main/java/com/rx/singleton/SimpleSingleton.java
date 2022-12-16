package com.rx.singleton;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-16 11:19}
 * {{@code @Description} @Description: 单例模式之懒汉式}
 */


public class SimpleSingleton {

    private static SimpleSingleton instance;

    private SimpleSingleton(){}

    public static synchronized SimpleSingleton getInstance() {
        if (null == instance) {
            instance = new SimpleSingleton();
        }

        return instance;
    }


}
