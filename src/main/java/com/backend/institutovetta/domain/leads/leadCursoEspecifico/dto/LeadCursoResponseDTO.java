package com.backend.institutovetta.domain.leads.leadCursoEspecifico.dto;

import java.util.UUID;

public record LeadCursoResponseDTO(
        UUID id,
        String nome,
        String email,
        String telefone,
        String cursoEscolhido
) {
}
