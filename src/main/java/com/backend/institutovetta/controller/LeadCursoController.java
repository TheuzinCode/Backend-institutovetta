package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.leads.leadCursoEspecifico.dto.LeadCursoDTO;
import com.backend.institutovetta.domain.leads.leadCursoEspecifico.dto.LeadCursoResponseDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import com.backend.institutovetta.service.LeadCursoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping
@AllArgsConstructor
public class LeadCursoController {


    private LeadCursoService leadCursoService;

    @PostMapping("/curso/novoLead")
    public ResponseEntity<?> novoLeadCurso(@RequestBody @Valid LeadCursoDTO leadCursoDTO){
        try{

            LeadCursoResponseDTO leadCursoResponseDTO = leadCursoService.novoLeadCurso(leadCursoDTO);

            if (leadCursoResponseDTO == null){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(new ErroResponse("Não foi possível criar o interesse."));
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(leadCursoResponseDTO);

        }catch (BusinessException e){
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }

    }
}
