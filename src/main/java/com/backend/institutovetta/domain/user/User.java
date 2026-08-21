package com.backend.institutovetta.domain.user;


import com.backend.institutovetta.domain.curso.Curso;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O email é obrigatório.")
    private String email;

    @NotBlank(message = "O senha é obrigatório.")
    private String senha;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "user_favoritos",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "cursoId")
    )
    private Set<Curso> favoritos = new HashSet<>();

    public void addFavorito(Curso curso){
        favoritos.add(curso);
    }

    public  void removeFavorito(Curso curso){
        favoritos.remove(curso);
    }

}
