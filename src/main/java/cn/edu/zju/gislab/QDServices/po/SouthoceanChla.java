package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class SouthoceanChla {
    private Integer id;

    private Integer layerid;

    private Integer no;

    private String voy;

    private String area;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private Date mtime;

    private String level;

    private BigDecimal chla;

    private String sampway;

    private String testinst;

    private String anlyway;

    private String medium;

    private String extway;

    private String recorder;

    private String collector;

    private String entryper;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public BigDecimal getChla() {
        return chla;
    }

    public void setChla(BigDecimal chla) {
        this.chla = chla;
    }

    public String getSampway() {
        return sampway;
    }

    public void setSampway(String sampway) {
        this.sampway = sampway == null ? null : sampway.trim();
    }

    public String getTestinst() {
        return testinst;
    }

    public void setTestinst(String testinst) {
        this.testinst = testinst == null ? null : testinst.trim();
    }

    public String getAnlyway() {
        return anlyway;
    }

    public void setAnlyway(String anlyway) {
        this.anlyway = anlyway == null ? null : anlyway.trim();
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium == null ? null : medium.trim();
    }

    public String getExtway() {
        return extway;
    }

    public void setExtway(String extway) {
        this.extway = extway == null ? null : extway.trim();
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector == null ? null : collector.trim();
    }

    public String getEntryper() {
        return entryper;
    }

    public void setEntryper(String entryper) {
        this.entryper = entryper == null ? null : entryper.trim();
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader == null ? null : reader.trim();
    }
}