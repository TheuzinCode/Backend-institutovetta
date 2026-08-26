package com.backend.institutovetta.domain.leads.LeadCursoEspecifico;

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
@Table(name = "leads_curso_especifico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeadCurso {

    // LEAD DA PAGINA DE CURSOS QUE ELE ESCOLHEU ESPECIFICO

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "campo nome obrigatorio")
    private String nome;

    @NotBlank(message = "campo email obrigatorio")
    private String email;

    @NotBlank(message = "campo telefone obrigatorio")
    private String telefone;

    private String cursoEscolhido;

    @CreationTimestamp
    private Instant creationTimestamp;

}
