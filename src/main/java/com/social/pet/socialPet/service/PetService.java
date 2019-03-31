package com.social.pet.socialPet.service;

import com.social.pet.socialPet.model.Pet;
import com.social.pet.socialPet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    private PetRepository ar;
    public void addPet(Pet pet){
        ar.saveAndFlush(pet);
    }
    public void deletePet(Pet pet){
        ar.delete(pet);
    }
    public Pet buscaPetId(Long id){
        return ar.buscaPetId(id);
    }
    public List<Pet> buscarPetss(){
        return ar.findAll();
    }
}
