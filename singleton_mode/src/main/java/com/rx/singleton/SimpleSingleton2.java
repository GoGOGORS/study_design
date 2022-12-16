package com.rx.singleton;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-16 11:19}
 * {{@code @Description} @Description: 单例模式之饿汉式}
 */


public class SimpleSingleton2 {


    private final SimpleSingleton2 simpleSingleton2 = new SimpleSingleton2();

    private SimpleSingleton2(){}

    public SimpleSingleton2 getInstance(){
        return simpleSingleton2;
    }


}
