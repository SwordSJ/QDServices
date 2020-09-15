package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class SouthoceanPhytoplankton {
    private Integer id;

    private Integer layerid;

    private Integer no;

    private String voy;

    private String area;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private Date mtime;

    private String trawlnet;

    private String phylum;

    private String class;

    private String orderC;

    private String family;

    private String genus;

    private String species;

    private String speciesL;

    private BigDecimal density;

    private String sampway;

    private String surveyor;

    private String medium;

    private String extway;

    private String recorder;

    private String collector;

    private String entryper;

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

    public String getTrawlnet() {
        return trawlnet;
    }

    public void setTrawlnet(String trawlnet) {
        this.trawlnet = trawlnet == null ? null : trawlnet.trim();
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum == null ? null : phylum.trim();
    }

    public String getClass() {
        return class;
    }

    public void setClass(String class) {
        this.class = class == null ? null : class.trim();
    }

    public String getOrderC() {
        return orderC;
    }

    public void setOrderC(String orderC) {
        this.orderC = orderC == null ? null : orderC.trim();
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family == null ? null : family.trim();
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus == null ? null : genus.trim();
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

    public BigDecimal getDensity() {
        return density;
    }

    public void setDensity(BigDecimal density) {
        this.density = density;
    }

    public String getSampway() {
        return sampway;
    }

    public void setSampway(String sampway) {
        this.sampway = sampway == null ? null : sampway.trim();
    }

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor == null ? null : surveyor.trim();
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
}