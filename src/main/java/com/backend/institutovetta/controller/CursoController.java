package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.curso.dto.CursoCriarDTO;
import com.backend.institutovetta.domain.curso.dto.CursosDetalhesDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.backend.institutovetta.service.CursoService;

import java.io.IOException;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/cursos")
public class CursoController {

    private CursoService cursoService;

    @PostMapping("/cadastrar/novocurso")
    public ResponseEntity<?> criarCurso(
            @RequestPart("curso") CursoCriarDTO cursoCriarDTO,
            @RequestPart(value = "imagem", required = false) MultipartFile imagem) {
        try {
            return ResponseEntity.ok().body(cursoService.criarCurso(cursoCriarDTO, imagem));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    public ResponseEntity<?> listarCursos () {
        try {
            return ResponseEntity.ok().body(cursoService.listarCursos());
        } catch (BusinessException e) {
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        try {
            CursosDetalhesDTO cursosDetalhesDTO = cursoService.buscarCursoById(id);

            return ResponseEntity.ok().body(cursosDetalhesDTO);
        } catch (BusinessException e) {
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }
}
