package com.rest.template.dto;


import javax.validation.constraints.*;

public class Person {

    @NotNull
    @NotBlank
    @Size(min = 1, max = 20)
    private String name;

    @Min(0)
    @Max(100)
    private Integer age;

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
