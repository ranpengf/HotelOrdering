package com.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReviewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewsExample() {
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

        public Criteria andOrdernumIsNull() {
            addCriterion("ORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(String value) {
            addCriterion("ORDERNUM =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(String value) {
            addCriterion("ORDERNUM <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(String value) {
            addCriterion("ORDERNUM >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERNUM >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(String value) {
            addCriterion("ORDERNUM <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(String value) {
            addCriterion("ORDERNUM <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLike(String value) {
            addCriterion("ORDERNUM like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotLike(String value) {
            addCriterion("ORDERNUM not like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<String> values) {
            addCriterion("ORDERNUM in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<String> values) {
            addCriterion("ORDERNUM not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(String value1, String value2) {
            addCriterion("ORDERNUM between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(String value1, String value2) {
            addCriterion("ORDERNUM not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andPeoplenameIsNull() {
            addCriterion("PEOPLENAME is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenameIsNotNull() {
            addCriterion("PEOPLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenameEqualTo(String value) {
            addCriterion("PEOPLENAME =", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameNotEqualTo(String value) {
            addCriterion("PEOPLENAME <>", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameGreaterThan(String value) {
            addCriterion("PEOPLENAME >", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameGreaterThanOrEqualTo(String value) {
            addCriterion("PEOPLENAME >=", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameLessThan(String value) {
            addCriterion("PEOPLENAME <", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameLessThanOrEqualTo(String value) {
            addCriterion("PEOPLENAME <=", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameLike(String value) {
            addCriterion("PEOPLENAME like", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameNotLike(String value) {
            addCriterion("PEOPLENAME not like", value, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameIn(List<String> values) {
            addCriterion("PEOPLENAME in", values, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameNotIn(List<String> values) {
            addCriterion("PEOPLENAME not in", values, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameBetween(String value1, String value2) {
            addCriterion("PEOPLENAME between", value1, value2, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplenameNotBetween(String value1, String value2) {
            addCriterion("PEOPLENAME not between", value1, value2, "peoplename");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneIsNull() {
            addCriterion("PEOPLEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneIsNotNull() {
            addCriterion("PEOPLEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneEqualTo(String value) {
            addCriterion("PEOPLEPHONE =", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotEqualTo(String value) {
            addCriterion("PEOPLEPHONE <>", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneGreaterThan(String value) {
            addCriterion("PEOPLEPHONE >", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneGreaterThanOrEqualTo(String value) {
            addCriterion("PEOPLEPHONE >=", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneLessThan(String value) {
            addCriterion("PEOPLEPHONE <", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneLessThanOrEqualTo(String value) {
            addCriterion("PEOPLEPHONE <=", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneLike(String value) {
            addCriterion("PEOPLEPHONE like", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotLike(String value) {
            addCriterion("PEOPLEPHONE not like", value, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneIn(List<String> values) {
            addCriterion("PEOPLEPHONE in", values, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotIn(List<String> values) {
            addCriterion("PEOPLEPHONE not in", values, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneBetween(String value1, String value2) {
            addCriterion("PEOPLEPHONE between", value1, value2, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andPeoplephoneNotBetween(String value1, String value2) {
            addCriterion("PEOPLEPHONE not between", value1, value2, "peoplephone");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReviewlevIsNull() {
            addCriterion("REVIEWLEV is null");
            return (Criteria) this;
        }

        public Criteria andReviewlevIsNotNull() {
            addCriterion("REVIEWLEV is not null");
            return (Criteria) this;
        }

        public Criteria andReviewlevEqualTo(Integer value) {
            addCriterion("REVIEWLEV =", value, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevNotEqualTo(Integer value) {
            addCriterion("REVIEWLEV <>", value, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevGreaterThan(Integer value) {
            addCriterion("REVIEWLEV >", value, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEWLEV >=", value, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevLessThan(Integer value) {
            addCriterion("REVIEWLEV <", value, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEWLEV <=", value, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevIn(List<Integer> values) {
            addCriterion("REVIEWLEV in", values, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevNotIn(List<Integer> values) {
            addCriterion("REVIEWLEV not in", values, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevBetween(Integer value1, Integer value2) {
            addCriterion("REVIEWLEV between", value1, value2, "reviewlev");
            return (Criteria) this;
        }

        public Criteria andReviewlevNotBetween(Integer value1, Integer value2) {
            addCriterion("REVIEWLEV not between", value1, value2, "reviewlev");
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