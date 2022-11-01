
package com.federicomateos.fmp.Security.Repository;

import com.federicomateos.fmp.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
Optional<Usuario> findByNombreUsuario (String nombreUsuario);    

boolean existsByNombreUsuario (String nombreusuario);
boolean existsByEmail(String email);
}
