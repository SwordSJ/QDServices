package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SouthoceanZooplanktonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SouthoceanZooplanktonExample() {
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

        public Criteria andTrawlnetIsNull() {
            addCriterion("trawlnet is null");
            return (Criteria) this;
        }

        public Criteria andTrawlnetIsNotNull() {
            addCriterion("trawlnet is not null");
            return (Criteria) this;
        }

        public Criteria andTrawlnetEqualTo(String value) {
            addCriterion("trawlnet =", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetNotEqualTo(String value) {
            addCriterion("trawlnet <>", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetGreaterThan(String value) {
            addCriterion("trawlnet >", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetGreaterThanOrEqualTo(String value) {
            addCriterion("trawlnet >=", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetLessThan(String value) {
            addCriterion("trawlnet <", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetLessThanOrEqualTo(String value) {
            addCriterion("trawlnet <=", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetLike(String value) {
            addCriterion("trawlnet like", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetNotLike(String value) {
            addCriterion("trawlnet not like", value, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetIn(List<String> values) {
            addCriterion("trawlnet in", values, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetNotIn(List<String> values) {
            addCriterion("trawlnet not in", values, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetBetween(String value1, String value2) {
            addCriterion("trawlnet between", value1, value2, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andTrawlnetNotBetween(String value1, String value2) {
            addCriterion("trawlnet not between", value1, value2, "trawlnet");
            return (Criteria) this;
        }

        public Criteria andPhylumIsNull() {
            addCriterion("phylum is null");
            return (Criteria) this;
        }

        public Criteria andPhylumIsNotNull() {
            addCriterion("phylum is not null");
            return (Criteria) this;
        }

        public Criteria andPhylumEqualTo(String value) {
            addCriterion("phylum =", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumNotEqualTo(String value) {
            addCriterion("phylum <>", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumGreaterThan(String value) {
            addCriterion("phylum >", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumGreaterThanOrEqualTo(String value) {
            addCriterion("phylum >=", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumLessThan(String value) {
            addCriterion("phylum <", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumLessThanOrEqualTo(String value) {
            addCriterion("phylum <=", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumLike(String value) {
            addCriterion("phylum like", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumNotLike(String value) {
            addCriterion("phylum not like", value, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumIn(List<String> values) {
            addCriterion("phylum in", values, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumNotIn(List<String> values) {
            addCriterion("phylum not in", values, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumBetween(String value1, String value2) {
            addCriterion("phylum between", value1, value2, "phylum");
            return (Criteria) this;
        }

        public Criteria andPhylumNotBetween(String value1, String value2) {
            addCriterion("phylum not between", value1, value2, "phylum");
            return (Criteria) this;
        }

        public Criteria andClassIsNull() {
            addCriterion("class is null");
            return (Criteria) this;
        }

        public Criteria andClassIsNotNull() {
            addCriterion("class is not null");
            return (Criteria) this;
        }

        public Criteria andClassEqualTo(String value) {
            addCriterion("class =", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotEqualTo(String value) {
            addCriterion("class <>", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThan(String value) {
            addCriterion("class >", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThanOrEqualTo(String value) {
            addCriterion("class >=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThan(String value) {
            addCriterion("class <", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThanOrEqualTo(String value) {
            addCriterion("class <=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLike(String value) {
            addCriterion("class like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotLike(String value) {
            addCriterion("class not like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassIn(List<String> values) {
            addCriterion("class in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotIn(List<String> values) {
            addCriterion("class not in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassBetween(String value1, String value2) {
            addCriterion("class between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotBetween(String value1, String value2) {
            addCriterion("class not between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassLIsNull() {
            addCriterion("class_l is null");
            return (Criteria) this;
        }

        public Criteria andClassLIsNotNull() {
            addCriterion("class_l is not null");
            return (Criteria) this;
        }

        public Criteria andClassLEqualTo(String value) {
            addCriterion("class_l =", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLNotEqualTo(String value) {
            addCriterion("class_l <>", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLGreaterThan(String value) {
            addCriterion("class_l >", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLGreaterThanOrEqualTo(String value) {
            addCriterion("class_l >=", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLLessThan(String value) {
            addCriterion("class_l <", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLLessThanOrEqualTo(String value) {
            addCriterion("class_l <=", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLLike(String value) {
            addCriterion("class_l like", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLNotLike(String value) {
            addCriterion("class_l not like", value, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLIn(List<String> values) {
            addCriterion("class_l in", values, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLNotIn(List<String> values) {
            addCriterion("class_l not in", values, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLBetween(String value1, String value2) {
            addCriterion("class_l between", value1, value2, "classL");
            return (Criteria) this;
        }

        public Criteria andClassLNotBetween(String value1, String value2) {
            addCriterion("class_l not between", value1, value2, "classL");
            return (Criteria) this;
        }

        public Criteria andOrderCIsNull() {
            addCriterion("order_c is null");
            return (Criteria) this;
        }

        public Criteria andOrderCIsNotNull() {
            addCriterion("order_c is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCEqualTo(String value) {
            addCriterion("order_c =", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotEqualTo(String value) {
            addCriterion("order_c <>", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCGreaterThan(String value) {
            addCriterion("order_c >", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCGreaterThanOrEqualTo(String value) {
            addCriterion("order_c >=", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCLessThan(String value) {
            addCriterion("order_c <", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCLessThanOrEqualTo(String value) {
            addCriterion("order_c <=", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCLike(String value) {
            addCriterion("order_c like", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotLike(String value) {
            addCriterion("order_c not like", value, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCIn(List<String> values) {
            addCriterion("order_c in", values, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotIn(List<String> values) {
            addCriterion("order_c not in", values, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCBetween(String value1, String value2) {
            addCriterion("order_c between", value1, value2, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderCNotBetween(String value1, String value2) {
            addCriterion("order_c not between", value1, value2, "orderC");
            return (Criteria) this;
        }

        public Criteria andOrderLIsNull() {
            addCriterion("order_l is null");
            return (Criteria) this;
        }

        public Criteria andOrderLIsNotNull() {
            addCriterion("order_l is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLEqualTo(String value) {
            addCriterion("order_l =", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLNotEqualTo(String value) {
            addCriterion("order_l <>", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLGreaterThan(String value) {
            addCriterion("order_l >", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLGreaterThanOrEqualTo(String value) {
            addCriterion("order_l >=", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLLessThan(String value) {
            addCriterion("order_l <", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLLessThanOrEqualTo(String value) {
            addCriterion("order_l <=", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLLike(String value) {
            addCriterion("order_l like", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLNotLike(String value) {
            addCriterion("order_l not like", value, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLIn(List<String> values) {
            addCriterion("order_l in", values, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLNotIn(List<String> values) {
            addCriterion("order_l not in", values, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLBetween(String value1, String value2) {
            addCriterion("order_l between", value1, value2, "orderL");
            return (Criteria) this;
        }

        public Criteria andOrderLNotBetween(String value1, String value2) {
            addCriterion("order_l not between", value1, value2, "orderL");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNull() {
            addCriterion("family is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNotNull() {
            addCriterion("family is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyEqualTo(String value) {
            addCriterion("family =", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotEqualTo(String value) {
            addCriterion("family <>", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThan(String value) {
            addCriterion("family >", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("family >=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThan(String value) {
            addCriterion("family <", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThanOrEqualTo(String value) {
            addCriterion("family <=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLike(String value) {
            addCriterion("family like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotLike(String value) {
            addCriterion("family not like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyIn(List<String> values) {
            addCriterion("family in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotIn(List<String> values) {
            addCriterion("family not in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyBetween(String value1, String value2) {
            addCriterion("family between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotBetween(String value1, String value2) {
            addCriterion("family not between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLIsNull() {
            addCriterion("family_l is null");
            return (Criteria) this;
        }

        public Criteria andFamilyLIsNotNull() {
            addCriterion("family_l is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyLEqualTo(String value) {
            addCriterion("family_l =", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLNotEqualTo(String value) {
            addCriterion("family_l <>", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLGreaterThan(String value) {
            addCriterion("family_l >", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLGreaterThanOrEqualTo(String value) {
            addCriterion("family_l >=", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLLessThan(String value) {
            addCriterion("family_l <", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLLessThanOrEqualTo(String value) {
            addCriterion("family_l <=", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLLike(String value) {
            addCriterion("family_l like", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLNotLike(String value) {
            addCriterion("family_l not like", value, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLIn(List<String> values) {
            addCriterion("family_l in", values, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLNotIn(List<String> values) {
            addCriterion("family_l not in", values, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLBetween(String value1, String value2) {
            addCriterion("family_l between", value1, value2, "familyL");
            return (Criteria) this;
        }

        public Criteria andFamilyLNotBetween(String value1, String value2) {
            addCriterion("family_l not between", value1, value2, "familyL");
            return (Criteria) this;
        }

        public Criteria andGenusIsNull() {
            addCriterion("genus is null");
            return (Criteria) this;
        }

        public Criteria andGenusIsNotNull() {
            addCriterion("genus is not null");
            return (Criteria) this;
        }

        public Criteria andGenusEqualTo(String value) {
            addCriterion("genus =", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotEqualTo(String value) {
            addCriterion("genus <>", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusGreaterThan(String value) {
            addCriterion("genus >", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusGreaterThanOrEqualTo(String value) {
            addCriterion("genus >=", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLessThan(String value) {
            addCriterion("genus <", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLessThanOrEqualTo(String value) {
            addCriterion("genus <=", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLike(String value) {
            addCriterion("genus like", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotLike(String value) {
            addCriterion("genus not like", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusIn(List<String> values) {
            addCriterion("genus in", values, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotIn(List<String> values) {
            addCriterion("genus not in", values, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusBetween(String value1, String value2) {
            addCriterion("genus between", value1, value2, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotBetween(String value1, String value2) {
            addCriterion("genus not between", value1, value2, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLIsNull() {
            addCriterion("genus_l is null");
            return (Criteria) this;
        }

        public Criteria andGenusLIsNotNull() {
            addCriterion("genus_l is not null");
            return (Criteria) this;
        }

        public Criteria andGenusLEqualTo(String value) {
            addCriterion("genus_l =", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLNotEqualTo(String value) {
            addCriterion("genus_l <>", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLGreaterThan(String value) {
            addCriterion("genus_l >", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLGreaterThanOrEqualTo(String value) {
            addCriterion("genus_l >=", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLLessThan(String value) {
            addCriterion("genus_l <", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLLessThanOrEqualTo(String value) {
            addCriterion("genus_l <=", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLLike(String value) {
            addCriterion("genus_l like", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLNotLike(String value) {
            addCriterion("genus_l not like", value, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLIn(List<String> values) {
            addCriterion("genus_l in", values, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLNotIn(List<String> values) {
            addCriterion("genus_l not in", values, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLBetween(String value1, String value2) {
            addCriterion("genus_l between", value1, value2, "genusL");
            return (Criteria) this;
        }

        public Criteria andGenusLNotBetween(String value1, String value2) {
            addCriterion("genus_l not between", value1, value2, "genusL");
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

        public Criteria andMediumIsNull() {
            addCriterion("medium is null");
            return (Criteria) this;
        }

        public Criteria andMediumIsNotNull() {
            addCriterion("medium is not null");
            return (Criteria) this;
        }

        public Criteria andMediumEqualTo(String value) {
            addCriterion("medium =", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumNotEqualTo(String value) {
            addCriterion("medium <>", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumGreaterThan(String value) {
            addCriterion("medium >", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumGreaterThanOrEqualTo(String value) {
            addCriterion("medium >=", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumLessThan(String value) {
            addCriterion("medium <", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumLessThanOrEqualTo(String value) {
            addCriterion("medium <=", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumLike(String value) {
            addCriterion("medium like", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumNotLike(String value) {
            addCriterion("medium not like", value, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumIn(List<String> values) {
            addCriterion("medium in", values, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumNotIn(List<String> values) {
            addCriterion("medium not in", values, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumBetween(String value1, String value2) {
            addCriterion("medium between", value1, value2, "medium");
            return (Criteria) this;
        }

        public Criteria andMediumNotBetween(String value1, String value2) {
            addCriterion("medium not between", value1, value2, "medium");
            return (Criteria) this;
        }

        public Criteria andExtwayIsNull() {
            addCriterion("extway is null");
            return (Criteria) this;
        }

        public Criteria andExtwayIsNotNull() {
            addCriterion("extway is not null");
            return (Criteria) this;
        }

        public Criteria andExtwayEqualTo(String value) {
            addCriterion("extway =", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayNotEqualTo(String value) {
            addCriterion("extway <>", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayGreaterThan(String value) {
            addCriterion("extway >", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayGreaterThanOrEqualTo(String value) {
            addCriterion("extway >=", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayLessThan(String value) {
            addCriterion("extway <", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayLessThanOrEqualTo(String value) {
            addCriterion("extway <=", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayLike(String value) {
            addCriterion("extway like", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayNotLike(String value) {
            addCriterion("extway not like", value, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayIn(List<String> values) {
            addCriterion("extway in", values, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayNotIn(List<String> values) {
            addCriterion("extway not in", values, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayBetween(String value1, String value2) {
            addCriterion("extway between", value1, value2, "extway");
            return (Criteria) this;
        }

        public Criteria andExtwayNotBetween(String value1, String value2) {
            addCriterion("extway not between", value1, value2, "extway");
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