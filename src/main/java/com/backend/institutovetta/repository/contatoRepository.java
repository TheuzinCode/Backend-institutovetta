package com.backend.institutovetta.repository;

import com.backend.institutovetta.domain.leads.contato.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface contatoRepository extends JpaRepository<Contato, UUID> {
}
