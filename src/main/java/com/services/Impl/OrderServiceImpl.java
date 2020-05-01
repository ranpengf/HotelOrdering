package com.services.Impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.DishDitail;
import com.bean.Dishes;
import com.bean.OrderInfo;
import com.bean.OrderQC;
import com.bean.Orderdish;
import com.bean.OrderdishExample;
import com.bean.Orders;
import com.bean.OrdersExample;
import com.dao.DishesMapper;
import com.dao.OrderdishMapper;
import com.dao.OrdersMapper;
import com.dao.VuserMapper;
import com.services.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrdersMapper ordersMapper;
	
	@Autowired
	OrderQC orderqc;
	
	@Autowired
	VuserMapper userMapper;
	
	@Autowired
	OrderdishMapper orderdishMapper;
	
	@Autowired
	DishesMapper dishmapper;
	
	

	@Override
	public List<OrderInfo> showAllOrders(String ordernum, String customerName, String custPhoneNum, BigDecimal amount,
			Date createdate,String status) {
		orderqc.setAmount(amount);
		orderqc.setCreatedate(createdate);
		orderqc.setCustomerName(customerName);
		orderqc.setCustPhoneNum(custPhoneNum);
		
		orderqc.setOrdernum(ordernum);
		
		List<OrderInfo> list = ordersMapper.selectByQc(orderqc);
		
		
		return list;
	}




	public static String generateOrderNum(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String result= "";
		String date = sdf.format(new Date());
		Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
		return result+date;
	}


	@Override
	public void delOrder(String ordernum) {
		BigDecimal orderid = ordersMapper.selectIdByNum(ordernum);
		OrderdishExample example = new OrderdishExample();
		example.createCriteria().andOrderidEqualTo(orderid);
		orderdishMapper.deleteByExample(example);
		ordersMapper.delByNum(ordernum);
		
	}


	@Override
	public List<OrderInfo> ShowMyOrders( String custPhoneNum, BigDecimal amount, Date createdate,String status) {
		OrderQC orderqc = new OrderQC();
		orderqc.setAmount(amount);
		orderqc.setCreatedate(createdate);
		orderqc.setCustPhoneNum(custPhoneNum);
		orderqc.setStatus(status);
		List<OrderInfo> selectByQc = ordersMapper.selectByQc(orderqc);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		for(OrderInfo order : selectByQc){
			Date createdate2 = order.getCreatedate();
			order.setDate(sdf.format(createdate2));
			String status2 = order.getStatus();
			List<DishDitail> dishes = order.getDishes();
			String content="购买";
			for(DishDitail dish : dishes){
				content=content+" "+dish.getDishcount()+"份"+dish.getName();
			}
			switch (status2) {
			case "1":
				order.setStatus("待支付");
				break;
			case "2":
				order.setStatus("已支付");
				break;
			case "3":
				order.setStatus("已完成");
				break;
			case "4":
				order.setStatus("已退订");
				break;
			default:
				break;
			}
			order.setContent(content);
		}
		return selectByQc;
	}


	@Override
	public String addOrder(BigDecimal userid, BigDecimal amount, List<Dishes> list, Date createTime, String roomid) {
		Orders order = new Orders();
		order.setAmount(amount);
		Calendar cal = Calendar.getInstance();  
        System.out.println(cal.getTime().getTime());  
        String string="2012-01-01 01:02:03";  
    	SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
    	try {
			order.setCreatedate(sp.parse(string));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}  
		order.setUserid(userid);
		order.setRoomid(roomid);
		String ordernum =generateOrderNum();
		order.setOrdernum(ordernum);
		order.setStatus("1");
		ordersMapper.insert(order);
		BigDecimal orderid = ordersMapper.selectIdByNum(ordernum);
		for(Dishes dish:list){
			Orderdish orderdish = new Orderdish();
			BigDecimal id = dishmapper.selectIdByName(dish.getName());
			orderdish.setDishcount(Long.valueOf(dish.getCount()));
			orderdish.setOrderid(orderid);
			orderdish.setDishid(id);
			orderdishMapper.insert(orderdish);
		}
		return ordernum;
		
	}




	@Override
	public void update(Orders order) {
		OrdersExample example = new OrdersExample();
		example.createCriteria().andOrdernumEqualTo(order.getOrdernum());
		
		ordersMapper.updateByExampleSelective(order, example);
		
	}


	
	
	

}
