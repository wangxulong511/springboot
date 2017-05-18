package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangxulong on 2017/4/19.
 */
//标注这是一个springboot的应用程序
@SpringBootApplication
//标注这是一个rest的控制器
@RestController
public class SpringBootHello {
    //请求映射的url地址
    @RequestMapping("/")
    String home(){
        return "<h1 style='color:red'>spring boot 飞一般的感觉，一切就是这么简单<h1>";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHello.class, args);
    }
}
