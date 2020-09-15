package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SedimentChemicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SedimentChemicalExample() {
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

        public Criteria andPco2IsNull() {
            addCriterion("pco2 is null");
            return (Criteria) this;
        }

        public Criteria andPco2IsNotNull() {
            addCriterion("pco2 is not null");
            return (Criteria) this;
        }

        public Criteria andPco2EqualTo(BigDecimal value) {
            addCriterion("pco2 =", value, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2NotEqualTo(BigDecimal value) {
            addCriterion("pco2 <>", value, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2GreaterThan(BigDecimal value) {
            addCriterion("pco2 >", value, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pco2 >=", value, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2LessThan(BigDecimal value) {
            addCriterion("pco2 <", value, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("pco2 <=", value, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2In(List<BigDecimal> values) {
            addCriterion("pco2 in", values, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2NotIn(List<BigDecimal> values) {
            addCriterion("pco2 not in", values, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("pco2 between", value1, value2, "pco2");
            return (Criteria) this;
        }

        public Criteria andPco2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pco2 not between", value1, value2, "pco2");
            return (Criteria) this;
        }

        public Criteria andAsIsNull() {
            addCriterion("As is null");
            return (Criteria) this;
        }

        public Criteria andAsIsNotNull() {
            addCriterion("As is not null");
            return (Criteria) this;
        }

        public Criteria andAsEqualTo(BigDecimal value) {
            addCriterion("As =", value, "as");
            return (Criteria) this;
        }

        public Criteria andAsNotEqualTo(BigDecimal value) {
            addCriterion("As <>", value, "as");
            return (Criteria) this;
        }

        public Criteria andAsGreaterThan(BigDecimal value) {
            addCriterion("As >", value, "as");
            return (Criteria) this;
        }

        public Criteria andAsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("As >=", value, "as");
            return (Criteria) this;
        }

        public Criteria andAsLessThan(BigDecimal value) {
            addCriterion("As <", value, "as");
            return (Criteria) this;
        }

        public Criteria andAsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("As <=", value, "as");
            return (Criteria) this;
        }

        public Criteria andAsIn(List<BigDecimal> values) {
            addCriterion("As in", values, "as");
            return (Criteria) this;
        }

        public Criteria andAsNotIn(List<BigDecimal> values) {
            addCriterion("As not in", values, "as");
            return (Criteria) this;
        }

        public Criteria andAsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("As between", value1, value2, "as");
            return (Criteria) this;
        }

        public Criteria andAsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("As not between", value1, value2, "as");
            return (Criteria) this;
        }

        public Criteria andCdIsNull() {
            addCriterion("cd is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("cd is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(BigDecimal value) {
            addCriterion("cd =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(BigDecimal value) {
            addCriterion("cd <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(BigDecimal value) {
            addCriterion("cd >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cd >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(BigDecimal value) {
            addCriterion("cd <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cd <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<BigDecimal> values) {
            addCriterion("cd in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<BigDecimal> values) {
            addCriterion("cd not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cd between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cd not between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCuIsNull() {
            addCriterion("cu is null");
            return (Criteria) this;
        }

        public Criteria andCuIsNotNull() {
            addCriterion("cu is not null");
            return (Criteria) this;
        }

        public Criteria andCuEqualTo(BigDecimal value) {
            addCriterion("cu =", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotEqualTo(BigDecimal value) {
            addCriterion("cu <>", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuGreaterThan(BigDecimal value) {
            addCriterion("cu >", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cu >=", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuLessThan(BigDecimal value) {
            addCriterion("cu <", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cu <=", value, "cu");
            return (Criteria) this;
        }

        public Criteria andCuIn(List<BigDecimal> values) {
            addCriterion("cu in", values, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotIn(List<BigDecimal> values) {
            addCriterion("cu not in", values, "cu");
            return (Criteria) this;
        }

        public Criteria andCuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cu between", value1, value2, "cu");
            return (Criteria) this;
        }

        public Criteria andCuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cu not between", value1, value2, "cu");
            return (Criteria) this;
        }

        public Criteria andHgIsNull() {
            addCriterion("hg is null");
            return (Criteria) this;
        }

        public Criteria andHgIsNotNull() {
            addCriterion("hg is not null");
            return (Criteria) this;
        }

        public Criteria andHgEqualTo(BigDecimal value) {
            addCriterion("hg =", value, "hg");
            return (Criteria) this;
        }

        public Criteria andHgNotEqualTo(BigDecimal value) {
            addCriterion("hg <>", value, "hg");
            return (Criteria) this;
        }

        public Criteria andHgGreaterThan(BigDecimal value) {
            addCriterion("hg >", value, "hg");
            return (Criteria) this;
        }

        public Criteria andHgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hg >=", value, "hg");
            return (Criteria) this;
        }

        public Criteria andHgLessThan(BigDecimal value) {
            addCriterion("hg <", value, "hg");
            return (Criteria) this;
        }

        public Criteria andHgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hg <=", value, "hg");
            return (Criteria) this;
        }

        public Criteria andHgIn(List<BigDecimal> values) {
            addCriterion("hg in", values, "hg");
            return (Criteria) this;
        }

        public Criteria andHgNotIn(List<BigDecimal> values) {
            addCriterion("hg not in", values, "hg");
            return (Criteria) this;
        }

        public Criteria andHgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hg between", value1, value2, "hg");
            return (Criteria) this;
        }

        public Criteria andHgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hg not between", value1, value2, "hg");
            return (Criteria) this;
        }

        public Criteria andPbIsNull() {
            addCriterion("pb is null");
            return (Criteria) this;
        }

        public Criteria andPbIsNotNull() {
            addCriterion("pb is not null");
            return (Criteria) this;
        }

        public Criteria andPbEqualTo(BigDecimal value) {
            addCriterion("pb =", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotEqualTo(BigDecimal value) {
            addCriterion("pb <>", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThan(BigDecimal value) {
            addCriterion("pb >", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pb >=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThan(BigDecimal value) {
            addCriterion("pb <", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pb <=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbIn(List<BigDecimal> values) {
            addCriterion("pb in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotIn(List<BigDecimal> values) {
            addCriterion("pb not in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pb between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pb not between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andZnIsNull() {
            addCriterion("zn is null");
            return (Criteria) this;
        }

        public Criteria andZnIsNotNull() {
            addCriterion("zn is not null");
            return (Criteria) this;
        }

        public Criteria andZnEqualTo(BigDecimal value) {
            addCriterion("zn =", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotEqualTo(BigDecimal value) {
            addCriterion("zn <>", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnGreaterThan(BigDecimal value) {
            addCriterion("zn >", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zn >=", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLessThan(BigDecimal value) {
            addCriterion("zn <", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zn <=", value, "zn");
            return (Criteria) this;
        }

        public Criteria andZnIn(List<BigDecimal> values) {
            addCriterion("zn in", values, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotIn(List<BigDecimal> values) {
            addCriterion("zn not in", values, "zn");
            return (Criteria) this;
        }

        public Criteria andZnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zn between", value1, value2, "zn");
            return (Criteria) this;
        }

        public Criteria andZnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zn not between", value1, value2, "zn");
            return (Criteria) this;
        }

        public Criteria andTocIsNull() {
            addCriterion("toc is null");
            return (Criteria) this;
        }

        public Criteria andTocIsNotNull() {
            addCriterion("toc is not null");
            return (Criteria) this;
        }

        public Criteria andTocEqualTo(BigDecimal value) {
            addCriterion("toc =", value, "toc");
            return (Criteria) this;
        }

        public Criteria andTocNotEqualTo(BigDecimal value) {
            addCriterion("toc <>", value, "toc");
            return (Criteria) this;
        }

        public Criteria andTocGreaterThan(BigDecimal value) {
            addCriterion("toc >", value, "toc");
            return (Criteria) this;
        }

        public Criteria andTocGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("toc >=", value, "toc");
            return (Criteria) this;
        }

        public Criteria andTocLessThan(BigDecimal value) {
            addCriterion("toc <", value, "toc");
            return (Criteria) this;
        }

        public Criteria andTocLessThanOrEqualTo(BigDecimal value) {
            addCriterion("toc <=", value, "toc");
            return (Criteria) this;
        }

        public Criteria andTocIn(List<BigDecimal> values) {
            addCriterion("toc in", values, "toc");
            return (Criteria) this;
        }

        public Criteria andTocNotIn(List<BigDecimal> values) {
            addCriterion("toc not in", values, "toc");
            return (Criteria) this;
        }

        public Criteria andTocBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("toc between", value1, value2, "toc");
            return (Criteria) this;
        }

        public Criteria andTocNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("toc not between", value1, value2, "toc");
            return (Criteria) this;
        }

        public Criteria andTnIsNull() {
            addCriterion("tn is null");
            return (Criteria) this;
        }

        public Criteria andTnIsNotNull() {
            addCriterion("tn is not null");
            return (Criteria) this;
        }

        public Criteria andTnEqualTo(BigDecimal value) {
            addCriterion("tn =", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotEqualTo(BigDecimal value) {
            addCriterion("tn <>", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnGreaterThan(BigDecimal value) {
            addCriterion("tn >", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tn >=", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnLessThan(BigDecimal value) {
            addCriterion("tn <", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tn <=", value, "tn");
            return (Criteria) this;
        }

        public Criteria andTnIn(List<BigDecimal> values) {
            addCriterion("tn in", values, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotIn(List<BigDecimal> values) {
            addCriterion("tn not in", values, "tn");
            return (Criteria) this;
        }

        public Criteria andTnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tn between", value1, value2, "tn");
            return (Criteria) this;
        }

        public Criteria andTnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tn not between", value1, value2, "tn");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("tp is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("tp is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(BigDecimal value) {
            addCriterion("tp =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(BigDecimal value) {
            addCriterion("tp <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(BigDecimal value) {
            addCriterion("tp >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tp >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(BigDecimal value) {
            addCriterion("tp <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tp <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<BigDecimal> values) {
            addCriterion("tp in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<BigDecimal> values) {
            addCriterion("tp not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp not between", value1, value2, "tp");
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