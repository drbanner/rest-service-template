package com.rest.template.impl;

import com.rest.template.dto.Address;
import com.rest.template.dto.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class PersonImpl {


    List<Person> personList = new ArrayList<>(Arrays.asList(new Person("Jane", 24, new Address("Harvey St", "Westland", "Michigan", "USA", 21117)),
            new Person("Doe", 25, new Address("Shadow view drive", "Ballwin", "Missouri", "USA", 62704)),
            new Person("Brat", 28, new Address("Meadow Mills Rd", "Owings mills", "Maryland", "USA", 21117)),
            new Person("Alex", 26, new Address("candleLight", "Chattam Hills", "Illinois", "USA", 63031))));


    public List getAllPersons() {

        return personList;
    }

    public Person getPersonByName(String name) {
        try {
            List<Person> personList = getAllPersons();
            return personList.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().get();

        } catch (NoSuchElementException suchElementException) {

            suchElementException.printStackTrace();

        }
        return null;

    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void deletePerson(String name) {

        personList.removeIf(person -> person.getName().equalsIgnoreCase(name));
    }

    public void updatePerson(String name, Person person) {
        for (int i = 1; i < personList.size(); i++) {
            Person person1 = personList.get(i);
            if (person1.getName().equalsIgnoreCase(name)) {
                personList.set(i, person);
                break;
            }
        }
    }
}
