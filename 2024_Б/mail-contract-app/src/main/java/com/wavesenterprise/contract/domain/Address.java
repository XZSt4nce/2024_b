package com.wavesenterprise.contract.domain;

public class Address {
    private long postalCode;
    private String city;
    private String street;
    private String house;

    public Address() {
    }

    public Address(long postalCode, String city, String street, String house) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
