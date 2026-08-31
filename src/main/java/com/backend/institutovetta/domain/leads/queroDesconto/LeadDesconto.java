package com.backend.institutovetta.domain.leads.queroDesconto;


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
@Table(name = "LeadDesconto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeadDesconto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "campo nome é obrigatorio")
    private String nome;

    @NotBlank(message = "campo numero é obrigatorio")
    private String numero;

    @NotBlank(message = "campo email é obrigatorio")
    private String email;

    @NotBlank(message = "campo unidade é obrigatorio")
    private String unidade;

    @CreationTimestamp
    private Instant creationTimestamp;

}
