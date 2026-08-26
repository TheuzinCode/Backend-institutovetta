package com.backend.institutovetta.domain.curso.dto;

import com.backend.institutovetta.domain.modulo.Modulo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CursoCriarDTO(

        @NotBlank(message = "campo nome obrigatorio")
        String nome,

        @NotBlank(message = "campo descricao obrigatorio")
        String descricao,

        @NotBlank(message = "campo categoria obrigatorio")
        String categoria,

        @NotBlank(message = "o resumo é obrigatorio.")
        String sobreCurso,

        @NotNull(message = "campo duracao obrigatorio")
        double duracao,

        @NotNull(message = "campo avaliacao obrigatorio")
        double avaliacao,

        byte [] imagemCurso,

        @NotBlank(message = "campo modulos obrigatorio")
        List<Modulo> modulos
) {
}
