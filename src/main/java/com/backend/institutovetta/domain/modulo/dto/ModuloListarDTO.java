package com.backend.institutovetta.domain.modulo.dto;

public record ModuloListarDTO(
        Long id,
        String nome,
        String descricao,
        double duracao,
        double avaliacao
) {
}
