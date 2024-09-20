package com.scv.service;

import com.scv.model.Experto;
import com.scv.repository.ExpertoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Exper
    @Autowired
    private ExpertoRepository expertoRepository;

    public List<Experto> searchExpertos(String searchTerm) {
        if (searchTerm == null || searchTerm.trim().isEmpty()) {
            return expertoRepository.findAll();
        }
        return expertoRepository.searchExpertos(searchTerm);
    }

    public Experto getExpertoById(Long id) {
        return expertoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Experto not found with id: " + id));
    }
}