package com.backend.institutovetta.domain.leads.interesse.dto;

import jakarta.validation.constraints.NotBlank;

public record InteresseDTO(

        @NotBlank(message = "campo nome obrigatorio")
        String nome,

        @NotBlank(message = "campo email obrigatorio")
        String email,

        @NotBlank(message = "campo telefone obrigatorio")
        String telefone,

        @NotBlank(message = "campo curso interesse obrigatorio")
        String cursoInteresse
) {
}
