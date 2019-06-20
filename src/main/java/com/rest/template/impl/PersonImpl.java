package com.rest.template.impl;

import com.rest.template.dto.Address;
import com.rest.template.dto.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonImpl {


    public List getAllPersons() {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Jane", 24, new Address("Harvey St", "Westland", "Michigan", "USA", 21117)));
        personList.add(new Person("Doe", 25, new Address("Shadow view drive", "Ballwin", "Missouri", "USA", 62704)));
        personList.add(new Person("Alex", 26, new Address("candleLight", "Chattam Hills", "Illinois", "USA", 63031)));

        return personList;
    }

    public Person getPersonByName(String name) {

        List<Person> personList = getAllPersons();
        return personList.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().get();

    }
}
