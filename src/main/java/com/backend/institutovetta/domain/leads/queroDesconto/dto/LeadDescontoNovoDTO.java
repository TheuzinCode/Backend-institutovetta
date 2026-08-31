package com.backend.institutovetta.domain.leads.queroDesconto.dto;


import jakarta.validation.constraints.NotBlank;

public record LeadDescontoNovoDTO(

        @NotBlank(message = "campo nome é obrigatorio")
        String nome,

        @NotBlank(message = "campo numero é obrigatorio")
        String numero,

        @NotBlank(message = "campo email é obrigatorio")
        String email,

        @NotBlank(message = "campo unidade é obrigatorio")
        String unidade
) {
}
