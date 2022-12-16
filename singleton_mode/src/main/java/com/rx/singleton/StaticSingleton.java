package com.rx.singleton;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-16 11:25}
 * {{@code @Description} @Description: }
 */

public class StaticSingleton {


    private StaticSingleton(){}

    private static class InnerClass{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return InnerClass.INSTANCE;
    }


}
