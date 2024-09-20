package com.scv.repository;

import com.scv.model.TestVocacional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestVocacionalRepository extends JpaRepository<TestVocacional, Long> {
    List<TestVocacional> findByEstudianteIdOrderByCreatedAtDesc(Long estudianteId);
}