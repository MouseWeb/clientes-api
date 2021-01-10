package br.com.mouseweb.clientes.model.entity.Cliente;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 11)
    @CPF
    private String cpf;

    @Column(name = "data_cadastro", updatable = false)
    private LocalDate dataCadastro;

}