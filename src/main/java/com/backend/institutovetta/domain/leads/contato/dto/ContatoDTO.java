package com.backend.institutovetta.domain.leads.contato.dto;

import jakarta.validation.constraints.NotBlank;

public record ContatoDTO(

        @NotBlank(message = "campo nome obrigatorio")
        String nome,

        @NotBlank(message = "campo email obrigatorio")
        String email,

        @NotBlank(message = "campo telefone obrigatorio")
        String telefone,

        @NotBlank(message = "campo curso interesse obrigatorio")
        String assunto,

        String mensagem
) {
}
