package com.social.pet.socialPet.controller;

        import com.social.pet.socialPet.http.ChamadaHttp;
        import com.social.pet.socialPet.model.Dono;
        import com.social.pet.socialPet.model.Pet;
        import com.social.pet.socialPet.service.PetService;
        import org.apache.coyote.Response;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;

        import java.io.IOException;
        import java.net.URISyntaxException;
        import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService petService;
    @PostMapping("/addPet")
    public @ResponseBody String adicionarAnimal(@RequestBody Pet pet){

        petService.addPet(pet);
        return "200";
    }
    @GetMapping("/")
    public @ResponseBody List<Pet> buscaPetsPerdidos(){
        return petService.buscaPetsPerdidos();
    }

    @GetMapping("/meusPets/{email}")
    public @ResponseBody List<Pet> meusPets(@PathVariable("email") String email){
        return petService.meusPets(email);
    }

    @GetMapping("/meusPetsEncontrados/{email}")
    public @ResponseBody List<Pet> meusPetsEncontrados(@PathVariable("email") String email){
        return petService.meusPetsEncontrados(email);
    }

    @GetMapping("/petEncontrado/{id}")
    public void petEncontrado(@PathVariable("id") String id){
        Pet pet = petService.petEncontrado(Long.parseLong(id));
        pet.setPerdido(false);
        adicionarAnimal(pet);

    }
    @PostMapping("/detect")
    public @ResponseBody  boolean reconhecerPer(@RequestBody Pet pet) throws IOException, URISyntaxException {
        ChamadaHttp http = new ChamadaHttp();
        if(http.chamada(pet.getBase64()) == true){
            if(pet.getAchado() == true){
                pet.setColorMarker("#00ff80");
            }else{
                pet.setColorMarker("#ff4000");
            }
            System.out.println(pet);
           adicionarAnimal(pet);
            return true;
        }else{
            return false;
        }

    }
}
