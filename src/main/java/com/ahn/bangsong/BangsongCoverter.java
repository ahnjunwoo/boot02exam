package com.ahn.bangsong;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BangsongCoverter implements Converter<String,Bangsong> {

    @Override
    public Bangsong convert(String id) {
        Bangsong bangsong = new Bangsong();
        bangsong.setId(Integer.valueOf(id));
        return bangsong;
    }
}
