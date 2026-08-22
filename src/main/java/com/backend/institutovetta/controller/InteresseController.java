package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.leads.contato.dto.InteresseDTO;
import com.backend.institutovetta.domain.leads.contato.dto.InteresseResponseDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import com.backend.institutovetta.service.InteresseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping()
@RestController
@AllArgsConstructor
public class InteresseController {

    private InteresseService interesseService;


    @PostMapping("/novo/LeadInteresse")
    public ResponseEntity<?> novoInteresse(@RequestBody @Valid InteresseDTO  interesseDTO){
        System.out.println(interesseDTO);
        try {

            InteresseResponseDTO  interesseResponseDTO = interesseService.criarLeadinteresse(interesseDTO);

            if (interesseResponseDTO == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(new ErroResponse("Não foi possível criar o interesse."));
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(interesseResponseDTO);

        } catch (BusinessException e) {
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }


    }
}
