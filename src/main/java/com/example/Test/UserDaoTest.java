package com.example.Test;

import com.example.Uerdao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version v1.0
 * @ProjectName: Spring-Demo
 * @ClassName: UserDaoTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/3/23 8:33
 */
public class UserDaoTest {
    @Test
    public void SpringTest()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.say();
    }
}
