package com.briup.apps.poll.bean;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireQuestionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public QuestionnaireQuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdIsNull() {
            addCriterion("questionnaire_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdIsNotNull() {
            addCriterion("questionnaire_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdEqualTo(Long value) {
            addCriterion("questionnaire_id =", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdNotEqualTo(Long value) {
            addCriterion("questionnaire_id <>", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdGreaterThan(Long value) {
            addCriterion("questionnaire_id >", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdGreaterThanOrEqualTo(Long value) {
            addCriterion("questionnaire_id >=", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdLessThan(Long value) {
            addCriterion("questionnaire_id <", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdLessThanOrEqualTo(Long value) {
            addCriterion("questionnaire_id <=", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdIn(List<Long> values) {
            addCriterion("questionnaire_id in", values, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdNotIn(List<Long> values) {
            addCriterion("questionnaire_id not in", values, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdBetween(Long value1, Long value2) {
            addCriterion("questionnaire_id between", value1, value2, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdNotBetween(Long value1, Long value2) {
            addCriterion("questionnaire_id not between", value1, value2, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poll_qq
     *
     * @mbg.generated do_not_delete_during_merge Mon Jun 25 15:08:06 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poll_qq
     *
     * @mbg.generated Mon Jun 25 15:08:06 CST 2018
     */
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