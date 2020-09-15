package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class SouthoceanPicophoorg {
    private Integer id;

    private Integer layerid;

    private Integer no;

    private String voy;

    private String area;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private Date mtime;

    private BigDecimal depth;

    private String level;

    private BigDecimal synechococcus;

    private BigDecimal prochlorococcus;

    private BigDecimal picoeukaryote;

    private String sampway;

    private String anlyway;

    private String source;

    private String collector;

    private String reader;

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

    public String getVoy() {
        return voy;
    }

    public void setVoy(String voy) {
        this.voy = voy == null ? null : voy.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
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

    public BigDecimal getSynechococcus() {
        return synechococcus;
    }

    public void setSynechococcus(BigDecimal synechococcus) {
        this.synechococcus = synechococcus;
    }

    public BigDecimal getProchlorococcus() {
        return prochlorococcus;
    }

    public void setProchlorococcus(BigDecimal prochlorococcus) {
        this.prochlorococcus = prochlorococcus;
    }

    public BigDecimal getPicoeukaryote() {
        return picoeukaryote;
    }

    public void setPicoeukaryote(BigDecimal picoeukaryote) {
        this.picoeukaryote = picoeukaryote;
    }

    public String getSampway() {
        return sampway;
    }

    public void setSampway(String sampway) {
        this.sampway = sampway == null ? null : sampway.trim();
    }

    public String getAnlyway() {
        return anlyway;
    }

    public void setAnlyway(String anlyway) {
        this.anlyway = anlyway == null ? null : anlyway.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector == null ? null : collector.trim();
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader == null ? null : reader.trim();
    }
}