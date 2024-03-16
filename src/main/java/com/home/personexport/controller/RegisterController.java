package com.home.personexport.controller;

import com.home.personexport.model.entity.Person;
import com.home.personexport.model.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private PersonService personService;

    public RegisterController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public String register(@ModelAttribute("person") Person person){

        return "register";
    }
}
