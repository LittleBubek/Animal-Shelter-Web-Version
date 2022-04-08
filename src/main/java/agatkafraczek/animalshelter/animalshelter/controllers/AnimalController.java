package agatkafraczek.animalshelter.animalshelter.controllers;

import agatkafraczek.animalshelter.animalshelter.repositories.AnimalRepository;
import agatkafraczek.animalshelter.animalshelter.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnimalController {

    private final AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @RequestMapping("/shelter")
    public String getAnimals(Model model){

        model.addAttribute("animals", animalRepository.findAll());
        return "animals/shelter";

    }
}
