package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.modulo.Modulo;
import com.backend.institutovetta.domain.modulo.dto.ModuloCriarDTO;
import com.backend.institutovetta.domain.modulo.dto.ModuloListarDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ModuloMapper {

    Modulo toEntity(ModuloCriarDTO modulo);

    ModuloListarDTO toDTO(Modulo modulo);
}
