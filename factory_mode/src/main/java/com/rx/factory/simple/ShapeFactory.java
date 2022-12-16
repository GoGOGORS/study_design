package com.rx.factory.simple;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:06}
 * {{@code @Description} @Description: 简单工厂模式}
 */

public class ShapeFactory {

    public static Shape getShape(String type) {
        Shape shape = null;
        if ("circle".equalsIgnoreCase(type)) {
            shape = new CircleShape();
        } else if ("square".equalsIgnoreCase(type)) {
            shape = new SquareShape();
        } else if ("triangle".equalsIgnoreCase(type)) {
            shape = new TriangleShape();
        }

        return shape;

    }

}
