package com.rest.template;

import com.rest.template.dto.Person;
import com.rest.template.impl.PersonImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api("Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class PersonController {

    @Autowired
    PersonImpl personImpl;


    @RequestMapping(method = RequestMethod.GET, produces = "application/json",path = "/person")
    @ApiOperation("Returns the list of all Persons in the system.")
    public List getAllPersons() {
        return personImpl.getAllPersons();
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json",path = "/person/{name}")
    @ApiOperation("Returns the list of all Persons in the system.")
    public Person getPersonByName(@PathVariable String name) {
        return personImpl.getPersonByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json",path = "/person")
    @ApiOperation("Returns the list of all Persons in the system.")
    public void addPerson(@RequestBody Person person) {
        personImpl.addPerson(person);
    }
}