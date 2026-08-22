package com.backend.institutovetta.domain.leads.contato;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "lead_interesses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Interesse {

    // LEAD DA PAGINA CONTATO

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "campo nome obrigatorio")
    private String nome;

    @NotBlank(message = "campo email obrigatorio")
    private String email;

    @NotBlank(message = "campo telefone obrigatorio")
    private String telefone;

    @NotBlank(message = "campo curso de interesse obrigatorio")
    private String cursoInteresse;

    @CreationTimestamp
    private Instant creationTimestamp;
}
