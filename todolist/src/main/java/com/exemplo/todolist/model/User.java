package com.exemplo.todolist.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// ... outras importações

@Data // <-- Adiciona getters, setters, etc. para todos os campos
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users") // "user" é uma palavra reservada em alguns bancos de dados
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    // Com a anotação @Data, você não precisa escrever os getters e setters aqui.
}