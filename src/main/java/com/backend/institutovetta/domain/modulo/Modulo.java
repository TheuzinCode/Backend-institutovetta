package com.backend.institutovetta.domain.modulo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.backend.institutovetta.domain.curso.Curso;
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
@Table(name = "Modulos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @Column(name = "imagem-modulo", columnDefinition = "BYTEA")
    private byte[] imagemCapaModulo;

    @NotBlank(message = "A descrição é obrigatória.")
    private String descricao;

    @NotNull(message = "A duração é obrigatória.")
    @Min(value = 1, message = "A duração deve ser maior que 0.")
    private double duracao;

    @NotNull(message = "A avaliação é obrigatória.")
    @Min(value = 0, message = "A avaliação não pode ser negativa.")
    private double avaliacao;

    @ManyToMany(mappedBy = "modulos")
    @JsonIgnore
    private List<Curso> cursos = new ArrayList<>();


}
