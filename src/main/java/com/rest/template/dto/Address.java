package com.rest.template.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Class represents a Address object.")
public class Address {
    @ApiModelProperty(notes = "Street name  of the Address.", example = "Harvey", position = 1)
    private String street;
    @ApiModelProperty(notes = "City name  of the Address.", example = "Detroit", position = 2)
    private String city;
    @ApiModelProperty(notes = "State name  of the Address.", example = "Maryland", position = 3)
    private String state;
    @ApiModelProperty(notes = "Country  of the Address.", example = "USA", position = 4)
    private String country;
    @ApiModelProperty(notes = "Zip code  of the Address.", example = "21117", position = 5)
    private Integer zipCode;

    public Address() {

    }

    public Address(String street, String city, String state, String country, Integer zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
}
