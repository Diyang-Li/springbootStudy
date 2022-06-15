package com.itheima;

import com.itheima.dao.FruitDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {
    @Autowired
    private FruitDAO fruitDAO;

    @Test
    void contextLoads() {
        System.out.println(fruitDAO.selectById(6));
        System.out.println(fruitDAO.selectList(null));
    }

}
