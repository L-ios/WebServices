package com.topwisesz.topwiseos.webservices.bean;

public class Device {
    private int id;
    private String rid;
    private String imei;
    private String swVersion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion;
    }

    @Override
    public String toString() {
        return "{id: " + id + ", rid: " + rid + ", imei: " + imei + ", swVersion: " + swVersion + "}";
    }
}
