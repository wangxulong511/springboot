package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  //标注这是一个spring Boot 的应用程序
@RestController			//标注这是一个控制权类
public class DemoApplication {
	@RequestMapping("/")  //设置访问的跟路径
	String say(){
		return "你好，欢迎来到spring boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
