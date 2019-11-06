package com.rest.template;
fsfnksdnf
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


    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/person")
    @ApiOperation("Returns the list of all Persons in the system.")
    public List getAllPersons() {
        return personImpl.getAllPersons();
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path = "/person/{name}")
    @ApiOperation("Returns a person by name.")
    public Person getPersonByName(@PathVariable String name) {
        return personImpl.getPersonByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", path = "/person")
    @ApiOperation("Adds a person object to the person list.")
    public void addPerson(@RequestBody Person person) {
        personImpl.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/person/{name}")
    @ApiOperation("Deletes a specific person based on the name")
    public void deletePerson(@PathVariable String name) {

        personImpl.deletePerson(name);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", path = "/person/{name}")
    @ApiOperation("Returns the list of all Persons in the system.")
    public void addPerson(@RequestBody Person person,@PathVariable String name) {
        personImpl.updatePerson(name, person);
    }
}