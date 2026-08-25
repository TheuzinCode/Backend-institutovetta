package com.backend.institutovetta.domain.leads.contato.dto;

import java.util.UUID;

public record ContatoResponseDTO(

        UUID id,
        String nome,
        String email,
        String telefone,
        String assunto,
        String mensagem
) {
}
