package com.social.pet.socialPet.controller;

import com.social.pet.socialPet.model.Dono;
import com.social.pet.socialPet.service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dono")
public class DonoController {
    @Autowired
    private DonoService ds;


    @PostMapping("/addDono")
    @ResponseStatus(HttpStatus.OK)
    public void AdcionarDono(@RequestBody Dono dono){
        ds.addDono(dono);
    }

    @GetMapping("/buscarDono/{id}")
    public Dono buscarDono(@Param("id") Long id){
       return ds.buscarDono(id);
    }
}
