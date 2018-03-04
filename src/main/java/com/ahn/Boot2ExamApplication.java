package com.ahn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahn.user.UserService;

@SpringBootApplication
@RestController
public class Boot2ExamApplication {

	@Autowired
	UserService service;
	@RequestMapping("/")
	public String hello() {
		return  service.getMsg();
	}
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Boot2ExamApplication.class);
		application.run(args);
	}
}
