package com.social.pet.socialPet.controller;

        import com.social.pet.socialPet.model.Pet;
        import com.social.pet.socialPet.service.PetService;
        import org.apache.coyote.Response;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService petService;
    @PostMapping("/addPet")
    public @ResponseBody String AdcionarAnimal(@RequestBody Pet pet){

        petService.addPet(pet);
        return "200";
    }
    @GetMapping("/")
    public @ResponseBody List<Pet> buscaPetsPerdidos(){
        return petService.buscaPetsPerdidos();
    }
}
