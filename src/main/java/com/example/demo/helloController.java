package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello! spring boot 안녕 바이바이";
	}
}
