package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class SedimentChemical {
    private Integer id;

    private Integer layerid;

    private Integer no;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private Date mtime;

    private BigDecimal depth;

    private String level;

    private BigDecimal ph;

    private BigDecimal pco2;

    private BigDecimal as;

    private BigDecimal cd;

    private BigDecimal cu;

    private BigDecimal hg;

    private BigDecimal pb;

    private BigDecimal zn;

    private BigDecimal toc;

    private BigDecimal tn;

    private BigDecimal tp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLayerid() {
        return layerid;
    }

    public void setLayerid(Integer layerid) {
        this.layerid = layerid;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public BigDecimal getPh() {
        return ph;
    }

    public void setPh(BigDecimal ph) {
        this.ph = ph;
    }

    public BigDecimal getPco2() {
        return pco2;
    }

    public void setPco2(BigDecimal pco2) {
        this.pco2 = pco2;
    }

    public BigDecimal getAs() {
        return as;
    }

    public void setAs(BigDecimal as) {
        this.as = as;
    }

    public BigDecimal getCd() {
        return cd;
    }

    public void setCd(BigDecimal cd) {
        this.cd = cd;
    }

    public BigDecimal getCu() {
        return cu;
    }

    public void setCu(BigDecimal cu) {
        this.cu = cu;
    }

    public BigDecimal getHg() {
        return hg;
    }

    public void setHg(BigDecimal hg) {
        this.hg = hg;
    }

    public BigDecimal getPb() {
        return pb;
    }

    public void setPb(BigDecimal pb) {
        this.pb = pb;
    }

    public BigDecimal getZn() {
        return zn;
    }

    public void setZn(BigDecimal zn) {
        this.zn = zn;
    }

    public BigDecimal getToc() {
        return toc;
    }

    public void setToc(BigDecimal toc) {
        this.toc = toc;
    }

    public BigDecimal getTn() {
        return tn;
    }

    public void setTn(BigDecimal tn) {
        this.tn = tn;
    }

    public BigDecimal getTp() {
        return tp;
    }

    public void setTp(BigDecimal tp) {
        this.tp = tp;
    }
}