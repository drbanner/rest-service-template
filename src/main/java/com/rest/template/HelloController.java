package com.rest.template;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api("Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class HelloController {


    @RequestMapping(method = RequestMethod.GET, path = "/hi")
    @ApiOperation("Returns hi as a get service")
    public String getResponse() {
        return "Hi ";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    @ApiOperation("Returns hello as a get service")
    public String getResponseWithParams( @RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }
}