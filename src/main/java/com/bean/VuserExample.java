package com.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VuserExample() {
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

        public Criteria andRelnameIsNull() {
            addCriterion("RELNAME is null");
            return (Criteria) this;
        }

        public Criteria andRelnameIsNotNull() {
            addCriterion("RELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRelnameEqualTo(String value) {
            addCriterion("RELNAME =", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotEqualTo(String value) {
            addCriterion("RELNAME <>", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameGreaterThan(String value) {
            addCriterion("RELNAME >", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameGreaterThanOrEqualTo(String value) {
            addCriterion("RELNAME >=", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameLessThan(String value) {
            addCriterion("RELNAME <", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameLessThanOrEqualTo(String value) {
            addCriterion("RELNAME <=", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameLike(String value) {
            addCriterion("RELNAME like", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotLike(String value) {
            addCriterion("RELNAME not like", value, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameIn(List<String> values) {
            addCriterion("RELNAME in", values, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotIn(List<String> values) {
            addCriterion("RELNAME not in", values, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameBetween(String value1, String value2) {
            addCriterion("RELNAME between", value1, value2, "relname");
            return (Criteria) this;
        }

        public Criteria andRelnameNotBetween(String value1, String value2) {
            addCriterion("RELNAME not between", value1, value2, "relname");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("PHONENUM is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("PHONENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("PHONENUM =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("PHONENUM <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("PHONENUM >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("PHONENUM >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("PHONENUM <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("PHONENUM <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("PHONENUM like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("PHONENUM not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("PHONENUM in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("PHONENUM not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("PHONENUM between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("PHONENUM not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andViplevIsNull() {
            addCriterion("VIPLEV is null");
            return (Criteria) this;
        }

        public Criteria andViplevIsNotNull() {
            addCriterion("VIPLEV is not null");
            return (Criteria) this;
        }

        public Criteria andViplevEqualTo(Integer value) {
            addCriterion("VIPLEV =", value, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevNotEqualTo(Integer value) {
            addCriterion("VIPLEV <>", value, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevGreaterThan(Integer value) {
            addCriterion("VIPLEV >", value, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIPLEV >=", value, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevLessThan(Integer value) {
            addCriterion("VIPLEV <", value, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevLessThanOrEqualTo(Integer value) {
            addCriterion("VIPLEV <=", value, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevIn(List<Integer> values) {
            addCriterion("VIPLEV in", values, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevNotIn(List<Integer> values) {
            addCriterion("VIPLEV not in", values, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevBetween(Integer value1, Integer value2) {
            addCriterion("VIPLEV between", value1, value2, "viplev");
            return (Criteria) this;
        }

        public Criteria andViplevNotBetween(Integer value1, Integer value2) {
            addCriterion("VIPLEV not between", value1, value2, "viplev");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andRegisdateIsNull() {
            addCriterion("REGISDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisdateIsNotNull() {
            addCriterion("REGISDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisdateEqualTo(Date value) {
            addCriterionForJDBCDate("REGISDATE =", value, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REGISDATE <>", value, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateGreaterThan(Date value) {
            addCriterionForJDBCDate("REGISDATE >", value, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGISDATE >=", value, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateLessThan(Date value) {
            addCriterionForJDBCDate("REGISDATE <", value, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REGISDATE <=", value, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateIn(List<Date> values) {
            addCriterionForJDBCDate("REGISDATE in", values, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REGISDATE not in", values, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGISDATE between", value1, value2, "regisdate");
            return (Criteria) this;
        }

        public Criteria andRegisdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REGISDATE not between", value1, value2, "regisdate");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("AVATAR is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("AVATAR is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("AVATAR =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("AVATAR <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("AVATAR >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("AVATAR >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("AVATAR <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("AVATAR <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("AVATAR like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("AVATAR not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("AVATAR in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("AVATAR not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("AVATAR between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("AVATAR not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andBackuponeIsNull() {
            addCriterion("BACKUPONE is null");
            return (Criteria) this;
        }

        public Criteria andBackuponeIsNotNull() {
            addCriterion("BACKUPONE is not null");
            return (Criteria) this;
        }

        public Criteria andBackuponeEqualTo(String value) {
            addCriterion("BACKUPONE =", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeNotEqualTo(String value) {
            addCriterion("BACKUPONE <>", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeGreaterThan(String value) {
            addCriterion("BACKUPONE >", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeGreaterThanOrEqualTo(String value) {
            addCriterion("BACKUPONE >=", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeLessThan(String value) {
            addCriterion("BACKUPONE <", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeLessThanOrEqualTo(String value) {
            addCriterion("BACKUPONE <=", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeLike(String value) {
            addCriterion("BACKUPONE like", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeNotLike(String value) {
            addCriterion("BACKUPONE not like", value, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeIn(List<String> values) {
            addCriterion("BACKUPONE in", values, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeNotIn(List<String> values) {
            addCriterion("BACKUPONE not in", values, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeBetween(String value1, String value2) {
            addCriterion("BACKUPONE between", value1, value2, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuponeNotBetween(String value1, String value2) {
            addCriterion("BACKUPONE not between", value1, value2, "backupone");
            return (Criteria) this;
        }

        public Criteria andBackuptwoIsNull() {
            addCriterion("BACKUPTWO is null");
            return (Criteria) this;
        }

        public Criteria andBackuptwoIsNotNull() {
            addCriterion("BACKUPTWO is not null");
            return (Criteria) this;
        }

        public Criteria andBackuptwoEqualTo(String value) {
            addCriterion("BACKUPTWO =", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoNotEqualTo(String value) {
            addCriterion("BACKUPTWO <>", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoGreaterThan(String value) {
            addCriterion("BACKUPTWO >", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoGreaterThanOrEqualTo(String value) {
            addCriterion("BACKUPTWO >=", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoLessThan(String value) {
            addCriterion("BACKUPTWO <", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoLessThanOrEqualTo(String value) {
            addCriterion("BACKUPTWO <=", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoLike(String value) {
            addCriterion("BACKUPTWO like", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoNotLike(String value) {
            addCriterion("BACKUPTWO not like", value, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoIn(List<String> values) {
            addCriterion("BACKUPTWO in", values, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoNotIn(List<String> values) {
            addCriterion("BACKUPTWO not in", values, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoBetween(String value1, String value2) {
            addCriterion("BACKUPTWO between", value1, value2, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackuptwoNotBetween(String value1, String value2) {
            addCriterion("BACKUPTWO not between", value1, value2, "backuptwo");
            return (Criteria) this;
        }

        public Criteria andBackupthreeIsNull() {
            addCriterion("BACKUPTHREE is null");
            return (Criteria) this;
        }

        public Criteria andBackupthreeIsNotNull() {
            addCriterion("BACKUPTHREE is not null");
            return (Criteria) this;
        }

        public Criteria andBackupthreeEqualTo(String value) {
            addCriterion("BACKUPTHREE =", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeNotEqualTo(String value) {
            addCriterion("BACKUPTHREE <>", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeGreaterThan(String value) {
            addCriterion("BACKUPTHREE >", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeGreaterThanOrEqualTo(String value) {
            addCriterion("BACKUPTHREE >=", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeLessThan(String value) {
            addCriterion("BACKUPTHREE <", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeLessThanOrEqualTo(String value) {
            addCriterion("BACKUPTHREE <=", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeLike(String value) {
            addCriterion("BACKUPTHREE like", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeNotLike(String value) {
            addCriterion("BACKUPTHREE not like", value, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeIn(List<String> values) {
            addCriterion("BACKUPTHREE in", values, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeNotIn(List<String> values) {
            addCriterion("BACKUPTHREE not in", values, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeBetween(String value1, String value2) {
            addCriterion("BACKUPTHREE between", value1, value2, "backupthree");
            return (Criteria) this;
        }

        public Criteria andBackupthreeNotBetween(String value1, String value2) {
            addCriterion("BACKUPTHREE not between", value1, value2, "backupthree");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("ISADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("ISADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(String value) {
            addCriterion("ISADMIN =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(String value) {
            addCriterion("ISADMIN <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(String value) {
            addCriterion("ISADMIN >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(String value) {
            addCriterion("ISADMIN >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(String value) {
            addCriterion("ISADMIN <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(String value) {
            addCriterion("ISADMIN <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLike(String value) {
            addCriterion("ISADMIN like", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotLike(String value) {
            addCriterion("ISADMIN not like", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<String> values) {
            addCriterion("ISADMIN in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<String> values) {
            addCriterion("ISADMIN not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(String value1, String value2) {
            addCriterion("ISADMIN between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(String value1, String value2) {
            addCriterion("ISADMIN not between", value1, value2, "isadmin");
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