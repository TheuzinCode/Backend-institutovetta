package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.novidade.Novidade;
import com.backend.institutovetta.domain.novidade.dto.NovidadeRequestDTO;
import com.backend.institutovetta.domain.novidade.dto.NovidadeResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NovidadeMapper {

    Novidade toEntity(NovidadeRequestDTO requestDTO);

    NovidadeResponseDTO toDTO(Novidade novidade);
}
