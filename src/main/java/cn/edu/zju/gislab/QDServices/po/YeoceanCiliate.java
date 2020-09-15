package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class YeoceanCiliate {
    private Integer id;

    private Integer layerid;

    private String voy;

    private String station;

    private String invunit;

    private String source;

    private String attn;

    private BigDecimal lon;

    private BigDecimal lat;

    private Date mtime;

    private BigDecimal depth;

    private String level;

    private BigDecimal aloricateCiliate;

    private BigDecimal tintinnid;

    private BigDecimal totalCiliate;

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

    public String getVoy() {
        return voy;
    }

    public void setVoy(String voy) {
        this.voy = voy == null ? null : voy.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getInvunit() {
        return invunit;
    }

    public void setInvunit(String invunit) {
        this.invunit = invunit == null ? null : invunit.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getAttn() {
        return attn;
    }

    public void setAttn(String attn) {
        this.attn = attn == null ? null : attn.trim();
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

    public BigDecimal getAloricateCiliate() {
        return aloricateCiliate;
    }

    public void setAloricateCiliate(BigDecimal aloricateCiliate) {
        this.aloricateCiliate = aloricateCiliate;
    }

    public BigDecimal getTintinnid() {
        return tintinnid;
    }

    public void setTintinnid(BigDecimal tintinnid) {
        this.tintinnid = tintinnid;
    }

    public BigDecimal getTotalCiliate() {
        return totalCiliate;
    }

    public void setTotalCiliate(BigDecimal totalCiliate) {
        this.totalCiliate = totalCiliate;
    }
}