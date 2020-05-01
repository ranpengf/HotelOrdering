package com.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Userreview implements Serializable {
    private BigDecimal userid;

    private BigDecimal reviewid;

    private static final long serialVersionUID = 1L;

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getReviewid() {
        return reviewid;
    }

    public void setReviewid(BigDecimal reviewid) {
        this.reviewid = reviewid;
    }
}