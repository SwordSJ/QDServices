package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SouthoceanPicophoorgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SouthoceanPicophoorgExample() {
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

        public Criteria andSynechococcusIsNull() {
            addCriterion("synechococcus is null");
            return (Criteria) this;
        }

        public Criteria andSynechococcusIsNotNull() {
            addCriterion("synechococcus is not null");
            return (Criteria) this;
        }

        public Criteria andSynechococcusEqualTo(BigDecimal value) {
            addCriterion("synechococcus =", value, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusNotEqualTo(BigDecimal value) {
            addCriterion("synechococcus <>", value, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusGreaterThan(BigDecimal value) {
            addCriterion("synechococcus >", value, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("synechococcus >=", value, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusLessThan(BigDecimal value) {
            addCriterion("synechococcus <", value, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("synechococcus <=", value, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusIn(List<BigDecimal> values) {
            addCriterion("synechococcus in", values, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusNotIn(List<BigDecimal> values) {
            addCriterion("synechococcus not in", values, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("synechococcus between", value1, value2, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andSynechococcusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("synechococcus not between", value1, value2, "synechococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusIsNull() {
            addCriterion("prochlorococcus is null");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusIsNotNull() {
            addCriterion("prochlorococcus is not null");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusEqualTo(BigDecimal value) {
            addCriterion("prochlorococcus =", value, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusNotEqualTo(BigDecimal value) {
            addCriterion("prochlorococcus <>", value, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusGreaterThan(BigDecimal value) {
            addCriterion("prochlorococcus >", value, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prochlorococcus >=", value, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusLessThan(BigDecimal value) {
            addCriterion("prochlorococcus <", value, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prochlorococcus <=", value, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusIn(List<BigDecimal> values) {
            addCriterion("prochlorococcus in", values, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusNotIn(List<BigDecimal> values) {
            addCriterion("prochlorococcus not in", values, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prochlorococcus between", value1, value2, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andProchlorococcusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prochlorococcus not between", value1, value2, "prochlorococcus");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteIsNull() {
            addCriterion("picoeukaryote is null");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteIsNotNull() {
            addCriterion("picoeukaryote is not null");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteEqualTo(BigDecimal value) {
            addCriterion("picoeukaryote =", value, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteNotEqualTo(BigDecimal value) {
            addCriterion("picoeukaryote <>", value, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteGreaterThan(BigDecimal value) {
            addCriterion("picoeukaryote >", value, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("picoeukaryote >=", value, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteLessThan(BigDecimal value) {
            addCriterion("picoeukaryote <", value, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("picoeukaryote <=", value, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteIn(List<BigDecimal> values) {
            addCriterion("picoeukaryote in", values, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteNotIn(List<BigDecimal> values) {
            addCriterion("picoeukaryote not in", values, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("picoeukaryote between", value1, value2, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andPicoeukaryoteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("picoeukaryote not between", value1, value2, "picoeukaryote");
            return (Criteria) this;
        }

        public Criteria andSampwayIsNull() {
            addCriterion("sampway is null");
            return (Criteria) this;
        }

        public Criteria andSampwayIsNotNull() {
            addCriterion("sampway is not null");
            return (Criteria) this;
        }

        public Criteria andSampwayEqualTo(String value) {
            addCriterion("sampway =", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayNotEqualTo(String value) {
            addCriterion("sampway <>", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayGreaterThan(String value) {
            addCriterion("sampway >", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayGreaterThanOrEqualTo(String value) {
            addCriterion("sampway >=", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayLessThan(String value) {
            addCriterion("sampway <", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayLessThanOrEqualTo(String value) {
            addCriterion("sampway <=", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayLike(String value) {
            addCriterion("sampway like", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayNotLike(String value) {
            addCriterion("sampway not like", value, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayIn(List<String> values) {
            addCriterion("sampway in", values, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayNotIn(List<String> values) {
            addCriterion("sampway not in", values, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayBetween(String value1, String value2) {
            addCriterion("sampway between", value1, value2, "sampway");
            return (Criteria) this;
        }

        public Criteria andSampwayNotBetween(String value1, String value2) {
            addCriterion("sampway not between", value1, value2, "sampway");
            return (Criteria) this;
        }

        public Criteria andAnlywayIsNull() {
            addCriterion("anlyway is null");
            return (Criteria) this;
        }

        public Criteria andAnlywayIsNotNull() {
            addCriterion("anlyway is not null");
            return (Criteria) this;
        }

        public Criteria andAnlywayEqualTo(String value) {
            addCriterion("anlyway =", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayNotEqualTo(String value) {
            addCriterion("anlyway <>", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayGreaterThan(String value) {
            addCriterion("anlyway >", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayGreaterThanOrEqualTo(String value) {
            addCriterion("anlyway >=", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayLessThan(String value) {
            addCriterion("anlyway <", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayLessThanOrEqualTo(String value) {
            addCriterion("anlyway <=", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayLike(String value) {
            addCriterion("anlyway like", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayNotLike(String value) {
            addCriterion("anlyway not like", value, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayIn(List<String> values) {
            addCriterion("anlyway in", values, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayNotIn(List<String> values) {
            addCriterion("anlyway not in", values, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayBetween(String value1, String value2) {
            addCriterion("anlyway between", value1, value2, "anlyway");
            return (Criteria) this;
        }

        public Criteria andAnlywayNotBetween(String value1, String value2) {
            addCriterion("anlyway not between", value1, value2, "anlyway");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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