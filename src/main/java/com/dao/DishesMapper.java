package com.dao;

import com.bean.Dishes;
import com.bean.DishesExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishesMapper {
    long countByExample(DishesExample example);

    int deleteByExample(DishesExample example);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    List<Dishes> selectByExample(DishesExample example);

    int updateByExampleSelective(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByExample(@Param("record") Dishes record, @Param("example") DishesExample example);
    
    BigDecimal selectIdByName(String dishName);
}