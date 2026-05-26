package com.crudfael.projetoCad.infrastructure.entitys;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Usuario")
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome", unique = false)
    private String nome;

    @Column(name = "cpf", unique = true)
    private String cpf;

    
}
