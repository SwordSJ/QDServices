package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YeoceanCiliateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YeoceanCiliateExample() {
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

        public Criteria andInvunitIsNull() {
            addCriterion("invunit is null");
            return (Criteria) this;
        }

        public Criteria andInvunitIsNotNull() {
            addCriterion("invunit is not null");
            return (Criteria) this;
        }

        public Criteria andInvunitEqualTo(String value) {
            addCriterion("invunit =", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitNotEqualTo(String value) {
            addCriterion("invunit <>", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitGreaterThan(String value) {
            addCriterion("invunit >", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitGreaterThanOrEqualTo(String value) {
            addCriterion("invunit >=", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitLessThan(String value) {
            addCriterion("invunit <", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitLessThanOrEqualTo(String value) {
            addCriterion("invunit <=", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitLike(String value) {
            addCriterion("invunit like", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitNotLike(String value) {
            addCriterion("invunit not like", value, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitIn(List<String> values) {
            addCriterion("invunit in", values, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitNotIn(List<String> values) {
            addCriterion("invunit not in", values, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitBetween(String value1, String value2) {
            addCriterion("invunit between", value1, value2, "invunit");
            return (Criteria) this;
        }

        public Criteria andInvunitNotBetween(String value1, String value2) {
            addCriterion("invunit not between", value1, value2, "invunit");
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

        public Criteria andAttnIsNull() {
            addCriterion("attn is null");
            return (Criteria) this;
        }

        public Criteria andAttnIsNotNull() {
            addCriterion("attn is not null");
            return (Criteria) this;
        }

        public Criteria andAttnEqualTo(String value) {
            addCriterion("attn =", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotEqualTo(String value) {
            addCriterion("attn <>", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnGreaterThan(String value) {
            addCriterion("attn >", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnGreaterThanOrEqualTo(String value) {
            addCriterion("attn >=", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnLessThan(String value) {
            addCriterion("attn <", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnLessThanOrEqualTo(String value) {
            addCriterion("attn <=", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnLike(String value) {
            addCriterion("attn like", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotLike(String value) {
            addCriterion("attn not like", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnIn(List<String> values) {
            addCriterion("attn in", values, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotIn(List<String> values) {
            addCriterion("attn not in", values, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnBetween(String value1, String value2) {
            addCriterion("attn between", value1, value2, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotBetween(String value1, String value2) {
            addCriterion("attn not between", value1, value2, "attn");
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

        public Criteria andAloricateCiliateIsNull() {
            addCriterion("aloricate_ciliate is null");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateIsNotNull() {
            addCriterion("aloricate_ciliate is not null");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateEqualTo(BigDecimal value) {
            addCriterion("aloricate_ciliate =", value, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateNotEqualTo(BigDecimal value) {
            addCriterion("aloricate_ciliate <>", value, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateGreaterThan(BigDecimal value) {
            addCriterion("aloricate_ciliate >", value, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aloricate_ciliate >=", value, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateLessThan(BigDecimal value) {
            addCriterion("aloricate_ciliate <", value, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("aloricate_ciliate <=", value, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateIn(List<BigDecimal> values) {
            addCriterion("aloricate_ciliate in", values, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateNotIn(List<BigDecimal> values) {
            addCriterion("aloricate_ciliate not in", values, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aloricate_ciliate between", value1, value2, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andAloricateCiliateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aloricate_ciliate not between", value1, value2, "aloricateCiliate");
            return (Criteria) this;
        }

        public Criteria andTintinnidIsNull() {
            addCriterion("tintinnid is null");
            return (Criteria) this;
        }

        public Criteria andTintinnidIsNotNull() {
            addCriterion("tintinnid is not null");
            return (Criteria) this;
        }

        public Criteria andTintinnidEqualTo(BigDecimal value) {
            addCriterion("tintinnid =", value, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidNotEqualTo(BigDecimal value) {
            addCriterion("tintinnid <>", value, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidGreaterThan(BigDecimal value) {
            addCriterion("tintinnid >", value, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tintinnid >=", value, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidLessThan(BigDecimal value) {
            addCriterion("tintinnid <", value, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tintinnid <=", value, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidIn(List<BigDecimal> values) {
            addCriterion("tintinnid in", values, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidNotIn(List<BigDecimal> values) {
            addCriterion("tintinnid not in", values, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tintinnid between", value1, value2, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTintinnidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tintinnid not between", value1, value2, "tintinnid");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateIsNull() {
            addCriterion("total_ciliate is null");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateIsNotNull() {
            addCriterion("total_ciliate is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateEqualTo(BigDecimal value) {
            addCriterion("total_ciliate =", value, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateNotEqualTo(BigDecimal value) {
            addCriterion("total_ciliate <>", value, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateGreaterThan(BigDecimal value) {
            addCriterion("total_ciliate >", value, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_ciliate >=", value, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateLessThan(BigDecimal value) {
            addCriterion("total_ciliate <", value, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_ciliate <=", value, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateIn(List<BigDecimal> values) {
            addCriterion("total_ciliate in", values, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateNotIn(List<BigDecimal> values) {
            addCriterion("total_ciliate not in", values, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_ciliate between", value1, value2, "totalCiliate");
            return (Criteria) this;
        }

        public Criteria andTotalCiliateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_ciliate not between", value1, value2, "totalCiliate");
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