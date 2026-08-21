package com.backend.institutovetta.domain.novidade;

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
@Table(name = "novidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Novidade {

    // EMAIL AONDE A PESSOA VAI QUERER RECEBER AS NOVIDADES DA VETTA

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "O email é obrigatorio para receber as novidades")
    private String email;

    @CreationTimestamp
    private Instant creationTimestamp;

}
