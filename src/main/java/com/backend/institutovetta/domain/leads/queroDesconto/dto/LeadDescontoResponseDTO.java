package com.backend.institutovetta.domain.leads.queroDesconto.dto;

import java.util.UUID;

public record LeadDescontoResponseDTO(
        UUID id,
        String nome,
        String numero,
        String email,
        String unidade
) {
}
