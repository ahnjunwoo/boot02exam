package com.ahn.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	@Autowired
	ApplicationArguments arguments;
	/**
	 * --hello=Hello -hello=World => 이 메소드 가 hello world를 반환 retunr 에서 메세지를 조인해서 hello world라는 하나의 메시지로 출력
	 * @return
	 */
	/*public String getMsg() {
		List<String> userValues = arguments.getOptionValues("hello"); //hello 아큐먼트를 받아 문자열 조합하여 리턴
		return userValues.stream().collect(Collectors.joining(", "));
	}*/
	public String getMsg() {
		return "Hello";
	}
}
