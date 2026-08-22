package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.leads.contato.Interesse;
import com.backend.institutovetta.domain.leads.contato.dto.InteresseDTO;
import com.backend.institutovetta.domain.leads.contato.dto.InteresseResponseDTO;
import com.backend.institutovetta.mapper.InteressesMapper;
import com.backend.institutovetta.repository.InteresseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InteresseService {


    private InteressesMapper mapper;
    private InteresseRepository interesseRepository;



    public InteresseResponseDTO criarLeadinteresse (InteresseDTO interesseDTO){

        Interesse entity = mapper.toEntity(interesseDTO);

        Interesse entitySave = interesseRepository.save(entity);

        return mapper.toDTO(entitySave);


    }

}
