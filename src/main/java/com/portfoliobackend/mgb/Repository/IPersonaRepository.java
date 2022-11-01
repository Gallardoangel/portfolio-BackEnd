package com.portfoliobackend.mgb.Repository;

import com.portfoliobackend.mgb.Entity.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
