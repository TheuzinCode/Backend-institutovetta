package com.backend.institutovetta.service;

import com.backend.institutovetta.domain.curso.Curso;
import com.backend.institutovetta.domain.curso.dto.CursoCriarDTO;
import com.backend.institutovetta.domain.curso.dto.CursoListarDTO;
import com.backend.institutovetta.domain.curso.dto.CursosDetalhesDTO;
import com.backend.institutovetta.domain.modulo.Modulo;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.repository.ModuloRepository;
import lombok.AllArgsConstructor;
import com.backend.institutovetta.mapper.CursoMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.backend.institutovetta.repository.CursoRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CursoService {


    private CursoRepository cursoRepository;

    private ModuloRepository moduloRepository;

    private CursoMapper cursoMapper;

    //FUNÇÃO: LISTAR TODOS OS CURSOS
    public List<CursoListarDTO> listarCursos(){
        List<Curso> cursos = cursoRepository.findAll();

        return cursos.stream().map( curso -> new CursoListarDTO(
                curso.getId(),
                curso.getNome(),
                curso.getDescricao(),
                curso.getCategoria(),
                curso.getDuracao(),
                curso.getAvaliacao(),
                curso.getImagemCapaCurso()
        )).toList();
    }

    //FUNÇÃO: BUSCAR CURSOS PELO ID
    public CursosDetalhesDTO buscarCursoById(Long id){
        Curso cursosDTO = cursoRepository.findById(id)
                .orElseThrow(() ->  new BusinessException("Erro ao encontrar o curso"));

        return cursoMapper.toCursoDetalheDTO(cursosDTO);
    }

    //FUNÇAO: PARA CRIAR CURSOS
    public CursoListarDTO criarCurso(CursoCriarDTO cursoCriarDTO, MultipartFile imagem) throws IOException {

        Curso curso = new Curso();

        curso.setNome(cursoCriarDTO.nome());
        curso.setDescricao(cursoCriarDTO.descricao());
        curso.setDuracao(cursoCriarDTO.duracao());
        curso.setCategoria(cursoCriarDTO.categoria());
        curso.setAvaliacao(cursoCriarDTO.avaliacao());

        curso.setImagemCapaCurso(imagem.getBytes());



        List<Modulo> modulosGerenciados = new ArrayList<>();

        if (cursoCriarDTO.modulos() != null) {
            for (Modulo moduloDoDto : cursoCriarDTO.modulos()) {
                // Busca o módulo real no banco de dados pelo ID
                Modulo moduloBanco = moduloRepository.findById(moduloDoDto.getId())
                        .orElseThrow(() -> new RuntimeException("Módulo não encontrado com o ID: " + moduloDoDto.getId()));

                modulosGerenciados.add(moduloBanco);
            }
        }

        curso.setModulos(modulosGerenciados);

        Curso cursoSalvo = cursoRepository.save(curso);

       return cursoMapper.toListarDTO(cursoSalvo);

    }





}
