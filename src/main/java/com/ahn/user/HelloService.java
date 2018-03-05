package com.ahn.user;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String getMsg() {
		return "Helloservice";
	}
}
