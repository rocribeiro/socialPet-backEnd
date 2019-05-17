package com.social.pet.socialPet.service;

import com.social.pet.socialPet.model.Endereco;
import com.social.pet.socialPet.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public void save(Endereco endereco){
        enderecoRepository.saveAndFlush(endereco);
    }
}
