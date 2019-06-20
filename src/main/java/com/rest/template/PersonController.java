package com.rest.template;

import com.rest.template.dto.Person;
import com.rest.template.impl.PersonImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


}