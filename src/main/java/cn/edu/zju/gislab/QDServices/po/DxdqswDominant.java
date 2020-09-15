package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class DxdqswDominant {
    private Integer id;

    private Integer layerid;

    private Date mtime;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private String species;

    private String speciesL;

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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species == null ? null : species.trim();
    }

    public String getSpeciesL() {
        return speciesL;
    }

    public void setSpeciesL(String speciesL) {
        this.speciesL = speciesL == null ? null : speciesL.trim();
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