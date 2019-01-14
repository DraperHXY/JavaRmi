package com.draper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:*spring.xml");
        System.out.println("RMI Server was start!");

        HelloService helloService = context.getBean("helloService", HelloService.class);
        System.out.println("helloMsg = " + helloService.getMsg());

    }

}
