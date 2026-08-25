package com.backend.institutovetta.controller;

import com.backend.institutovetta.domain.leads.contato.dto.ContatoDTO;
import com.backend.institutovetta.domain.leads.contato.dto.ContatoResponseDTO;
import com.backend.institutovetta.exception.BusinessException;
import com.backend.institutovetta.exception.ErroResponse;
import com.backend.institutovetta.service.ContatoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping("/contato")
@RestController
@AllArgsConstructor
public class ContatoController {

    private ContatoService contatoService;


    @PostMapping("/novo/leadcontato")
    public ResponseEntity<?> novoInteresse(@RequestBody @Valid ContatoDTO contatoDTO){

        try {

            ContatoResponseDTO contatoResponseDTO = contatoService.criarLeadinteresse(contatoDTO);

            if (contatoResponseDTO == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(new ErroResponse("Não foi possível criar o interesse."));
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(contatoResponseDTO);

        } catch (BusinessException e) {
            return ResponseEntity.badRequest().body(new ErroResponse(e.getMessage()));
        }


    }
}
