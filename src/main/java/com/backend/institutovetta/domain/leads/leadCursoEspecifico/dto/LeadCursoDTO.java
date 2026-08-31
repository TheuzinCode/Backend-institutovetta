package com.backend.institutovetta.domain.leads.leadCursoEspecifico.dto;

import jakarta.validation.constraints.NotBlank;

public record LeadCursoDTO(

        @NotBlank(message = "campo nome obrigatorio")
        String nome,

        @NotBlank(message = "campo email obrigatorio")
        String email,

        @NotBlank(message = "campo telefone obrigatorio")
        String telefone,

        String cursoEscolhido
) {
}
