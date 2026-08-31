package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.leads.queroDesconto.dto.LeadDescontoResponseDTO;
import com.backend.institutovetta.domain.leads.queroDesconto.dto.LeadDescontoNovoDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import com.backend.institutovetta.service.LeadDescontoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/quero-desconto")
@AllArgsConstructor
public class LeadDescontoController {

    private LeadDescontoService leadDescontoService;

    @PostMapping("/novo/lead-desconto")
    public ResponseEntity<?> salvarLead(@RequestBody @Valid LeadDescontoNovoDTO leadDescontoNovoDTO) {

        try{
            LeadDescontoResponseDTO leadDescontoResponseDTO = leadDescontoService.salvarLead(leadDescontoNovoDTO);

            if (leadDescontoResponseDTO == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(new ErroResponse("Não foi possível criar o interesse."));
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(leadDescontoResponseDTO);


        } catch (BusinessException e) {
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }

    }

}
