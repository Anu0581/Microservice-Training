package com.example.demo.HelloController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloWorldController {
 
 @Value("${hello.string}")
 private String str; 
 @GetMapping("/test")	
 public String getResult() {
	return str;
	 
 }
 
	

}
