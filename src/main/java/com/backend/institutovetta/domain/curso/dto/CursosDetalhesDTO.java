package com.backend.institutovetta.domain.curso.dto;

import com.backend.institutovetta.domain.modulo.Modulo;

import java.util.List;

public record CursosDetalhesDTO(
        Long id,
        String nome,
        String descricao,
        String categoria,
        String sobreCurso,
        double duracao,
        double avaliacao,
        byte[] imagemCapaCurso,
        List<Modulo> modulos
) {
}
