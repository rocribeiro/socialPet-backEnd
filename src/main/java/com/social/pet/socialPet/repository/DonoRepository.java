package com.social.pet.socialPet.repository;

import com.social.pet.socialPet.model.Dono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends JpaRepository<Dono,Long> {
    @Query(value="SELECT * FROM dono d WHERE d.id = :id",nativeQuery = true)
    public Dono buscarDonoId(@Param("id") Long id);
}
