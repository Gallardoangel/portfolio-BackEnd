package com.portfoliobackend.mgb.Security.Repository;

import com.portfoliobackend.mgb.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByRolNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario (String nombreUsuario);
    boolean existsByEmail (String email);

    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
