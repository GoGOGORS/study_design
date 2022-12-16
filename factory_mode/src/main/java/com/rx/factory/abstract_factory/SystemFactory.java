package com.rx.factory.abstract_factory;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:53}
 * {{@code @Description} @Description: }
 */

public interface SystemFactory {

    OperationController createOperationController();

    UIController createInterfaceController();

}
