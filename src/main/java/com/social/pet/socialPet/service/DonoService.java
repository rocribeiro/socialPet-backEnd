package com.social.pet.socialPet.service;

        import com.social.pet.socialPet.model.Dono;
        import com.social.pet.socialPet.repository.DonoRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class DonoService {
    @Autowired
    private DonoRepository dr;

    public void addDono(Dono dono){
        dr.saveAndFlush(dono);
    }
    public void deleteDono(Dono dono){
        dr.delete(dono);
    }
    public Dono buscarDono(Long id){
        return dr.buscarDonoId(id);
    }
    public List<Dono> buscarDonos(){
        return dr.findAll();
    }
}
