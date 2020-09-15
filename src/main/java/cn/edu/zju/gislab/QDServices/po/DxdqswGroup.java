package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class DxdqswGroup {
    private Integer id;

    private Integer layerid;

    private Date mtime;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private String groupC;

    private String groupL;

    private BigDecimal abundance;

    private String invway;

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

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
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

    public String getGroupC() {
        return groupC;
    }

    public void setGroupC(String groupC) {
        this.groupC = groupC == null ? null : groupC.trim();
    }

    public String getGroupL() {
        return groupL;
    }

    public void setGroupL(String groupL) {
        this.groupL = groupL == null ? null : groupL.trim();
    }

    public BigDecimal getAbundance() {
        return abundance;
    }

    public void setAbundance(BigDecimal abundance) {
        this.abundance = abundance;
    }

    public String getInvway() {
        return invway;
    }

    public void setInvway(String invway) {
        this.invway = invway == null ? null : invway.trim();
    }
}