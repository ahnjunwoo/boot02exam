package com.ahn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahn.user.HelloService;
import com.ahn.user.UserService;

@SpringBootApplication
@RestController
public class Boot2ExamApplication {

	@Autowired
	UserService userService;
	@Autowired
	HelloService helloService;
	@RequestMapping("/")
	public String user() {
		return  userService.getMsg();
	}
	@RequestMapping("/hello")
	public String hello() {
		return  helloService.getMsg();
	}
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Boot2ExamApplication.class);
		application.run(args);
	}
}
