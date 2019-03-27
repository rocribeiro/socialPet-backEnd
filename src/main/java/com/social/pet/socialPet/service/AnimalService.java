package com.social.pet.socialPet.service;

import com.social.pet.socialPet.model.Animal;
import com.social.pet.socialPet.model.Dono;
import com.social.pet.socialPet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository ar;
    private void addDono(Animal animal){
        ar.saveAndFlush(animal);
    }
    private void deleteDono(Animal animal){
        ar.delete(animal);
    }
    private Animal buscaAnimalId(Long id){
        return ar.buscaAnimalId(id);
    }
    private List<Animal> buscarAnimais(){
        return ar.findAll();
    }
}
