package com.backend.institutovetta.domain.curso.dto;

public record CursoListarDTO(

        Long id,

        String nome,

        String descricao,

        String categoria,

        double duracao,

        double avaliacao,

        byte [] imagemCurso
) {
}
