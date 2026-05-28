package com.crudfael.projetoCad.infrastructure.entitys;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Email", unique = true)
    private String email;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "CPF")
    private String cpf;
}
