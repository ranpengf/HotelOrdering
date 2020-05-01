package com.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class OrderQC {
	
	private String ordernum;
	private String customerName; 
	private String custPhoneNum;
	private BigDecimal amount;
	private Date createdate;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustPhoneNum() {
		return custPhoneNum;
	}
	public void setCustPhoneNum(String custPhoneNum) {
		this.custPhoneNum = custPhoneNum;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}
