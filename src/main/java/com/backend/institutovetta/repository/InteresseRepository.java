package com.backend.institutovetta.repository;

import com.backend.institutovetta.domain.leads.contato.Interesse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InteresseRepository extends JpaRepository<Interesse, UUID> {
}
