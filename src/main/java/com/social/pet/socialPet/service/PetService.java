package com.social.pet.socialPet.service;

import com.social.pet.socialPet.model.Pet;
import com.social.pet.socialPet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;
    @Transactional
    public void addPet(Pet pet){
        petRepository.saveAndFlush(pet);
    }
    public void deletePet(Pet pet){
        petRepository.delete(pet);
    }
    public List<Pet> buscarPetss(){
        return petRepository.findAll();
    }
    public List<Pet> buscaPetsPerdidos(){
        return petRepository.buscaPetsPerdidos();
    }
}
