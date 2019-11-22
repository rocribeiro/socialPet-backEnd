package com.social.pet.socialPet.repository;

import com.social.pet.socialPet.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    @Query(value="select * from pet p where p.perdido <>'true'",nativeQuery = true)
    List<Pet> buscaPetsPerdidos();

    @Query(value="select * from pet p where p.dono_email = :email",nativeQuery = true)
    List<Pet> meusPets(@Param("email")String email);


}
