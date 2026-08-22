package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.LeadCursoEspecifico.LeadCurso;
import com.backend.institutovetta.domain.leads.LeadCursoEspecifico.dto.LeadCursoDTO;
import com.backend.institutovetta.domain.leads.LeadCursoEspecifico.dto.LeadCursoResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeadCursoEspecificoMapper {

    LeadCurso toEntity(LeadCursoDTO leadCursoDTO);

    LeadCursoResponseDTO toResponseDTO(LeadCurso leadCurso);
}
