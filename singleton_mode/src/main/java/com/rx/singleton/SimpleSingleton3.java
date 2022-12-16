package com.rx.singleton;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-16 11:19}
 * {{@code @Description} @Description: 双重检测锁}
 */


public class SimpleSingleton3 {


    private static SimpleSingleton3 instanace;

    private SimpleSingleton3(){}

    public static SimpleSingleton3 getInstance(){
        if (null == instanace){
            synchronized (SimpleSingleton3.class){
                if (null == instanace){
                    instanace = new SimpleSingleton3();
                }
            }
        }
        return instanace;
    }


}
