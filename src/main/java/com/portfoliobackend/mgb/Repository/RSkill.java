package com.portfoliobackend.mgb.Repository;

import com.portfoliobackend.mgb.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface RSkill extends JpaRepository<Skill, Integer>{
    Optional<Skill> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
