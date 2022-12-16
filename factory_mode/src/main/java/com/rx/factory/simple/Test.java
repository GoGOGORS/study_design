package com.rx.factory.simple;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:08}
 * {{@code @Description} @Description: 简单工厂模式}
 */

public class Test {

    public static void main(String[] args) {
        Shape shape= ShapeFactory.getShape("circle");
        shape.draw();

    }


}
