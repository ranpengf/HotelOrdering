package com.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.bean.Dishes;
import com.bean.OrderInfo;
import com.bean.OrderQC;
import com.bean.Orders;

public interface OrderService {
	
	public List<OrderInfo> showAllOrders(String ordernum, String customerName, String custPhoneNum, BigDecimal amount,
			Date createdate,String status);
	
	
	public String addOrder(BigDecimal userid , BigDecimal amount,List<Dishes> list,Date createTime, String roomid);
	
	
	public void delOrder(String ordernum);
	
	
	public List<OrderInfo> ShowMyOrders(  String custPhoneNum, BigDecimal amount,
			Date createdate,String status);
	
	public void update(Orders order);

}
