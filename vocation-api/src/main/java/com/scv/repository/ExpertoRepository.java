package com.scv.repository;

import com.scv.model.Experto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpertoRepository extends JpaRepository<Experto, Long> {
    @Query("SELECT e FROM Experto e WHERE LOWER(e.especializacion) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR LOWER(e.bio) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Experto> searchExpertos(@Param("searchTerm") String searchTerm);
}