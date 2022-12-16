package com.rx.factory.advance;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:42}
 * {{@code @Description} @Description: 工厂方法模式}
 */

public class Test {


    public static void main(String[] args) {
        ReaderFactory jpgReaderFactory = new JpgReaderFactory();
        jpgReaderFactory.getReader().readImage();

        ReaderFactory pngfactory = new PngReaderFactory();
        pngfactory.getReader().readImage();


    }

}
