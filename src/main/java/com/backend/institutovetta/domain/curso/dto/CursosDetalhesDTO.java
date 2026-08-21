package com.backend.institutovetta.domain.curso.dto;

import com.backend.institutovetta.domain.modulo.Modulo;

import java.util.List;

public record CursosDetalhesDTO(
        Long id,
        String nome,
        String descricao,
        double duracao,
        double avaliacao,
        byte [] imagemCurso,
        List<Modulo> modulos
) {
}
