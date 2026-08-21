package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.interesse.Interesse;
import com.backend.institutovetta.domain.leads.interesse.dto.InteresseDTO;
import com.backend.institutovetta.domain.leads.interesse.dto.InteresseResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface InteressesMapper {

    Interesse toEntity(InteresseDTO interesseDTO);

     InteresseResponseDTO toDTO (Interesse Interesse);

}
