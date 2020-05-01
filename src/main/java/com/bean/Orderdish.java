package com.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Orderdish implements Serializable {
    private BigDecimal orderid;

    private BigDecimal dishid;

    private Long dishcount;
    
    private String dishname;

    public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	private static final long serialVersionUID = 1L;

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getDishid() {
        return dishid;
    }

    public void setDishid(BigDecimal dishid) {
        this.dishid = dishid;
    }

    public Long getDishcount() {
        return dishcount;
    }

    public void setDishcount(Long dishcount) {
        this.dishcount = dishcount;
    }
}