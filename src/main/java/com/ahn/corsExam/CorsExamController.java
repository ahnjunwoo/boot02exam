package com.ahn.corsExam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cors")
public class CorsExamController {

    @CrossOrigin //컨트롤러의 특정 메소드만 허용(외부 클라이언트 단에서 접속이 가능하게 허용)
    @GetMapping("/test")
    public String corsTest(){
        return "corsTest";
    }
}
