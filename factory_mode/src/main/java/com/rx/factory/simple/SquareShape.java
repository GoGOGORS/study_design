package com.rx.factory.simple;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 10:55}
 * {{@code @Description} @Description: }
 */

public class SquareShape implements Shape{

    public SquareShape() {
        System.out.println("这是正方形构造器");
    }

    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }

}
