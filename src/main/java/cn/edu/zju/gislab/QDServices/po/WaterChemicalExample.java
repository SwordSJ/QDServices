package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaterChemicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterChemicalExample() {
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

        public Criteria andDepthIsNull() {
            addCriterion("depth is null");
            return (Criteria) this;
        }

        public Criteria andDepthIsNotNull() {
            addCriterion("depth is not null");
            return (Criteria) this;
        }

        public Criteria andDepthEqualTo(BigDecimal value) {
            addCriterion("depth =", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotEqualTo(BigDecimal value) {
            addCriterion("depth <>", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThan(BigDecimal value) {
            addCriterion("depth >", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("depth >=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThan(BigDecimal value) {
            addCriterion("depth <", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("depth <=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthIn(List<BigDecimal> values) {
            addCriterion("depth in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotIn(List<BigDecimal> values) {
            addCriterion("depth not in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depth between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("depth not between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTIsNull() {
            addCriterion("t is null");
            return (Criteria) this;
        }

        public Criteria andTIsNotNull() {
            addCriterion("t is not null");
            return (Criteria) this;
        }

        public Criteria andTEqualTo(BigDecimal value) {
            addCriterion("t =", value, "t");
            return (Criteria) this;
        }

        public Criteria andTNotEqualTo(BigDecimal value) {
            addCriterion("t <>", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThan(BigDecimal value) {
            addCriterion("t >", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t >=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThan(BigDecimal value) {
            addCriterion("t <", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t <=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTIn(List<BigDecimal> values) {
            addCriterion("t in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTNotIn(List<BigDecimal> values) {
            addCriterion("t not in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t not between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(BigDecimal value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(BigDecimal value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(BigDecimal value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(BigDecimal value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<BigDecimal> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<BigDecimal> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andDoIsNull() {
            addCriterion("do is null");
            return (Criteria) this;
        }

        public Criteria andDoIsNotNull() {
            addCriterion("do is not null");
            return (Criteria) this;
        }

        public Criteria andDoEqualTo(BigDecimal value) {
            addCriterion("do =", value, "do");
            return (Criteria) this;
        }

        public Criteria andDoNotEqualTo(BigDecimal value) {
            addCriterion("do <>", value, "do");
            return (Criteria) this;
        }

        public Criteria andDoGreaterThan(BigDecimal value) {
            addCriterion("do >", value, "do");
            return (Criteria) this;
        }

        public Criteria andDoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("do >=", value, "do");
            return (Criteria) this;
        }

        public Criteria andDoLessThan(BigDecimal value) {
            addCriterion("do <", value, "do");
            return (Criteria) this;
        }

        public Criteria andDoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("do <=", value, "do");
            return (Criteria) this;
        }

        public Criteria andDoIn(List<BigDecimal> values) {
            addCriterion("do in", values, "do");
            return (Criteria) this;
        }

        public Criteria andDoNotIn(List<BigDecimal> values) {
            addCriterion("do not in", values, "do");
            return (Criteria) this;
        }

        public Criteria andDoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("do between", value1, value2, "do");
            return (Criteria) this;
        }

        public Criteria andDoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("do not between", value1, value2, "do");
            return (Criteria) this;
        }

        public Criteria andSIsNull() {
            addCriterion("s is null");
            return (Criteria) this;
        }

        public Criteria andSIsNotNull() {
            addCriterion("s is not null");
            return (Criteria) this;
        }

        public Criteria andSEqualTo(BigDecimal value) {
            addCriterion("s =", value, "s");
            return (Criteria) this;
        }

        public Criteria andSNotEqualTo(BigDecimal value) {
            addCriterion("s <>", value, "s");
            return (Criteria) this;
        }

        public Criteria andSGreaterThan(BigDecimal value) {
            addCriterion("s >", value, "s");
            return (Criteria) this;
        }

        public Criteria andSGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("s >=", value, "s");
            return (Criteria) this;
        }

        public Criteria andSLessThan(BigDecimal value) {
            addCriterion("s <", value, "s");
            return (Criteria) this;
        }

        public Criteria andSLessThanOrEqualTo(BigDecimal value) {
            addCriterion("s <=", value, "s");
            return (Criteria) this;
        }

        public Criteria andSIn(List<BigDecimal> values) {
            addCriterion("s in", values, "s");
            return (Criteria) this;
        }

        public Criteria andSNotIn(List<BigDecimal> values) {
            addCriterion("s not in", values, "s");
            return (Criteria) this;
        }

        public Criteria andSBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s between", value1, value2, "s");
            return (Criteria) this;
        }

        public Criteria andSNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s not between", value1, value2, "s");
            return (Criteria) this;
        }

        public Criteria andPo4PIsNull() {
            addCriterion("po4-p is null");
            return (Criteria) this;
        }

        public Criteria andPo4PIsNotNull() {
            addCriterion("po4-p is not null");
            return (Criteria) this;
        }

        public Criteria andPo4PEqualTo(BigDecimal value) {
            addCriterion("po4-p =", value, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PNotEqualTo(BigDecimal value) {
            addCriterion("po4-p <>", value, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PGreaterThan(BigDecimal value) {
            addCriterion("po4-p >", value, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("po4-p >=", value, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PLessThan(BigDecimal value) {
            addCriterion("po4-p <", value, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PLessThanOrEqualTo(BigDecimal value) {
            addCriterion("po4-p <=", value, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PIn(List<BigDecimal> values) {
            addCriterion("po4-p in", values, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PNotIn(List<BigDecimal> values) {
            addCriterion("po4-p not in", values, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("po4-p between", value1, value2, "po4P");
            return (Criteria) this;
        }

        public Criteria andPo4PNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("po4-p not between", value1, value2, "po4P");
            return (Criteria) this;
        }

        public Criteria andNo3IsNull() {
            addCriterion("no3 is null");
            return (Criteria) this;
        }

        public Criteria andNo3IsNotNull() {
            addCriterion("no3 is not null");
            return (Criteria) this;
        }

        public Criteria andNo3EqualTo(BigDecimal value) {
            addCriterion("no3 =", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotEqualTo(BigDecimal value) {
            addCriterion("no3 <>", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3GreaterThan(BigDecimal value) {
            addCriterion("no3 >", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no3 >=", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3LessThan(BigDecimal value) {
            addCriterion("no3 <", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("no3 <=", value, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3In(List<BigDecimal> values) {
            addCriterion("no3 in", values, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotIn(List<BigDecimal> values) {
            addCriterion("no3 not in", values, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("no3 between", value1, value2, "no3");
            return (Criteria) this;
        }

        public Criteria andNo3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no3 not between", value1, value2, "no3");
            return (Criteria) this;
        }

        public Criteria andNo2IsNull() {
            addCriterion("no2 is null");
            return (Criteria) this;
        }

        public Criteria andNo2IsNotNull() {
            addCriterion("no2 is not null");
            return (Criteria) this;
        }

        public Criteria andNo2EqualTo(BigDecimal value) {
            addCriterion("no2 =", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotEqualTo(BigDecimal value) {
            addCriterion("no2 <>", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThan(BigDecimal value) {
            addCriterion("no2 >", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no2 >=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThan(BigDecimal value) {
            addCriterion("no2 <", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("no2 <=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2In(List<BigDecimal> values) {
            addCriterion("no2 in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotIn(List<BigDecimal> values) {
            addCriterion("no2 not in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("no2 between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no2 not between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNh4IsNull() {
            addCriterion("nh4 is null");
            return (Criteria) this;
        }

        public Criteria andNh4IsNotNull() {
            addCriterion("nh4 is not null");
            return (Criteria) this;
        }

        public Criteria andNh4EqualTo(BigDecimal value) {
            addCriterion("nh4 =", value, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4NotEqualTo(BigDecimal value) {
            addCriterion("nh4 <>", value, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4GreaterThan(BigDecimal value) {
            addCriterion("nh4 >", value, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nh4 >=", value, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4LessThan(BigDecimal value) {
            addCriterion("nh4 <", value, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("nh4 <=", value, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4In(List<BigDecimal> values) {
            addCriterion("nh4 in", values, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4NotIn(List<BigDecimal> values) {
            addCriterion("nh4 not in", values, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("nh4 between", value1, value2, "nh4");
            return (Criteria) this;
        }

        public Criteria andNh4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nh4 not between", value1, value2, "nh4");
            return (Criteria) this;
        }

        public Criteria andSio3SiIsNull() {
            addCriterion("sio3-si is null");
            return (Criteria) this;
        }

        public Criteria andSio3SiIsNotNull() {
            addCriterion("sio3-si is not null");
            return (Criteria) this;
        }

        public Criteria andSio3SiEqualTo(BigDecimal value) {
            addCriterion("sio3-si =", value, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiNotEqualTo(BigDecimal value) {
            addCriterion("sio3-si <>", value, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiGreaterThan(BigDecimal value) {
            addCriterion("sio3-si >", value, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sio3-si >=", value, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiLessThan(BigDecimal value) {
            addCriterion("sio3-si <", value, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sio3-si <=", value, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiIn(List<BigDecimal> values) {
            addCriterion("sio3-si in", values, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiNotIn(List<BigDecimal> values) {
            addCriterion("sio3-si not in", values, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sio3-si between", value1, value2, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andSio3SiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sio3-si not between", value1, value2, "sio3Si");
            return (Criteria) this;
        }

        public Criteria andDtpIsNull() {
            addCriterion("dtp is null");
            return (Criteria) this;
        }

        public Criteria andDtpIsNotNull() {
            addCriterion("dtp is not null");
            return (Criteria) this;
        }

        public Criteria andDtpEqualTo(BigDecimal value) {
            addCriterion("dtp =", value, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpNotEqualTo(BigDecimal value) {
            addCriterion("dtp <>", value, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpGreaterThan(BigDecimal value) {
            addCriterion("dtp >", value, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dtp >=", value, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpLessThan(BigDecimal value) {
            addCriterion("dtp <", value, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dtp <=", value, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpIn(List<BigDecimal> values) {
            addCriterion("dtp in", values, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpNotIn(List<BigDecimal> values) {
            addCriterion("dtp not in", values, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dtp between", value1, value2, "dtp");
            return (Criteria) this;
        }

        public Criteria andDtpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dtp not between", value1, value2, "dtp");
            return (Criteria) this;
        }

        public Criteria andDopIsNull() {
            addCriterion("dop is null");
            return (Criteria) this;
        }

        public Criteria andDopIsNotNull() {
            addCriterion("dop is not null");
            return (Criteria) this;
        }

        public Criteria andDopEqualTo(BigDecimal value) {
            addCriterion("dop =", value, "dop");
            return (Criteria) this;
        }

        public Criteria andDopNotEqualTo(BigDecimal value) {
            addCriterion("dop <>", value, "dop");
            return (Criteria) this;
        }

        public Criteria andDopGreaterThan(BigDecimal value) {
            addCriterion("dop >", value, "dop");
            return (Criteria) this;
        }

        public Criteria andDopGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dop >=", value, "dop");
            return (Criteria) this;
        }

        public Criteria andDopLessThan(BigDecimal value) {
            addCriterion("dop <", value, "dop");
            return (Criteria) this;
        }

        public Criteria andDopLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dop <=", value, "dop");
            return (Criteria) this;
        }

        public Criteria andDopIn(List<BigDecimal> values) {
            addCriterion("dop in", values, "dop");
            return (Criteria) this;
        }

        public Criteria andDopNotIn(List<BigDecimal> values) {
            addCriterion("dop not in", values, "dop");
            return (Criteria) this;
        }

        public Criteria andDopBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dop between", value1, value2, "dop");
            return (Criteria) this;
        }

        public Criteria andDopNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dop not between", value1, value2, "dop");
            return (Criteria) this;
        }

        public Criteria andDtnIsNull() {
            addCriterion("dtn is null");
            return (Criteria) this;
        }

        public Criteria andDtnIsNotNull() {
            addCriterion("dtn is not null");
            return (Criteria) this;
        }

        public Criteria andDtnEqualTo(BigDecimal value) {
            addCriterion("dtn =", value, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnNotEqualTo(BigDecimal value) {
            addCriterion("dtn <>", value, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnGreaterThan(BigDecimal value) {
            addCriterion("dtn >", value, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dtn >=", value, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnLessThan(BigDecimal value) {
            addCriterion("dtn <", value, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dtn <=", value, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnIn(List<BigDecimal> values) {
            addCriterion("dtn in", values, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnNotIn(List<BigDecimal> values) {
            addCriterion("dtn not in", values, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dtn between", value1, value2, "dtn");
            return (Criteria) this;
        }

        public Criteria andDtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dtn not between", value1, value2, "dtn");
            return (Criteria) this;
        }

        public Criteria andDonIsNull() {
            addCriterion("don is null");
            return (Criteria) this;
        }

        public Criteria andDonIsNotNull() {
            addCriterion("don is not null");
            return (Criteria) this;
        }

        public Criteria andDonEqualTo(BigDecimal value) {
            addCriterion("don =", value, "don");
            return (Criteria) this;
        }

        public Criteria andDonNotEqualTo(BigDecimal value) {
            addCriterion("don <>", value, "don");
            return (Criteria) this;
        }

        public Criteria andDonGreaterThan(BigDecimal value) {
            addCriterion("don >", value, "don");
            return (Criteria) this;
        }

        public Criteria andDonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("don >=", value, "don");
            return (Criteria) this;
        }

        public Criteria andDonLessThan(BigDecimal value) {
            addCriterion("don <", value, "don");
            return (Criteria) this;
        }

        public Criteria andDonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("don <=", value, "don");
            return (Criteria) this;
        }

        public Criteria andDonIn(List<BigDecimal> values) {
            addCriterion("don in", values, "don");
            return (Criteria) this;
        }

        public Criteria andDonNotIn(List<BigDecimal> values) {
            addCriterion("don not in", values, "don");
            return (Criteria) this;
        }

        public Criteria andDonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("don between", value1, value2, "don");
            return (Criteria) this;
        }

        public Criteria andDonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("don not between", value1, value2, "don");
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