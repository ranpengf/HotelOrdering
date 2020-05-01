package com.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTesteIsNull() {
            addCriterion("TESTE is null");
            return (Criteria) this;
        }

        public Criteria andTesteIsNotNull() {
            addCriterion("TESTE is not null");
            return (Criteria) this;
        }

        public Criteria andTesteEqualTo(String value) {
            addCriterion("TESTE =", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteNotEqualTo(String value) {
            addCriterion("TESTE <>", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteGreaterThan(String value) {
            addCriterion("TESTE >", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteGreaterThanOrEqualTo(String value) {
            addCriterion("TESTE >=", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteLessThan(String value) {
            addCriterion("TESTE <", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteLessThanOrEqualTo(String value) {
            addCriterion("TESTE <=", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteLike(String value) {
            addCriterion("TESTE like", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteNotLike(String value) {
            addCriterion("TESTE not like", value, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteIn(List<String> values) {
            addCriterion("TESTE in", values, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteNotIn(List<String> values) {
            addCriterion("TESTE not in", values, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteBetween(String value1, String value2) {
            addCriterion("TESTE between", value1, value2, "teste");
            return (Criteria) this;
        }

        public Criteria andTesteNotBetween(String value1, String value2) {
            addCriterion("TESTE not between", value1, value2, "teste");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMonthsalesIsNull() {
            addCriterion("MONTHSALES is null");
            return (Criteria) this;
        }

        public Criteria andMonthsalesIsNotNull() {
            addCriterion("MONTHSALES is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsalesEqualTo(Long value) {
            addCriterion("MONTHSALES =", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesNotEqualTo(Long value) {
            addCriterion("MONTHSALES <>", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesGreaterThan(Long value) {
            addCriterion("MONTHSALES >", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesGreaterThanOrEqualTo(Long value) {
            addCriterion("MONTHSALES >=", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesLessThan(Long value) {
            addCriterion("MONTHSALES <", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesLessThanOrEqualTo(Long value) {
            addCriterion("MONTHSALES <=", value, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesIn(List<Long> values) {
            addCriterion("MONTHSALES in", values, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesNotIn(List<Long> values) {
            addCriterion("MONTHSALES not in", values, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesBetween(Long value1, Long value2) {
            addCriterion("MONTHSALES between", value1, value2, "monthsales");
            return (Criteria) this;
        }

        public Criteria andMonthsalesNotBetween(Long value1, Long value2) {
            addCriterion("MONTHSALES not between", value1, value2, "monthsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNull() {
            addCriterion("TOTALSALES is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNotNull() {
            addCriterion("TOTALSALES is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesEqualTo(Long value) {
            addCriterion("TOTALSALES =", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotEqualTo(Long value) {
            addCriterion("TOTALSALES <>", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThan(Long value) {
            addCriterion("TOTALSALES >", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTALSALES >=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThan(Long value) {
            addCriterion("TOTALSALES <", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThanOrEqualTo(Long value) {
            addCriterion("TOTALSALES <=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIn(List<Long> values) {
            addCriterion("TOTALSALES in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotIn(List<Long> values) {
            addCriterion("TOTALSALES not in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesBetween(Long value1, Long value2) {
            addCriterion("TOTALSALES between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotBetween(Long value1, Long value2) {
            addCriterion("TOTALSALES not between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andRiceIsNull() {
            addCriterion("RICE is null");
            return (Criteria) this;
        }

        public Criteria andRiceIsNotNull() {
            addCriterion("RICE is not null");
            return (Criteria) this;
        }

        public Criteria andRiceEqualTo(BigDecimal value) {
            addCriterion("RICE =", value, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceNotEqualTo(BigDecimal value) {
            addCriterion("RICE <>", value, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceGreaterThan(BigDecimal value) {
            addCriterion("RICE >", value, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICE >=", value, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceLessThan(BigDecimal value) {
            addCriterion("RICE <", value, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICE <=", value, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceIn(List<BigDecimal> values) {
            addCriterion("RICE in", values, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceNotIn(List<BigDecimal> values) {
            addCriterion("RICE not in", values, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICE between", value1, value2, "rice");
            return (Criteria) this;
        }

        public Criteria andRiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICE not between", value1, value2, "rice");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("IMAGEURL is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("IMAGEURL is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("IMAGEURL =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("IMAGEURL <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("IMAGEURL >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGEURL >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("IMAGEURL <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("IMAGEURL <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("IMAGEURL like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("IMAGEURL not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("IMAGEURL in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("IMAGEURL not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("IMAGEURL between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("IMAGEURL not between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andReviewcountIsNull() {
            addCriterion("REVIEWCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReviewcountIsNotNull() {
            addCriterion("REVIEWCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewcountEqualTo(Long value) {
            addCriterion("REVIEWCOUNT =", value, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountNotEqualTo(Long value) {
            addCriterion("REVIEWCOUNT <>", value, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountGreaterThan(Long value) {
            addCriterion("REVIEWCOUNT >", value, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountGreaterThanOrEqualTo(Long value) {
            addCriterion("REVIEWCOUNT >=", value, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountLessThan(Long value) {
            addCriterion("REVIEWCOUNT <", value, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountLessThanOrEqualTo(Long value) {
            addCriterion("REVIEWCOUNT <=", value, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountIn(List<Long> values) {
            addCriterion("REVIEWCOUNT in", values, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountNotIn(List<Long> values) {
            addCriterion("REVIEWCOUNT not in", values, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountBetween(Long value1, Long value2) {
            addCriterion("REVIEWCOUNT between", value1, value2, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andReviewcountNotBetween(Long value1, Long value2) {
            addCriterion("REVIEWCOUNT not between", value1, value2, "reviewcount");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("CREATTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("CREATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATTIME >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATTIME <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATTIME <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATTIME in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATTIME not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATTIME between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATTIME not between", value1, value2, "creattime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}