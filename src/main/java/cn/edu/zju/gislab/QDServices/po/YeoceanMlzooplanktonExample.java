package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YeoceanMlzooplanktonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YeoceanMlzooplanktonExample() {
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

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andVoyIsNull() {
            addCriterion("voy is null");
            return (Criteria) this;
        }

        public Criteria andVoyIsNotNull() {
            addCriterion("voy is not null");
            return (Criteria) this;
        }

        public Criteria andVoyEqualTo(String value) {
            addCriterion("voy =", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyNotEqualTo(String value) {
            addCriterion("voy <>", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyGreaterThan(String value) {
            addCriterion("voy >", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyGreaterThanOrEqualTo(String value) {
            addCriterion("voy >=", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyLessThan(String value) {
            addCriterion("voy <", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyLessThanOrEqualTo(String value) {
            addCriterion("voy <=", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyLike(String value) {
            addCriterion("voy like", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyNotLike(String value) {
            addCriterion("voy not like", value, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyIn(List<String> values) {
            addCriterion("voy in", values, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyNotIn(List<String> values) {
            addCriterion("voy not in", values, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyBetween(String value1, String value2) {
            addCriterion("voy between", value1, value2, "voy");
            return (Criteria) this;
        }

        public Criteria andVoyNotBetween(String value1, String value2) {
            addCriterion("voy not between", value1, value2, "voy");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andNettypeIsNull() {
            addCriterion("nettype is null");
            return (Criteria) this;
        }

        public Criteria andNettypeIsNotNull() {
            addCriterion("nettype is not null");
            return (Criteria) this;
        }

        public Criteria andNettypeEqualTo(String value) {
            addCriterion("nettype =", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeNotEqualTo(String value) {
            addCriterion("nettype <>", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeGreaterThan(String value) {
            addCriterion("nettype >", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeGreaterThanOrEqualTo(String value) {
            addCriterion("nettype >=", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeLessThan(String value) {
            addCriterion("nettype <", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeLessThanOrEqualTo(String value) {
            addCriterion("nettype <=", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeLike(String value) {
            addCriterion("nettype like", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeNotLike(String value) {
            addCriterion("nettype not like", value, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeIn(List<String> values) {
            addCriterion("nettype in", values, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeNotIn(List<String> values) {
            addCriterion("nettype not in", values, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeBetween(String value1, String value2) {
            addCriterion("nettype between", value1, value2, "nettype");
            return (Criteria) this;
        }

        public Criteria andNettypeNotBetween(String value1, String value2) {
            addCriterion("nettype not between", value1, value2, "nettype");
            return (Criteria) this;
        }

        public Criteria andSampnumIsNull() {
            addCriterion("sampnum is null");
            return (Criteria) this;
        }

        public Criteria andSampnumIsNotNull() {
            addCriterion("sampnum is not null");
            return (Criteria) this;
        }

        public Criteria andSampnumEqualTo(String value) {
            addCriterion("sampnum =", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumNotEqualTo(String value) {
            addCriterion("sampnum <>", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumGreaterThan(String value) {
            addCriterion("sampnum >", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumGreaterThanOrEqualTo(String value) {
            addCriterion("sampnum >=", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumLessThan(String value) {
            addCriterion("sampnum <", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumLessThanOrEqualTo(String value) {
            addCriterion("sampnum <=", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumLike(String value) {
            addCriterion("sampnum like", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumNotLike(String value) {
            addCriterion("sampnum not like", value, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumIn(List<String> values) {
            addCriterion("sampnum in", values, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumNotIn(List<String> values) {
            addCriterion("sampnum not in", values, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumBetween(String value1, String value2) {
            addCriterion("sampnum between", value1, value2, "sampnum");
            return (Criteria) this;
        }

        public Criteria andSampnumNotBetween(String value1, String value2) {
            addCriterion("sampnum not between", value1, value2, "sampnum");
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

        public Criteria andDepthEqualTo(Integer value) {
            addCriterion("depth =", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotEqualTo(Integer value) {
            addCriterion("depth <>", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThan(Integer value) {
            addCriterion("depth >", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("depth >=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThan(Integer value) {
            addCriterion("depth <", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthLessThanOrEqualTo(Integer value) {
            addCriterion("depth <=", value, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthIn(List<Integer> values) {
            addCriterion("depth in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotIn(List<Integer> values) {
            addCriterion("depth not in", values, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthBetween(Integer value1, Integer value2) {
            addCriterion("depth between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("depth not between", value1, value2, "depth");
            return (Criteria) this;
        }

        public Criteria andRopelenIsNull() {
            addCriterion("ropelen is null");
            return (Criteria) this;
        }

        public Criteria andRopelenIsNotNull() {
            addCriterion("ropelen is not null");
            return (Criteria) this;
        }

        public Criteria andRopelenEqualTo(Integer value) {
            addCriterion("ropelen =", value, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenNotEqualTo(Integer value) {
            addCriterion("ropelen <>", value, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenGreaterThan(Integer value) {
            addCriterion("ropelen >", value, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenGreaterThanOrEqualTo(Integer value) {
            addCriterion("ropelen >=", value, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenLessThan(Integer value) {
            addCriterion("ropelen <", value, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenLessThanOrEqualTo(Integer value) {
            addCriterion("ropelen <=", value, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenIn(List<Integer> values) {
            addCriterion("ropelen in", values, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenNotIn(List<Integer> values) {
            addCriterion("ropelen not in", values, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenBetween(Integer value1, Integer value2) {
            addCriterion("ropelen between", value1, value2, "ropelen");
            return (Criteria) this;
        }

        public Criteria andRopelenNotBetween(Integer value1, Integer value2) {
            addCriterion("ropelen not between", value1, value2, "ropelen");
            return (Criteria) this;
        }

        public Criteria andSpeciesIsNull() {
            addCriterion("species is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesIsNotNull() {
            addCriterion("species is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesEqualTo(String value) {
            addCriterion("species =", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotEqualTo(String value) {
            addCriterion("species <>", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesGreaterThan(String value) {
            addCriterion("species >", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesGreaterThanOrEqualTo(String value) {
            addCriterion("species >=", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLessThan(String value) {
            addCriterion("species <", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLessThanOrEqualTo(String value) {
            addCriterion("species <=", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLike(String value) {
            addCriterion("species like", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotLike(String value) {
            addCriterion("species not like", value, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesIn(List<String> values) {
            addCriterion("species in", values, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotIn(List<String> values) {
            addCriterion("species not in", values, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesBetween(String value1, String value2) {
            addCriterion("species between", value1, value2, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesNotBetween(String value1, String value2) {
            addCriterion("species not between", value1, value2, "species");
            return (Criteria) this;
        }

        public Criteria andSpeciesLIsNull() {
            addCriterion("species_l is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesLIsNotNull() {
            addCriterion("species_l is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesLEqualTo(String value) {
            addCriterion("species_l =", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLNotEqualTo(String value) {
            addCriterion("species_l <>", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLGreaterThan(String value) {
            addCriterion("species_l >", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLGreaterThanOrEqualTo(String value) {
            addCriterion("species_l >=", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLLessThan(String value) {
            addCriterion("species_l <", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLLessThanOrEqualTo(String value) {
            addCriterion("species_l <=", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLLike(String value) {
            addCriterion("species_l like", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLNotLike(String value) {
            addCriterion("species_l not like", value, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLIn(List<String> values) {
            addCriterion("species_l in", values, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLNotIn(List<String> values) {
            addCriterion("species_l not in", values, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLBetween(String value1, String value2) {
            addCriterion("species_l between", value1, value2, "speciesL");
            return (Criteria) this;
        }

        public Criteria andSpeciesLNotBetween(String value1, String value2) {
            addCriterion("species_l not between", value1, value2, "speciesL");
            return (Criteria) this;
        }

        public Criteria andDensityIsNull() {
            addCriterion("density is null");
            return (Criteria) this;
        }

        public Criteria andDensityIsNotNull() {
            addCriterion("density is not null");
            return (Criteria) this;
        }

        public Criteria andDensityEqualTo(BigDecimal value) {
            addCriterion("density =", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotEqualTo(BigDecimal value) {
            addCriterion("density <>", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThan(BigDecimal value) {
            addCriterion("density >", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("density >=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThan(BigDecimal value) {
            addCriterion("density <", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("density <=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityIn(List<BigDecimal> values) {
            addCriterion("density in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotIn(List<BigDecimal> values) {
            addCriterion("density not in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("density between", value1, value2, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("density not between", value1, value2, "density");
            return (Criteria) this;
        }

        public Criteria andBiomassIsNull() {
            addCriterion("biomass is null");
            return (Criteria) this;
        }

        public Criteria andBiomassIsNotNull() {
            addCriterion("biomass is not null");
            return (Criteria) this;
        }

        public Criteria andBiomassEqualTo(BigDecimal value) {
            addCriterion("biomass =", value, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassNotEqualTo(BigDecimal value) {
            addCriterion("biomass <>", value, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassGreaterThan(BigDecimal value) {
            addCriterion("biomass >", value, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("biomass >=", value, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassLessThan(BigDecimal value) {
            addCriterion("biomass <", value, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassLessThanOrEqualTo(BigDecimal value) {
            addCriterion("biomass <=", value, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassIn(List<BigDecimal> values) {
            addCriterion("biomass in", values, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassNotIn(List<BigDecimal> values) {
            addCriterion("biomass not in", values, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("biomass between", value1, value2, "biomass");
            return (Criteria) this;
        }

        public Criteria andBiomassNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("biomass not between", value1, value2, "biomass");
            return (Criteria) this;
        }

        public Criteria andRecorderIsNull() {
            addCriterion("recorder is null");
            return (Criteria) this;
        }

        public Criteria andRecorderIsNotNull() {
            addCriterion("recorder is not null");
            return (Criteria) this;
        }

        public Criteria andRecorderEqualTo(String value) {
            addCriterion("recorder =", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderNotEqualTo(String value) {
            addCriterion("recorder <>", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderGreaterThan(String value) {
            addCriterion("recorder >", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderGreaterThanOrEqualTo(String value) {
            addCriterion("recorder >=", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderLessThan(String value) {
            addCriterion("recorder <", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderLessThanOrEqualTo(String value) {
            addCriterion("recorder <=", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderLike(String value) {
            addCriterion("recorder like", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderNotLike(String value) {
            addCriterion("recorder not like", value, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderIn(List<String> values) {
            addCriterion("recorder in", values, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderNotIn(List<String> values) {
            addCriterion("recorder not in", values, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderBetween(String value1, String value2) {
            addCriterion("recorder between", value1, value2, "recorder");
            return (Criteria) this;
        }

        public Criteria andRecorderNotBetween(String value1, String value2) {
            addCriterion("recorder not between", value1, value2, "recorder");
            return (Criteria) this;
        }

        public Criteria andCollectorIsNull() {
            addCriterion("collector is null");
            return (Criteria) this;
        }

        public Criteria andCollectorIsNotNull() {
            addCriterion("collector is not null");
            return (Criteria) this;
        }

        public Criteria andCollectorEqualTo(String value) {
            addCriterion("collector =", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotEqualTo(String value) {
            addCriterion("collector <>", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorGreaterThan(String value) {
            addCriterion("collector >", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorGreaterThanOrEqualTo(String value) {
            addCriterion("collector >=", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorLessThan(String value) {
            addCriterion("collector <", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorLessThanOrEqualTo(String value) {
            addCriterion("collector <=", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorLike(String value) {
            addCriterion("collector like", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotLike(String value) {
            addCriterion("collector not like", value, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorIn(List<String> values) {
            addCriterion("collector in", values, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotIn(List<String> values) {
            addCriterion("collector not in", values, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorBetween(String value1, String value2) {
            addCriterion("collector between", value1, value2, "collector");
            return (Criteria) this;
        }

        public Criteria andCollectorNotBetween(String value1, String value2) {
            addCriterion("collector not between", value1, value2, "collector");
            return (Criteria) this;
        }

        public Criteria andEntryperIsNull() {
            addCriterion("entryper is null");
            return (Criteria) this;
        }

        public Criteria andEntryperIsNotNull() {
            addCriterion("entryper is not null");
            return (Criteria) this;
        }

        public Criteria andEntryperEqualTo(String value) {
            addCriterion("entryper =", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperNotEqualTo(String value) {
            addCriterion("entryper <>", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperGreaterThan(String value) {
            addCriterion("entryper >", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperGreaterThanOrEqualTo(String value) {
            addCriterion("entryper >=", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperLessThan(String value) {
            addCriterion("entryper <", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperLessThanOrEqualTo(String value) {
            addCriterion("entryper <=", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperLike(String value) {
            addCriterion("entryper like", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperNotLike(String value) {
            addCriterion("entryper not like", value, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperIn(List<String> values) {
            addCriterion("entryper in", values, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperNotIn(List<String> values) {
            addCriterion("entryper not in", values, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperBetween(String value1, String value2) {
            addCriterion("entryper between", value1, value2, "entryper");
            return (Criteria) this;
        }

        public Criteria andEntryperNotBetween(String value1, String value2) {
            addCriterion("entryper not between", value1, value2, "entryper");
            return (Criteria) this;
        }

        public Criteria andReaderIsNull() {
            addCriterion("reader is null");
            return (Criteria) this;
        }

        public Criteria andReaderIsNotNull() {
            addCriterion("reader is not null");
            return (Criteria) this;
        }

        public Criteria andReaderEqualTo(String value) {
            addCriterion("reader =", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotEqualTo(String value) {
            addCriterion("reader <>", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThan(String value) {
            addCriterion("reader >", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThanOrEqualTo(String value) {
            addCriterion("reader >=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThan(String value) {
            addCriterion("reader <", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThanOrEqualTo(String value) {
            addCriterion("reader <=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLike(String value) {
            addCriterion("reader like", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotLike(String value) {
            addCriterion("reader not like", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderIn(List<String> values) {
            addCriterion("reader in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotIn(List<String> values) {
            addCriterion("reader not in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderBetween(String value1, String value2) {
            addCriterion("reader between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotBetween(String value1, String value2) {
            addCriterion("reader not between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andSurveyorIsNull() {
            addCriterion("surveyor is null");
            return (Criteria) this;
        }

        public Criteria andSurveyorIsNotNull() {
            addCriterion("surveyor is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyorEqualTo(String value) {
            addCriterion("surveyor =", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorNotEqualTo(String value) {
            addCriterion("surveyor <>", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorGreaterThan(String value) {
            addCriterion("surveyor >", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorGreaterThanOrEqualTo(String value) {
            addCriterion("surveyor >=", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorLessThan(String value) {
            addCriterion("surveyor <", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorLessThanOrEqualTo(String value) {
            addCriterion("surveyor <=", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorLike(String value) {
            addCriterion("surveyor like", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorNotLike(String value) {
            addCriterion("surveyor not like", value, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorIn(List<String> values) {
            addCriterion("surveyor in", values, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorNotIn(List<String> values) {
            addCriterion("surveyor not in", values, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorBetween(String value1, String value2) {
            addCriterion("surveyor between", value1, value2, "surveyor");
            return (Criteria) this;
        }

        public Criteria andSurveyorNotBetween(String value1, String value2) {
            addCriterion("surveyor not between", value1, value2, "surveyor");
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