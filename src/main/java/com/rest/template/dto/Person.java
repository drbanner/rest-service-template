package com.rest.template.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;
fsfsfsfs
@ApiModel(description = "Class represents a person object.")
public class Person {


    @Size(min = 1, max = 20)
    @ApiModelProperty(notes = "Unique identifier of the person. No two persons can have the same name.", example = "James", required = true, position = 0)
    private String name;

    @Min(0)
    @Max(100)
    @ApiModelProperty(notes = "Age of the person. Non-negative integer", example = "42", position = 2)
    private Integer age;

    @ApiModelProperty(notes = "Address of the person.", position = 3)
    private Address address;

    public Person() {
    }

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
