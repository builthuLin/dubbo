package com.layduo.dubbo.consumer;

import com.layduo.dubbo.demo.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    //使用@Reference注解注入dubbo服务

    public static void main(String[] args){
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        logger.info("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        logger.info("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
