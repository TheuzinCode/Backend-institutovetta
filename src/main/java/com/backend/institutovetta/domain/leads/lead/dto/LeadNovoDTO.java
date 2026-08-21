package com.backend.institutovetta.domain.leads.lead.dto;

import jakarta.validation.constraints.NotBlank;

public record LeadNovoDTO(

        @NotBlank(message = "campo nome obrigatorio")
        String nome,

        @NotBlank(message = "campo email obrigatorio")
        String email,

        @NotBlank(message = "campo numero obrigatorio")
        String numero,

        @NotBlank(message = "campo curso obrigatorio")
        String cursoInteressado,

        String mensagem
) {
}
