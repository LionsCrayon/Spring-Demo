package com.example.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version v1.0
 * @ProjectName: Spring-Demo
 * @ClassName: MyTest
 * @Description: TODO(消息日志的使用)
 * @Author: 89695
 * @Date: 2020/3/23 9:28
 */
public class MyTest {
    public static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        logger.info("slf4j for info");
        logger.debug("slf4j for debug");
        logger.error("1/0");
        logger.warn("slf4j for warn");

        String message = "Hello SLF4J";
        logger.info("slf4j message is : {}", message);
    }
}
