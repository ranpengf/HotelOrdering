package com.dao;

import com.bean.OrderInfo;
import com.bean.OrderQC;
import com.bean.Orders;
import com.bean.OrdersExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);
    
    List<OrderInfo> selectByQc(OrderQC orderqc);
    
    BigDecimal selectIdByNum(String orderNum);
    
    void delByNum(String orderNum);
}