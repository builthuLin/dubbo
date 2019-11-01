package com.layduo.dubbo.demo.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {

    private static final Logger logger = LoggerFactory.getLogger(Provider.class);

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        logger.info(context.getDisplayName() + ": here");
        context.start();
        logger.info("服务已经启动...");
        System.in.read();
    }
}
