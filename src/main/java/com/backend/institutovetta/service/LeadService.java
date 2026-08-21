package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.leads.lead.Lead;
import com.backend.institutovetta.domain.leads.lead.dto.LeadNovoDTO;
import com.backend.institutovetta.domain.leads.lead.dto.LeadNovoResponse;
import lombok.AllArgsConstructor;
import com.backend.institutovetta.mapper.LeadMapper;
import org.springframework.stereotype.Service;
import com.backend.institutovetta.repository.LeadRepository;

import java.util.List;
import java.util.Locale;

@Service
@AllArgsConstructor
public class LeadService {

    private LeadRepository leadRepository;

    private LeadMapper leadMapper;


    public LeadNovoResponse novoLead(LeadNovoDTO leadNovoDTO){

        Lead leadEntidade = leadMapper.toEntity(leadNovoDTO);

        leadEntidade.setEmail(leadEntidade.getEmail().toLowerCase(Locale.ROOT));

        Lead leadSalvo = leadRepository.save(leadEntidade);

        return leadMapper.toLeadResponse(leadSalvo);
    }

    public List<LeadNovoResponse> listarLead(){

        List<Lead> leads = leadRepository.findAll();

    return leads.stream().map(lead -> leadMapper.toLeadResponse(lead)).toList();
    }
}
