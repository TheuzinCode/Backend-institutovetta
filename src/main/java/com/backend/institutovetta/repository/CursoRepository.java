package com.backend.institutovetta.repository;

import com.backend.institutovetta.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("""
        SELECT c FROM Curso c
        WHERE (:nome IS NULL OR LOWER(c.nome) LIKE LOWER(CONCAT('%', :nome, '%')))
          AND (:categoria IS NULL OR c.categoria = :categoria)
        """)
    List<Curso> buscarComFiltros(
            @Param("nome") String nome,
            @Param("categoria") String categoria);
}
