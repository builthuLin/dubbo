package com.layduo.dubbo.consumer;

import com.layduo.dubbo.demo.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        logger.info("consumer1 start");
        DemoService demoService = context.getBean(DemoService.class);
        logger.info("consumer1");
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(demoService.getDataList(list));
    }
}
