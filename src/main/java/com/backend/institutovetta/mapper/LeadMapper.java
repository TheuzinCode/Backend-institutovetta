package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.lead.Lead;
import com.backend.institutovetta.domain.leads.lead.dto.LeadNovoDTO;
import com.backend.institutovetta.domain.leads.lead.dto.LeadNovoResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeadMapper {

    Lead toEntity(LeadNovoDTO dto);

    LeadNovoDTO  toDTO(Lead lead);

    LeadNovoResponse toLeadResponse(Lead lead);

}
