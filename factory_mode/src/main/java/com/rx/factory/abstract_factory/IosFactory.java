package com.rx.factory.abstract_factory;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:57}
 * {{@code @Description} @Description: }
 */

public class IosFactory implements SystemFactory{


    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new IosUIController();
    }

}
