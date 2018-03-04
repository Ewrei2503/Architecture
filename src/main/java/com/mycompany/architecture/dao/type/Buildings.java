package com.mycompany.architecture.dao.type;
public class Buildings {
    private long id;
    private boolean civil;
    private boolean enterprise;
    private long id_city;
    private long street;

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

    public long getId_city() {
        return id_city;
    }

    public void setIdsity(long id_city) {
        this.id_city = id_city;
    }

    public long getStreet() {
        return street;
    }

    public void setStreet(long street) {
        this.street = street;
    }   
}
