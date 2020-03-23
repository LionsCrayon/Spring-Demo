package com.example.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * @version v1.0
 * @ProjectName: Spring-Demo
 * @ClassName: MyTest
 * @Description: TODO(Junit测试框架中，执行方法前先调用Before方法)
 * @Author: 89695
 * @Date: 2020/3/23 8:49
 */
public class MyTest {
 /*   @Before
    public void before()
    {
       System.out.println("执行before的方法。。。");
    }

    @After
    public void after()
    {
        System.out.println("执行after的方法。。。");
    }*/

    @Test
    public void sayhi()
    {
        System.out.println("say Hi");
    }

    @Test
    public void sayHello()
    {
        System.out.println("say Hello");
    }

    /**
     * 测试断言
     */
    @Test
    public void testAssert() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        assertEquals(obj1, obj2);

        assertSame(obj3, obj4);

        assertNotSame(obj2, obj4);

        assertNotNull(obj1);

        assertNull(obj5);

        assertTrue("为真", var1 == var2);

        assertArrayEquals(arithmetic1, arithmetic2);

    }
}
