package com.rx.factory.advance;

/**
 * {@code @author: jsf}
 * {{@code @Date} @date: 2022-12-10 11:41}
 * {{@code @Description} @Description: }
 */

public class JpgReaderFactory implements ReaderFactory{


    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
