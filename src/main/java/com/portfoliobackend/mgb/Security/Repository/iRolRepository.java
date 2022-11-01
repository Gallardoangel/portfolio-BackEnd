package com.portfoliobackend.mgb.Security.Repository;

import com.portfoliobackend.mgb.Security.Entity.Rol;
import com.portfoliobackend.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
