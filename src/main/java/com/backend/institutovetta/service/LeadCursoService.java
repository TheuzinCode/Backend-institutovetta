package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.leads.LeadCursoEspecifico.LeadCurso;
import com.backend.institutovetta.domain.leads.LeadCursoEspecifico.dto.LeadCursoDTO;
import com.backend.institutovetta.domain.leads.LeadCursoEspecifico.dto.LeadCursoResponseDTO;
import com.backend.institutovetta.mapper.LeadCursoEspecificoMapper;
import com.backend.institutovetta.repository.LeadCursoRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LeadCursoService {

    private LeadCursoEspecificoMapper mapper;

    private LeadCursoRespository leadCursoRespository;


    public LeadCursoResponseDTO novoLeadCurso(LeadCursoDTO leadCursoDTO){

        LeadCurso entity = mapper.toEntity(leadCursoDTO);

        LeadCurso entitySave = leadCursoRespository.save(entity);

        return mapper.toResponseDTO(entitySave);

    }

}
