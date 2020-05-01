package com.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClassifydishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassifydishesExample() {
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

        public Criteria andDishidIsNull() {
            addCriterion("DISHID is null");
            return (Criteria) this;
        }

        public Criteria andDishidIsNotNull() {
            addCriterion("DISHID is not null");
            return (Criteria) this;
        }

        public Criteria andDishidEqualTo(BigDecimal value) {
            addCriterion("DISHID =", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotEqualTo(BigDecimal value) {
            addCriterion("DISHID <>", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThan(BigDecimal value) {
            addCriterion("DISHID >", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISHID >=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThan(BigDecimal value) {
            addCriterion("DISHID <", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISHID <=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidIn(List<BigDecimal> values) {
            addCriterion("DISHID in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotIn(List<BigDecimal> values) {
            addCriterion("DISHID not in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISHID between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISHID not between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNull() {
            addCriterion("CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNotNull() {
            addCriterion("CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyidEqualTo(Long value) {
            addCriterion("CLASSIFYID =", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotEqualTo(Long value) {
            addCriterion("CLASSIFYID <>", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThan(Long value) {
            addCriterion("CLASSIFYID >", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThanOrEqualTo(Long value) {
            addCriterion("CLASSIFYID >=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThan(Long value) {
            addCriterion("CLASSIFYID <", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThanOrEqualTo(Long value) {
            addCriterion("CLASSIFYID <=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidIn(List<Long> values) {
            addCriterion("CLASSIFYID in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotIn(List<Long> values) {
            addCriterion("CLASSIFYID not in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidBetween(Long value1, Long value2) {
            addCriterion("CLASSIFYID between", value1, value2, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotBetween(Long value1, Long value2) {
            addCriterion("CLASSIFYID not between", value1, value2, "classifyid");
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