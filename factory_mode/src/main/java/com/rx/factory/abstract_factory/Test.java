package com.rx.factory.abstract_factory;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:54}
 * {{@code @Description} @Description: 这是抽象工厂模式}
 */

public class Test {

    public static void main(String[] args) {
        SystemFactory systemFactory;
        UIController interfaceController;
        OperationController operationController;


        // 安卓
        systemFactory = new AndroidFactory();
        // ios
        // systemFactory = new IosFactory();

        interfaceController = systemFactory.createInterfaceController();
        operationController= systemFactory.createOperationController();
        interfaceController.display();
        operationController.control();



    }

}
