package com.itheima;

import com.itheima.dao.FruitDAO;
import com.itheima.domain.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {
    @Autowired
    private FruitDAO fruitDAO;
    @Test
    void contextLoads() {
        System.out.println(fruitDAO.getFruit(5));
    }

}
