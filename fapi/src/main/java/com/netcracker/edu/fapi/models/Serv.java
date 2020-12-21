package com.netcracker.edu.fapi.models;

import java.util.Objects;

public class Serv {
    private long id;
    private String serviceDescription;
    private String serviceName;
    private long price;
    private String picturePath;

    public Serv() {}

    public Serv(long id, String serviceDescription, String serviceName, long price, String picturePath) {
        this.id = id;
        this.serviceDescription = serviceDescription;
        this.serviceName = serviceName;
        this.price = price;
        this.picturePath = picturePath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serv serv = (Serv) o;
        return id == serv.id &&
                price == serv.price &&
                Objects.equals(serviceDescription, serv.serviceDescription) &&
                Objects.equals(serviceName, serv.serviceName) &&
                Objects.equals(picturePath, serv.picturePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceDescription, serviceName, price, picturePath);
    }

    @Override
    public String toString() {
        return "Serv{" +
                "id=" + id +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", price=" + price +
                ", picturePath='" + picturePath + '\'' +
                '}';
    }
}
