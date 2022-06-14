package com.itheima.impl;

import com.itheima.dao.BookDAO;
import org.springframework.stereotype.Repository;

/**
 * @author Diyang Li
 * @create 2022-06-13 11:40 PM
 */
@Repository
public class BookImpl implements BookDAO {
    @Override
    public void save() {
        System.out.println("impl book dao.....");
    }
}
