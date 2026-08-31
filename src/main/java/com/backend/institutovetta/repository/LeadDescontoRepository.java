package com.backend.institutovetta.repository;

import com.backend.institutovetta.domain.leads.queroDesconto.LeadDesconto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeadDescontoRepository extends JpaRepository<LeadDesconto, UUID> {
}
