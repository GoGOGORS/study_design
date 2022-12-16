package com.rx.factory.abstract_factory;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:52}
 * {{@code @Description} @Description: }
 */

public class AndroidUIController implements UIController{


    @Override
    public void display() {
        System.out.println("这是安卓ui控制器");
    }
}
