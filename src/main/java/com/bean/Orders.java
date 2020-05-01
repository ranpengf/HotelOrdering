package com.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orders implements Serializable {
    private BigDecimal id;

    private BigDecimal userid;

    private BigDecimal amount;

    private String ordernum;

    private Date createdate;

    private String inrestaurant;

    private String roomid;

    private String status;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getInrestaurant() {
        return inrestaurant;
    }

    public void setInrestaurant(String inrestaurant) {
        this.inrestaurant = inrestaurant == null ? null : inrestaurant.trim();
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}