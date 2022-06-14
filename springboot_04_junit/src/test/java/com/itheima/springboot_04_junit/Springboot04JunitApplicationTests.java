package com.itheima.springboot_04_junit;

import com.itheima.dao.BookDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {
    @Autowired
    private BookDAO bookDAO;
    @Test
    void contextLoads() {
        System.out.println("this is test....");
        bookDAO.save();
    }

}
