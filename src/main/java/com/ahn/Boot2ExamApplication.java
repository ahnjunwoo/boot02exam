package com.ahn;

import com.ahn.user.ToolsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahn.user.HelloService;
import com.ahn.user.UserService;

import javax.validation.Valid;

@SpringBootApplication
@RestController
public class Boot2ExamApplication {

	@Autowired
	UserService userService;
	@Autowired
	HelloService helloService;
	@Bean
	@ConfigurationProperties("tools")
	@Validated
	public ToolsProperties toolsProperties(){
		return new ToolsProperties();
	}
	@RequestMapping("/")
	public String user() {
		return  userService.getMsg();
	}
	@RequestMapping("/hello")
	public String hello() {
		System.out.println(toolsProperties().getNumber());
		System.out.println(toolsProperties().getFooBar());
		System.out.println(toolsProperties().getWhereToGo());
		System.out.println(toolsProperties().getName());
		return  helloService.getMsg();
	}
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Boot2ExamApplication.class);
		application.run(args);
	}
}
