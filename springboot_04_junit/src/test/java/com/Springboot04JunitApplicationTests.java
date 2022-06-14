package com;

import com.itheima.Springboot04JunitApplication;
import com.itheima.dao.BookDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot04JunitApplication.class)


class Springboot04JunitApplicationTests {
    @Autowired
    private BookDAO bookDAO;
    @Test
    void contextLoads() {
        System.out.println("this is test....");
        bookDAO.save();
    }

}
