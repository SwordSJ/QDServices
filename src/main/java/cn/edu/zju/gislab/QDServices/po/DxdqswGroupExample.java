package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DxdqswGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DxdqswGroupExample() {
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

        public Criteria andLayeridIsNull() {
            addCriterion("layerid is null");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNotNull() {
            addCriterion("layerid is not null");
            return (Criteria) this;
        }

        public Criteria andLayeridEqualTo(Integer value) {
            addCriterion("layerid =", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotEqualTo(Integer value) {
            addCriterion("layerid <>", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThan(Integer value) {
            addCriterion("layerid >", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("layerid >=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThan(Integer value) {
            addCriterion("layerid <", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThanOrEqualTo(Integer value) {
            addCriterion("layerid <=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridIn(List<Integer> values) {
            addCriterion("layerid in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotIn(List<Integer> values) {
            addCriterion("layerid not in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridBetween(Integer value1, Integer value2) {
            addCriterion("layerid between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotBetween(Integer value1, Integer value2) {
            addCriterion("layerid not between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andStationIsNull() {
            addCriterion("station is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("station is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(String value) {
            addCriterion("station =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(String value) {
            addCriterion("station <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(String value) {
            addCriterion("station >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(String value) {
            addCriterion("station >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(String value) {
            addCriterion("station <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(String value) {
            addCriterion("station <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLike(String value) {
            addCriterion("station like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotLike(String value) {
            addCriterion("station not like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<String> values) {
            addCriterion("station in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<String> values) {
            addCriterion("station not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(String value1, String value2) {
            addCriterion("station between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(String value1, String value2) {
            addCriterion("station not between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(BigDecimal value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(BigDecimal value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(BigDecimal value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(BigDecimal value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<BigDecimal> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<BigDecimal> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andGroupCIsNull() {
            addCriterion("group_c is null");
            return (Criteria) this;
        }

        public Criteria andGroupCIsNotNull() {
            addCriterion("group_c is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCEqualTo(String value) {
            addCriterion("group_c =", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCNotEqualTo(String value) {
            addCriterion("group_c <>", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCGreaterThan(String value) {
            addCriterion("group_c >", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCGreaterThanOrEqualTo(String value) {
            addCriterion("group_c >=", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCLessThan(String value) {
            addCriterion("group_c <", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCLessThanOrEqualTo(String value) {
            addCriterion("group_c <=", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCLike(String value) {
            addCriterion("group_c like", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCNotLike(String value) {
            addCriterion("group_c not like", value, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCIn(List<String> values) {
            addCriterion("group_c in", values, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCNotIn(List<String> values) {
            addCriterion("group_c not in", values, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCBetween(String value1, String value2) {
            addCriterion("group_c between", value1, value2, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupCNotBetween(String value1, String value2) {
            addCriterion("group_c not between", value1, value2, "groupC");
            return (Criteria) this;
        }

        public Criteria andGroupLIsNull() {
            addCriterion("group_l is null");
            return (Criteria) this;
        }

        public Criteria andGroupLIsNotNull() {
            addCriterion("group_l is not null");
            return (Criteria) this;
        }

        public Criteria andGroupLEqualTo(String value) {
            addCriterion("group_l =", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLNotEqualTo(String value) {
            addCriterion("group_l <>", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLGreaterThan(String value) {
            addCriterion("group_l >", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLGreaterThanOrEqualTo(String value) {
            addCriterion("group_l >=", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLLessThan(String value) {
            addCriterion("group_l <", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLLessThanOrEqualTo(String value) {
            addCriterion("group_l <=", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLLike(String value) {
            addCriterion("group_l like", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLNotLike(String value) {
            addCriterion("group_l not like", value, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLIn(List<String> values) {
            addCriterion("group_l in", values, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLNotIn(List<String> values) {
            addCriterion("group_l not in", values, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLBetween(String value1, String value2) {
            addCriterion("group_l between", value1, value2, "groupL");
            return (Criteria) this;
        }

        public Criteria andGroupLNotBetween(String value1, String value2) {
            addCriterion("group_l not between", value1, value2, "groupL");
            return (Criteria) this;
        }

        public Criteria andAbundanceIsNull() {
            addCriterion("abundance is null");
            return (Criteria) this;
        }

        public Criteria andAbundanceIsNotNull() {
            addCriterion("abundance is not null");
            return (Criteria) this;
        }

        public Criteria andAbundanceEqualTo(BigDecimal value) {
            addCriterion("abundance =", value, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceNotEqualTo(BigDecimal value) {
            addCriterion("abundance <>", value, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceGreaterThan(BigDecimal value) {
            addCriterion("abundance >", value, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("abundance >=", value, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceLessThan(BigDecimal value) {
            addCriterion("abundance <", value, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("abundance <=", value, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceIn(List<BigDecimal> values) {
            addCriterion("abundance in", values, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceNotIn(List<BigDecimal> values) {
            addCriterion("abundance not in", values, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("abundance between", value1, value2, "abundance");
            return (Criteria) this;
        }

        public Criteria andAbundanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("abundance not between", value1, value2, "abundance");
            return (Criteria) this;
        }

        public Criteria andInvwayIsNull() {
            addCriterion("invway is null");
            return (Criteria) this;
        }

        public Criteria andInvwayIsNotNull() {
            addCriterion("invway is not null");
            return (Criteria) this;
        }

        public Criteria andInvwayEqualTo(String value) {
            addCriterion("invway =", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayNotEqualTo(String value) {
            addCriterion("invway <>", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayGreaterThan(String value) {
            addCriterion("invway >", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayGreaterThanOrEqualTo(String value) {
            addCriterion("invway >=", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayLessThan(String value) {
            addCriterion("invway <", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayLessThanOrEqualTo(String value) {
            addCriterion("invway <=", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayLike(String value) {
            addCriterion("invway like", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayNotLike(String value) {
            addCriterion("invway not like", value, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayIn(List<String> values) {
            addCriterion("invway in", values, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayNotIn(List<String> values) {
            addCriterion("invway not in", values, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayBetween(String value1, String value2) {
            addCriterion("invway between", value1, value2, "invway");
            return (Criteria) this;
        }

        public Criteria andInvwayNotBetween(String value1, String value2) {
            addCriterion("invway not between", value1, value2, "invway");
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