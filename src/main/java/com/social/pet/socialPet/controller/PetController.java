package com.social.pet.socialPet.controller;

        import com.social.pet.socialPet.model.Pet;
        import com.social.pet.socialPet.service.PetService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService as;
    @PostMapping("/addPet")
    public void AdcionarAnimal(@RequestBody Pet pet){
        as.addPet(pet);
    }
}
