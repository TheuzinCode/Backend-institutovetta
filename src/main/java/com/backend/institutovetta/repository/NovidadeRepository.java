package com.backend.institutovetta.repository;

import com.backend.institutovetta.domain.novidade.Novidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NovidadeRepository extends JpaRepository<Novidade, UUID> {
}
