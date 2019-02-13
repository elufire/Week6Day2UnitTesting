package com.example.week6day2unittesting;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postal;
    private String country;

    public Address(String street, String city, String state, String postal, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postal = postal;
        this.country = country;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
