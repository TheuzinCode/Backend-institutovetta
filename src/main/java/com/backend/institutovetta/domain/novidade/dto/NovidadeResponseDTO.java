package com.backend.institutovetta.domain.novidade.dto;

import java.util.UUID;

public record NovidadeResponseDTO(
        UUID id,
        String email
) {
}
