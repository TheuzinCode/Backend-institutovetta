package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.modulo.Modulo;
import com.backend.institutovetta.domain.modulo.dto.ModuloCriarDTO;
import com.backend.institutovetta.domain.modulo.dto.ModuloListarDTO;
import lombok.AllArgsConstructor;
import com.backend.institutovetta.mapper.ModuloMapper;
import org.springframework.stereotype.Service;
import com.backend.institutovetta.repository.ModuloRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ModuloService {

    private ModuloRepository moduloRepository;

    private ModuloMapper moduloMapper;

    public List<ModuloListarDTO> listarModulos (){
        List<Modulo> modulos = moduloRepository.findAll();

        return modulos.stream().map( modulo -> new ModuloListarDTO(
                modulo.getId(),
                modulo.getNome(),
                modulo.getDescricao(),
                modulo.getDuracao(),
                modulo.getAvaliacao()
        )).toList();
    }

    public ModuloListarDTO salvarModulo(ModuloCriarDTO moduloCriarDTO){

        Modulo modulo = moduloMapper.toEntity(moduloCriarDTO);

        Modulo moduloSalvo = moduloRepository.save(modulo);

        return moduloMapper.toDTO(moduloSalvo);
    }

}
