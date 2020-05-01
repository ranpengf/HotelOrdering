package com.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Dishes implements Serializable {
	private static final long serialVersionUID = 1L;
    private BigDecimal id;

    private String name;

    private String teste;

    private BigDecimal price;

    private Long monthsales;

    private Long totalsales;

    private BigDecimal rice;

    private String imageurl;

    private String description;

    private Long reviewcount;

    private Date creattime;
    
    private int count;
    
    private boolean subItem;
    
    


	public boolean getSubItem() {
		return subItem;
	}

	public void setSubItem(boolean subItem) {
		this.subItem = subItem;
	}



	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste == null ? null : teste.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getMonthsales() {
        return monthsales;
    }

    public void setMonthsales(Long monthsales) {
        this.monthsales = monthsales;
    }

    public Long getTotalsales() {
        return totalsales;
    }

    public void setTotalsales(Long totalsales) {
        this.totalsales = totalsales;
    }

    public BigDecimal getRice() {
        return rice;
    }

    public void setRice(BigDecimal rice) {
        this.rice = rice;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getReviewcount() {
        return reviewcount;
    }

    public void setReviewcount(Long reviewcount) {
        this.reviewcount = reviewcount;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}