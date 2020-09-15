package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class WaterChemical {
    private Integer id;

    private Integer layerid;

    private Date mtime;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private BigDecimal depth;

    private String level;

    private BigDecimal t;

    private BigDecimal ph;

    private BigDecimal do;

    private BigDecimal s;

    private BigDecimal po4P;

    private BigDecimal no3;

    private BigDecimal no2;

    private BigDecimal nh4;

    private BigDecimal sio3Si;

    private BigDecimal dtp;

    private BigDecimal dop;

    private BigDecimal dtn;

    private BigDecimal don;

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

    public BigDecimal getT() {
        return t;
    }

    public void setT(BigDecimal t) {
        this.t = t;
    }

    public BigDecimal getPh() {
        return ph;
    }

    public void setPh(BigDecimal ph) {
        this.ph = ph;
    }

    public BigDecimal getDo() {
        return do;
    }

    public void setDo(BigDecimal do) {
        this.do = do;
    }

    public BigDecimal getS() {
        return s;
    }

    public void setS(BigDecimal s) {
        this.s = s;
    }

    public BigDecimal getPo4P() {
        return po4P;
    }

    public void setPo4P(BigDecimal po4P) {
        this.po4P = po4P;
    }

    public BigDecimal getNo3() {
        return no3;
    }

    public void setNo3(BigDecimal no3) {
        this.no3 = no3;
    }

    public BigDecimal getNo2() {
        return no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getNh4() {
        return nh4;
    }

    public void setNh4(BigDecimal nh4) {
        this.nh4 = nh4;
    }

    public BigDecimal getSio3Si() {
        return sio3Si;
    }

    public void setSio3Si(BigDecimal sio3Si) {
        this.sio3Si = sio3Si;
    }

    public BigDecimal getDtp() {
        return dtp;
    }

    public void setDtp(BigDecimal dtp) {
        this.dtp = dtp;
    }

    public BigDecimal getDop() {
        return dop;
    }

    public void setDop(BigDecimal dop) {
        this.dop = dop;
    }

    public BigDecimal getDtn() {
        return dtn;
    }

    public void setDtn(BigDecimal dtn) {
        this.dtn = dtn;
    }

    public BigDecimal getDon() {
        return don;
    }

    public void setDon(BigDecimal don) {
        this.don = don;
    }
}