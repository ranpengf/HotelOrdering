package com.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Classifydishes implements Serializable {
    private BigDecimal dishid;

    private Long classifyid;

    private static final long serialVersionUID = 1L;

    public BigDecimal getDishid() {
        return dishid;
    }

    public void setDishid(BigDecimal dishid) {
        this.dishid = dishid;
    }

    public Long getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(Long classifyid) {
        this.classifyid = classifyid;
    }
}