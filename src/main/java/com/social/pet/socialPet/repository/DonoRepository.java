package com.social.pet.socialPet.repository;

import com.social.pet.socialPet.model.Dono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends JpaRepository<Dono,Long> {
}
