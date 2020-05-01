package com.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reviews implements Serializable {
    private BigDecimal id;

    private String ordernum;

    private String peoplename;

    private String peoplephone;

    private String content;

    private Integer reviewlev;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getPeoplename() {
        return peoplename;
    }

    public void setPeoplename(String peoplename) {
        this.peoplename = peoplename == null ? null : peoplename.trim();
    }

    public String getPeoplephone() {
        return peoplephone;
    }

    public void setPeoplephone(String peoplephone) {
        this.peoplephone = peoplephone == null ? null : peoplephone.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getReviewlev() {
        return reviewlev;
    }

    public void setReviewlev(Integer reviewlev) {
        this.reviewlev = reviewlev;
    }
}