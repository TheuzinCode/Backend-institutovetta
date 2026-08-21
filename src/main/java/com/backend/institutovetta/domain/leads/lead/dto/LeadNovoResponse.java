package com.backend.institutovetta.domain.leads.lead.dto;

public record LeadNovoResponse(
        Long id,
        String nome,
        String email,
        String numero,
        String cursoInteressado,
        String mensagem
) {
}
