package com.example.controller;

import com.example.service.HelloService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3></h3>
 *
 * @author zohar
 * @version 1.0
 * 2021/8/4 17:33:23
 */
@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("hello")
    public String sayHello(@RequestParam String name) {
        return helloService.helloTo(name);
    }
}
