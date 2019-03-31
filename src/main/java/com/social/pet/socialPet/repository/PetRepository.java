package com.social.pet.socialPet.repository;

import com.social.pet.socialPet.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    @Query(value="SELECT * FROM pet p WHERE p.id = :id",nativeQuery = true)
    public Pet buscaPetId(@Param("id") Long id);

}
