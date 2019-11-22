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
    public List<Pet> buscaPetsPerdidos(){
        return petRepository.buscaPetsPerdidos();
    }
    public List<Pet> meusPets(String email){
        return petRepository.meusPets(email);
    }
    public Pet petEncontrado(Long id){
        return petRepository.getOne(id);
    }
    public List<Pet> meusPetsEncontrados(String email){
        return petRepository.meusPetsEncontrados(email);
    }

}
