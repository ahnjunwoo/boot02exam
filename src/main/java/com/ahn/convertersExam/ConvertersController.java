package com.ahn.convertersExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.*;

import java.net.BindException;

@RestController
@RequestMapping("/converters")
public class ConvertersController {
    @Autowired
    HttpMessageConverters convertersList;




    @RequestMapping("/")
    public String index(){
        convertersList.forEach(c->{
           System.out.println("컨버터 목록:::::"+c.getClass());
        });
        return "hello converters";
    }
    //@ResponsBody 생략 되어있기때문에 restcontroller모든  리턴값들은 컨버터를 사용하게 된다.
    //ap
    @GetMapping("/currentUser")
    public ConverterVO currentUser(){
        ConverterVO vo = new ConverterVO();
        vo.setAge("33");
        vo.setHeight("179");
        vo.setName("ahnjunwoo");

        return vo;
    }
}
