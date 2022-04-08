package agatkafraczek.animalshelter.animalshelter.controllers;

import agatkafraczek.animalshelter.animalshelter.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/peopleList")
    public String getPeople(Model model){

        model.addAttribute("people", personRepository.findAll());
        return "people/peopleList";

    }
}
