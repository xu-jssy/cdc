package com.course.coursedesign2022.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecordTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordTimeExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBfztimeIsNull() {
            addCriterion("BfzTime is null");
            return (Criteria) this;
        }

        public Criteria andBfztimeIsNotNull() {
            addCriterion("BfzTime is not null");
            return (Criteria) this;
        }

        public Criteria andBfztimeEqualTo(Integer value) {
            addCriterion("BfzTime =", value, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeNotEqualTo(Integer value) {
            addCriterion("BfzTime <>", value, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeGreaterThan(Integer value) {
            addCriterion("BfzTime >", value, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BfzTime >=", value, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeLessThan(Integer value) {
            addCriterion("BfzTime <", value, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeLessThanOrEqualTo(Integer value) {
            addCriterion("BfzTime <=", value, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeIn(List<Integer> values) {
            addCriterion("BfzTime in", values, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeNotIn(List<Integer> values) {
            addCriterion("BfzTime not in", values, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeBetween(Integer value1, Integer value2) {
            addCriterion("BfzTime between", value1, value2, "bfztime");
            return (Criteria) this;
        }

        public Criteria andBfztimeNotBetween(Integer value1, Integer value2) {
            addCriterion("BfzTime not between", value1, value2, "bfztime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeIsNull() {
            addCriterion("YdgnTime is null");
            return (Criteria) this;
        }

        public Criteria andYdgntimeIsNotNull() {
            addCriterion("YdgnTime is not null");
            return (Criteria) this;
        }

        public Criteria andYdgntimeEqualTo(Integer value) {
            addCriterion("YdgnTime =", value, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeNotEqualTo(Integer value) {
            addCriterion("YdgnTime <>", value, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeGreaterThan(Integer value) {
            addCriterion("YdgnTime >", value, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("YdgnTime >=", value, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeLessThan(Integer value) {
            addCriterion("YdgnTime <", value, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeLessThanOrEqualTo(Integer value) {
            addCriterion("YdgnTime <=", value, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeIn(List<Integer> values) {
            addCriterion("YdgnTime in", values, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeNotIn(List<Integer> values) {
            addCriterion("YdgnTime not in", values, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeBetween(Integer value1, Integer value2) {
            addCriterion("YdgnTime between", value1, value2, "ydgntime");
            return (Criteria) this;
        }

        public Criteria andYdgntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("YdgnTime not between", value1, value2, "ydgntime");
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