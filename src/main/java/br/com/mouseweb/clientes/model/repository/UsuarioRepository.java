package br.com.mouseweb.clientes.model.repository;

import br.com.mouseweb.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
