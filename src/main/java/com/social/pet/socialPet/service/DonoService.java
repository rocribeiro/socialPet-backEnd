package com.social.pet.socialPet.service;

        import com.social.pet.socialPet.model.Dono;
import com.social.pet.socialPet.model.Endereco;
import com.social.pet.socialPet.model.Pet;
import com.social.pet.socialPet.repository.DonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

        import javax.transaction.Transactional;
        import java.util.List;

@Service
public class DonoService {
    @Autowired
    private DonoRepository dr;
    @Autowired
    private PetService petService;
    @Autowired
    private EnderecoService enderecoService;



    public Dono addDono(Dono dono){
        return dr.saveAndFlush(dono);
    }
    public void deleteDono(Dono dono){
        dr.delete(dono);
    }
    @Transactional
    public void processaEntidades(Dono dono){
        List<Pet> pets = dono.getPets();
        Endereco endereco = dono.getEndereco();
        dono.setEndereco(null);
        dono.setPets(null);
        dono = addDono(dono);
        endereco.setDono(dono);
        enderecoService.save(endereco);
        for (Pet pet:pets) {
            pet.setDono(dono);
            petService.addPet(pet);
        }
    }
    public Dono buscarDono(Long id){
        return dr.buscarDonoId(id);
    }
    public List<Dono> buscarDonos(){
        return dr.findAll();
    }
}
