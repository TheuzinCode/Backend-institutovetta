package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.leads.contato.Contato;
import com.backend.institutovetta.domain.leads.contato.dto.ContatoDTO;
import com.backend.institutovetta.domain.leads.contato.dto.ContatoResponseDTO;
import com.backend.institutovetta.mapper.ContatoMapper;
import com.backend.institutovetta.repository.contatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContatoService {


    private ContatoMapper mapper;
    private contatoRepository contatoRepository;



    public ContatoResponseDTO criarLeadinteresse (ContatoDTO contatoDTO){

        Contato entity = mapper.toEntity(contatoDTO);

        Contato entitySave = contatoRepository.save(entity);

        return mapper.toDTO(entitySave);


    }

}
