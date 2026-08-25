package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.leads.contato.Contato;
import com.backend.institutovetta.domain.leads.contato.dto.ContatoDTO;
import com.backend.institutovetta.domain.leads.contato.dto.ContatoResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContatoMapper {

    Contato toEntity(ContatoDTO contatoDTO);

     ContatoResponseDTO toDTO (Contato contato);

}
