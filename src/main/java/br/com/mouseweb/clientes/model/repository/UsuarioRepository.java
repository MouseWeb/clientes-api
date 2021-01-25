package br.com.mouseweb.clientes.model.repository;

import br.com.mouseweb.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);
    boolean existsByUsername(String username);

}
