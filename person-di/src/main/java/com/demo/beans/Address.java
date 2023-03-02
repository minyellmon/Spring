package com.demo.beans;

public class Address {
    private String streetName="Creek Bridge Road";

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                '}';
    }
}
