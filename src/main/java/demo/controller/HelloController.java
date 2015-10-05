package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.pojo.Message;

@RestController
public class HelloController {

	@RequestMapping("/")
	public Message hello() {
		return new Message("Spring Boot says hello");
	}

}
