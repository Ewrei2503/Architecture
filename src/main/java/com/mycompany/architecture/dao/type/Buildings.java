package com.mycompany.architecture.dao.type;
public class Buildings {
    private long id;
    private boolean civil;
    private boolean enterprise;
    private String gps;
    private String gpsAdress;
    private String Adress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCivil() {
        return civil;
    }

    public void setCivil(boolean civil) {
        this.civil = civil;
    }

    public boolean isEnterprise() {
        return enterprise;
    }

    public void setEnterprise(boolean enterprise) {
        this.enterprise = enterprise;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getGpsAdress() {
        return gpsAdress;
    }

    public void setGpsAdress(String gpsAdress) {
        this.gpsAdress = gpsAdress;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
    
    
    
}
