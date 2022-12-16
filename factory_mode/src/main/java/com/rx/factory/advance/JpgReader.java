package com.rx.factory.advance;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:38}
 * {{@code @Description} @Description: }
 */

public class JpgReader implements Reader{


    @Override
    public void readImage() {
        System.out.println("读取jpg格式");
    }
}
