package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.leads.queroDesconto.dto.LeadDescontoResponseDTO;
import com.backend.institutovetta.domain.leads.queroDesconto.LeadDesconto;
import com.backend.institutovetta.domain.leads.queroDesconto.dto.LeadDescontoNovoDTO;
import com.backend.institutovetta.mapper.LeadDescontoMapper;
import com.backend.institutovetta.repository.LeadDescontoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LeadDescontoService {

    private LeadDescontoRepository leadDescontoRepository;
    private LeadDescontoMapper mapper;

    public LeadDescontoResponseDTO salvarLead(LeadDescontoNovoDTO leadDescontoNovoDTO){

        LeadDesconto leadDescontoEntity = mapper.toEntity(leadDescontoNovoDTO);

        LeadDesconto leadDescontoSave = leadDescontoRepository.save(leadDescontoEntity);

        LeadDescontoResponseDTO leadDescontoResponseDTO = mapper.toDTO(leadDescontoSave);

        return leadDescontoResponseDTO;

    }
}
