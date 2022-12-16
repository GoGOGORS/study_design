package com.rx.factory.abstract_factory;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:51}
 * {{@code @Description} @Description: }
 */

public class AndroidOperationController implements OperationController{


    @Override
    public void control() {
        System.out.println("这是安卓操作控制器");
    }
}
