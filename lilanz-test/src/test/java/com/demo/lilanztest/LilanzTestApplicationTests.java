package com.demo.lilanztest;


import com.demo.lilanztest.util.TestUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LilanzTestApplicationTests {

    @Autowired
    TestUtil testUtil;

    @Test
    void contextLoads() {
        System.out.println("abc======"+testUtil.getWxabc());
    }

}
