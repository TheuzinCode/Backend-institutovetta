package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.modulo.dto.ModuloCriarDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.institutovetta.service.ModuloService;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/modulos")
public class ModuloController {

    private ModuloService moduloService;

    @PostMapping("/cadastrar/novomodulo")
    public ResponseEntity<?> salvarModulo(@RequestBody @Valid ModuloCriarDTO dto){
        try {
            return ResponseEntity.ok().body(moduloService.salvarModulo(dto));
        }catch (BusinessException e){
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }

    @GetMapping
    public ResponseEntity<?> listarModulos(){
        try{
            return ResponseEntity.ok().body(moduloService.listarModulos());
        }catch (BusinessException e){
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }
}
