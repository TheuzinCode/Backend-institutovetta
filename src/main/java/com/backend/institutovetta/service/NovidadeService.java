package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.novidade.Novidade;
import com.backend.institutovetta.domain.novidade.dto.NovidadeRequestDTO;
import com.backend.institutovetta.domain.novidade.dto.NovidadeResponseDTO;
import com.backend.institutovetta.mapper.NovidadeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.backend.institutovetta.repository.NovidadeRepository;

import java.util.Locale;

@Service
@AllArgsConstructor
public class NovidadeService {

    private NovidadeRepository novidadeRepository;

    private NovidadeMapper novidadeMapper;

    //SALVAR EMAIL PARA RECEBER AS NOVIDADES
    public NovidadeResponseDTO SalvarEmailNovidade(NovidadeRequestDTO dto){

        Novidade novidadeEntity = novidadeMapper.toEntity(dto);

        novidadeEntity.setEmail(novidadeEntity.getEmail().toLowerCase(Locale.ROOT));

        Novidade novidadeSalva = novidadeRepository.save(novidadeEntity);

        return novidadeMapper.toDTO(novidadeSalva);
    }
}
