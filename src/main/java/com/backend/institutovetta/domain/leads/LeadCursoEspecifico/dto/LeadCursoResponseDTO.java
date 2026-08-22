package com.backend.institutovetta.domain.leads.LeadCursoEspecifico.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record LeadCursoResponseDTO(
        UUID id,
        String nome,
        String email,
        String telefone,
        String cursoEscolhido
) {
}
