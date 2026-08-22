package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.contato.Interesse;
import com.backend.institutovetta.domain.leads.contato.dto.InteresseDTO;
import com.backend.institutovetta.domain.leads.contato.dto.InteresseResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InteressesMapper {

    Interesse toEntity(InteresseDTO interesseDTO);

     InteresseResponseDTO toDTO (Interesse Interesse);

}
