package com.ahn.corsExam;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {
    /*
    /cors 이하의 모든 컨트롤러는 모든 도메인이 접근해도 허용되도록 설정
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/cors/**").allowedOrigins("*");
    }
}
