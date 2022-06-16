package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Fruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Diyang Li
 * @create 2022-06-16 12:00 AM
 */

@Mapper
public interface FruitDAO extends BaseMapper<Fruit> {

}
