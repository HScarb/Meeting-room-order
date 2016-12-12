package com.mtr.model;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public MeetingRoomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
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
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDeskIsNull() {
            addCriterion("DESK is null");
            return (Criteria) this;
        }

        public Criteria andDeskIsNotNull() {
            addCriterion("DESK is not null");
            return (Criteria) this;
        }

        public Criteria andDeskEqualTo(Boolean value) {
            addCriterion("DESK =", value, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskNotEqualTo(Boolean value) {
            addCriterion("DESK <>", value, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskGreaterThan(Boolean value) {
            addCriterion("DESK >", value, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DESK >=", value, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskLessThan(Boolean value) {
            addCriterion("DESK <", value, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskLessThanOrEqualTo(Boolean value) {
            addCriterion("DESK <=", value, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskIn(List<Boolean> values) {
            addCriterion("DESK in", values, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskNotIn(List<Boolean> values) {
            addCriterion("DESK not in", values, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskBetween(Boolean value1, Boolean value2) {
            addCriterion("DESK between", value1, value2, "desk");
            return (Criteria) this;
        }

        public Criteria andDeskNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DESK not between", value1, value2, "desk");
            return (Criteria) this;
        }

        public Criteria andMediaIsNull() {
            addCriterion("MEDIA is null");
            return (Criteria) this;
        }

        public Criteria andMediaIsNotNull() {
            addCriterion("MEDIA is not null");
            return (Criteria) this;
        }

        public Criteria andMediaEqualTo(Boolean value) {
            addCriterion("MEDIA =", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotEqualTo(Boolean value) {
            addCriterion("MEDIA <>", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaGreaterThan(Boolean value) {
            addCriterion("MEDIA >", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MEDIA >=", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaLessThan(Boolean value) {
            addCriterion("MEDIA <", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaLessThanOrEqualTo(Boolean value) {
            addCriterion("MEDIA <=", value, "media");
            return (Criteria) this;
        }

        public Criteria andMediaIn(List<Boolean> values) {
            addCriterion("MEDIA in", values, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotIn(List<Boolean> values) {
            addCriterion("MEDIA not in", values, "media");
            return (Criteria) this;
        }

        public Criteria andMediaBetween(Boolean value1, Boolean value2) {
            addCriterion("MEDIA between", value1, value2, "media");
            return (Criteria) this;
        }

        public Criteria andMediaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MEDIA not between", value1, value2, "media");
            return (Criteria) this;
        }

        public Criteria andAirconditionIsNull() {
            addCriterion("AIRCONDITION is null");
            return (Criteria) this;
        }

        public Criteria andAirconditionIsNotNull() {
            addCriterion("AIRCONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andAirconditionEqualTo(Boolean value) {
            addCriterion("AIRCONDITION =", value, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionNotEqualTo(Boolean value) {
            addCriterion("AIRCONDITION <>", value, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionGreaterThan(Boolean value) {
            addCriterion("AIRCONDITION >", value, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AIRCONDITION >=", value, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionLessThan(Boolean value) {
            addCriterion("AIRCONDITION <", value, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionLessThanOrEqualTo(Boolean value) {
            addCriterion("AIRCONDITION <=", value, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionIn(List<Boolean> values) {
            addCriterion("AIRCONDITION in", values, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionNotIn(List<Boolean> values) {
            addCriterion("AIRCONDITION not in", values, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionBetween(Boolean value1, Boolean value2) {
            addCriterion("AIRCONDITION between", value1, value2, "aircondition");
            return (Criteria) this;
        }

        public Criteria andAirconditionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AIRCONDITION not between", value1, value2, "aircondition");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("PEOPLE =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("PEOPLE <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("PEOPLE >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("PEOPLE >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("PEOPLE <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("PEOPLE <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("PEOPLE in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("PEOPLE not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLE between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLE not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andMicrophoneIsNull() {
            addCriterion("MICROPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMicrophoneIsNotNull() {
            addCriterion("MICROPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMicrophoneEqualTo(Integer value) {
            addCriterion("MICROPHONE =", value, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneNotEqualTo(Integer value) {
            addCriterion("MICROPHONE <>", value, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneGreaterThan(Integer value) {
            addCriterion("MICROPHONE >", value, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("MICROPHONE >=", value, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneLessThan(Integer value) {
            addCriterion("MICROPHONE <", value, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneLessThanOrEqualTo(Integer value) {
            addCriterion("MICROPHONE <=", value, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneIn(List<Integer> values) {
            addCriterion("MICROPHONE in", values, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneNotIn(List<Integer> values) {
            addCriterion("MICROPHONE not in", values, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneBetween(Integer value1, Integer value2) {
            addCriterion("MICROPHONE between", value1, value2, "microphone");
            return (Criteria) this;
        }

        public Criteria andMicrophoneNotBetween(Integer value1, Integer value2) {
            addCriterion("MICROPHONE not between", value1, value2, "microphone");
            return (Criteria) this;
        }

        public Criteria andWhiteboardIsNull() {
            addCriterion("WHITEBOARD is null");
            return (Criteria) this;
        }

        public Criteria andWhiteboardIsNotNull() {
            addCriterion("WHITEBOARD is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteboardEqualTo(Integer value) {
            addCriterion("WHITEBOARD =", value, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardNotEqualTo(Integer value) {
            addCriterion("WHITEBOARD <>", value, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardGreaterThan(Integer value) {
            addCriterion("WHITEBOARD >", value, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardGreaterThanOrEqualTo(Integer value) {
            addCriterion("WHITEBOARD >=", value, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardLessThan(Integer value) {
            addCriterion("WHITEBOARD <", value, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardLessThanOrEqualTo(Integer value) {
            addCriterion("WHITEBOARD <=", value, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardIn(List<Integer> values) {
            addCriterion("WHITEBOARD in", values, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardNotIn(List<Integer> values) {
            addCriterion("WHITEBOARD not in", values, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardBetween(Integer value1, Integer value2) {
            addCriterion("WHITEBOARD between", value1, value2, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andWhiteboardNotBetween(Integer value1, Integer value2) {
            addCriterion("WHITEBOARD not between", value1, value2, "whiteboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardIsNull() {
            addCriterion("BLACKBOARD is null");
            return (Criteria) this;
        }

        public Criteria andBlackboardIsNotNull() {
            addCriterion("BLACKBOARD is not null");
            return (Criteria) this;
        }

        public Criteria andBlackboardEqualTo(Integer value) {
            addCriterion("BLACKBOARD =", value, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardNotEqualTo(Integer value) {
            addCriterion("BLACKBOARD <>", value, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardGreaterThan(Integer value) {
            addCriterion("BLACKBOARD >", value, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardGreaterThanOrEqualTo(Integer value) {
            addCriterion("BLACKBOARD >=", value, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardLessThan(Integer value) {
            addCriterion("BLACKBOARD <", value, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardLessThanOrEqualTo(Integer value) {
            addCriterion("BLACKBOARD <=", value, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardIn(List<Integer> values) {
            addCriterion("BLACKBOARD in", values, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardNotIn(List<Integer> values) {
            addCriterion("BLACKBOARD not in", values, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardBetween(Integer value1, Integer value2) {
            addCriterion("BLACKBOARD between", value1, value2, "blackboard");
            return (Criteria) this;
        }

        public Criteria andBlackboardNotBetween(Integer value1, Integer value2) {
            addCriterion("BLACKBOARD not between", value1, value2, "blackboard");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table meeting_room
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 12 17:21:01 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table meeting_room
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
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