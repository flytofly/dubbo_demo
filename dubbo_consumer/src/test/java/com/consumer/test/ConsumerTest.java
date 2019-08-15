package com.consumer.test;

import com.api.service.DemoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author:wangkeke
 * @Date: 2019/8/14 0014下午 6:03
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        context.start();

        DemoApi demoApi = (DemoApi) context.getBean("demoApi");
        System.out.println(demoApi.SayHello());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
