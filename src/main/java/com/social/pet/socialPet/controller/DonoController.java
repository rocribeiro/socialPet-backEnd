package com.social.pet.socialPet.controller;

import com.social.pet.socialPet.model.Dono;
import com.social.pet.socialPet.service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dono")
public class DonoController {
    @Autowired
    private DonoService ds;

    @PostMapping("/addDono")
    public void AdcionarDono(@RequestBody Dono dono){
        ds.
    }
}
