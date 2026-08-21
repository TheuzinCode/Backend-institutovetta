package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.leads.lead.dto.LeadNovoDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.institutovetta.service.LeadService;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/leads")
public class LeadController {

    private LeadService leadService;

    @PostMapping("/novolead")
    public ResponseEntity<?> salvarLead(@RequestBody @Valid LeadNovoDTO dto){
        try{
            return ResponseEntity.ok().body(leadService.novoLead(dto));
        }catch (BusinessException e){
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarLead(){
        try{
           return ResponseEntity.ok().body(leadService.listarLead());
        }catch (BusinessException e){
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }
    }


}
