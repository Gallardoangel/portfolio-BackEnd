package com.portfoliobackend.mgb.Repository;

import com.portfoliobackend.mgb.Entity.Work;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RWork extends JpaRepository<Work, Integer>{
    public Optional<Work> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
