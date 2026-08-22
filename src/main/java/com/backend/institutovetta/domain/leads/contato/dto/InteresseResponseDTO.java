package com.backend.institutovetta.domain.leads.contato.dto;

import java.util.UUID;

public record InteresseResponseDTO(

        UUID id,
        String nome,
        String email,
        String telefone,
        String cursoInteresse
) {
}
