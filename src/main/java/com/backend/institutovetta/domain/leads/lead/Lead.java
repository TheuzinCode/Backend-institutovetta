package com.backend.institutovetta.domain.leads.lead;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "Leads")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Lead {

    // LEAD DA PAGINA LANDING PAGE FORM

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome e obrigatorio")
    private String nome;

    @Email
    @NotBlank(message = "O email é obrigatório.")
    private String email;

    @NotBlank(message = "O numero e obrigatorio")
    private String numero;

    private String cursoInteressado;

    private String mensagem;

    @CreationTimestamp
    private Instant creationTimestamp;



}
