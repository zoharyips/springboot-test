package com.example.service.impl;

import com.example.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <h3></h3>
 *
 * @author zohar
 * @version 1.0
 * 2021/8/9 20:58:59
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String helloTo(String name) {
        // Bug
        if ("C++".equals(name))
            return "FUCK C++";
        return StringUtils.hasText(name) ? "HELLO " + name : "HELLO WORLD";
    }
}
