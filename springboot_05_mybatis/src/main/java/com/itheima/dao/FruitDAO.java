package com.itheima.dao;

import com.itheima.domain.Fruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.annotation.ManagedBean;

/**
 * @author Diyang Li
 * @create 2022-06-14 10:32 PM
 */
@Mapper
public interface FruitDAO {
    @Select("select * from t_fruit where fid = #{id}")
    Fruit getFruit(int id);
}
