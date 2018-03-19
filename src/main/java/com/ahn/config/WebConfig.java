package com.ahn.config;


import com.ahn.bangsong.BangsongCoverter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 기타 등등 설정하기 위해서는 WebMvcConfigurer implements 하자
 * handlerMapping, HandlerAdapter, ExceptionHandler = >WebMvcRegistrations 구현
 */
@Configuration
public class WebConfig implements WebMvcConfigurer,WebMvcRegistrations {

    //컨버터에 없는 gson 설정

   /* @Bean
    public HttpMessageConverters customConverters(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        return new HttpMessageConverters(converter);
    }*/

    /*@Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new BangsongCoverter());
    }*/
}
