package com.dao;

import com.bean.Orderdish;
import com.bean.OrderdishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdishMapper {
    long countByExample(OrderdishExample example);

    int deleteByExample(OrderdishExample example);

    int insert(Orderdish record);

    int insertSelective(Orderdish record);

    List<Orderdish> selectByExample(OrderdishExample example);

    int updateByExampleSelective(@Param("record") Orderdish record, @Param("example") OrderdishExample example);

    int updateByExample(@Param("record") Orderdish record, @Param("example") OrderdishExample example);
}