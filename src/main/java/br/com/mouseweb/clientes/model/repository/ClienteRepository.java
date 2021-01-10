package br.com.mouseweb.clientes.model.repository;

import br.com.mouseweb.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
