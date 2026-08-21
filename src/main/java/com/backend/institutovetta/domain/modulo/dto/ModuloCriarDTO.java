package com.backend.institutovetta.domain.modulo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ModuloCriarDTO(
        @NotBlank(message = "Campo nome é obrigatorio")
        String nome,


        byte[] imagemCapaModulo,

        @NotBlank(message = "Campo descricao é obrigatorio")
        String descricao,

        @NotNull(message = "Campo duracao é obrigatorio")
        double duracao,

        @NotNull(message = "Campo avaliacao é obrigatorio")
        double avaliacao
) {
}
