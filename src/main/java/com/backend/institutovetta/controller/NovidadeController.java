package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.novidade.dto.NovidadeRequestDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import com.backend.institutovetta.service.NovidadeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/novidade")
public class NovidadeController {

    private NovidadeService novidadeService;

    @PostMapping("/novo")
    public ResponseEntity<?> criarNovidadeEmail(@RequestBody NovidadeRequestDTO dto){
        System.out.println(dto);
        try{
            return ResponseEntity.ok().body(novidadeService.SalvarEmailNovidade(dto));
        }catch (BusinessException e){
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }
}
