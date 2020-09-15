package cn.edu.zju.gislab.QDServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class YeoceanMlzooplankton {
    private Integer id;

    private Integer layerid;

    private Integer no;

    private String voy;

    private String area;

    private String station;

    private BigDecimal lon;

    private BigDecimal lat;

    private Date mtime;

    private Date endtime;

    private String nettype;

    private String sampnum;

    private Integer depth;

    private Integer ropelen;

    private String species;

    private String speciesL;

    private BigDecimal density;

    private BigDecimal biomass;

    private String recorder;

    private String collector;

    private String entryper;

    private String reader;

    private String surveyor;

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

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getNettype() {
        return nettype;
    }

    public void setNettype(String nettype) {
        this.nettype = nettype == null ? null : nettype.trim();
    }

    public String getSampnum() {
        return sampnum;
    }

    public void setSampnum(String sampnum) {
        this.sampnum = sampnum == null ? null : sampnum.trim();
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getRopelen() {
        return ropelen;
    }

    public void setRopelen(Integer ropelen) {
        this.ropelen = ropelen;
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

    public BigDecimal getBiomass() {
        return biomass;
    }

    public void setBiomass(BigDecimal biomass) {
        this.biomass = biomass;
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

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor == null ? null : surveyor.trim();
    }
}