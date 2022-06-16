package com.itheima.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Diyang Li
 * @create 2022-06-16 12:03 AM
 */
@SpringBootTest
public class FruitDAOTestCase {
    @Autowired
    private FruitDAO fruitDAO;
    @Test
    void testGetById() {
        System.out.println(fruitDAO.selectById(5));
    }
}
