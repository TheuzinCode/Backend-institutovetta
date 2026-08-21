package com.backend.institutovetta.domain.curso;


import com.backend.institutovetta.domain.modulo.Modulo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cursos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O descricao é obrigatório.")
    private String descricao;

    @Column(name = "imagem-curso", columnDefinition = "BYTEA")
    private byte[] imagemCapaCurso;

    @NotNull(message = "O duracao é obrigatório.")
    @Min(value = 1, message = "A duração deve ser maior que 0.")
    private double duracao;

    @NotNull(message = "O avaliacao é obrigatório.")
    @Min(value = 1, message = "A avaliacao deve ser maior que 0.")
    private double avaliacao;

    @NotBlank(message = "O avaliacao é obrigatório.")
    private String categoria;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "cursos_e_modulo",
            joinColumns = @JoinColumn(name = "cursoId"),
            inverseJoinColumns  = @JoinColumn(name = "moduloId")
    )
    private List<Modulo> modulos = new ArrayList<>();

}
