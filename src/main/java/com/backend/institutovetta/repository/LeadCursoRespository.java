package com.backend.institutovetta.repository;

import com.backend.institutovetta.domain.leads.leadCursoEspecifico.LeadCurso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeadCursoRespository extends JpaRepository<LeadCurso, UUID> {
}
