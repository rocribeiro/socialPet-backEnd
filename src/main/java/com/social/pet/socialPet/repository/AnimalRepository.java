package com.social.pet.socialPet.repository;

import com.social.pet.socialPet.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query(value="SELECT * FROM animal a WHERE a.id = :id",nativeQuery = true)
    public Animal buscaAnimalId(@Param("id") Long id);
}
