package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.leadCursoEspecifico.LeadCurso;
import com.backend.institutovetta.domain.leads.leadCursoEspecifico.dto.LeadCursoDTO;
import com.backend.institutovetta.domain.leads.leadCursoEspecifico.dto.LeadCursoResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeadCursoEspecificoMapper {

    LeadCurso toEntity(LeadCursoDTO leadCursoDTO);

    LeadCursoResponseDTO toResponseDTO(LeadCurso leadCurso);
}
