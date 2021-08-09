package com.example.service.impl;

import com.example.SpringBootTestApplication;
import com.example.service.HelloService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * <h3></h3>
 *
 * @author zohar
 * @version 1.0
 * 2021/8/9 21:22:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestApplication.class)
public class HelloServiceImplTest {

    @Autowired
    private HelloService helloService;

    @Before
    public void setUp() {
        // 测试之前执行
        System.out.println("Test started.");
//        helloService = new HelloServiceImpl();
    }

    @After
    public void tearDown() {
        System.out.println("Test finished.");
    }

    @Test
    public void helloTo() {
        assertEquals("HELLO WORLD", helloService.helloTo(""));
        assertEquals("HELLO WORLD", helloService.helloTo("WORLD"));
        assertEquals("HELLO JAVA", helloService.helloTo("JAVA"));
        assertEquals("HELLO C++", helloService.helloTo("C++")); // 出错

    }
}