package com.social.pet.socialPet.controller;

import com.social.pet.socialPet.model.Animal;
import com.social.pet.socialPet.model.Dono;
import com.social.pet.socialPet.repository.AnimalRepository;
import com.social.pet.socialPet.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService as;
    @PostMapping("/addAnimal")
    public void AdcionarAnimal(@RequestBody Animal animal){
        as.addAnimal(animal);
    }
}
