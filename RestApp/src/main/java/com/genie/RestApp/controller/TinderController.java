package com.genie.RestApp.controller;


import com.genie.RestApp.dto.Person;
import com.genie.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TinderController {

    @Autowired
    PersonService personService;

    @GetMapping("/getPersons")
    public List<Person> getAllPerson(){

        List<Person> allPersonData = personService.getAllPersonData();
        List<Person> filterData = personService.filterDataBasedOnGen(allPersonData);
        System.out.println(filterData);
        return filterData;

    }

    @PostMapping("/create-person")
    public String createUser(@RequestBody Person person){
        return "Data inserted sucessfully...";
    }

}
