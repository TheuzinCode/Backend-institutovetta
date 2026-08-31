package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.queroDesconto.dto.LeadDescontoResponseDTO;
import com.backend.institutovetta.domain.leads.queroDesconto.LeadDesconto;
import com.backend.institutovetta.domain.leads.queroDesconto.dto.LeadDescontoNovoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LeadDescontoMapper {


    LeadDesconto toEntity(LeadDescontoNovoDTO lead);

    LeadDescontoResponseDTO toDTO(LeadDesconto leadDesconto);
}
