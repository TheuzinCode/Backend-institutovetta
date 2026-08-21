package com.backend.institutovetta.mapper;

import com.backend.institutovetta.domain.curso.Curso;
import com.backend.institutovetta.domain.curso.dto.CursoCriarDTO;
import com.backend.institutovetta.domain.curso.dto.CursoListarDTO;
import com.backend.institutovetta.domain.curso.dto.CursosDetalhesDTO;
import org.mapstruct.Mapper;
import org.springframework.web.multipart.MultipartFile;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    Curso toEntity(CursoCriarDTO curso, MultipartFile imagem);

    CursoListarDTO toListarDTO(Curso Curso);

    CursosDetalhesDTO toCursoDetalheDTO(Curso curso);
}
