package com.draper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:*spring.xml");
        System.out.println("Load ApplicationContext complete");
        HelloService helloService = (HelloService) context.getBean("rmiProxyFactory");
        System.out.println(helloService.getMsg());

        Object o = new Object();
        synchronized (o){
            o.wait();
        }

    }

}
