package com.scv.service;

import com.scv.model.TestVocacional;
import com.scv.repository.TestVocacionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestVocacionalService {
    @Autowired
    private TestVocacionalRepository testVocacionalRepository;

    public List<TestVocacional> getTestHistoryByUser(Long userId) {
        return testVocacionalRepository.findByEstudianteIdOrderByCreatedAtDesc(userId);
    }

    public TestVocacional getTestById(Long testId) {
        return testVocacionalRepository.findById(testId)
                .orElseThrow(() -> new RuntimeException("Test not found with id: " + testId));
    }

    public TestVocacional saveTest(TestVocacional test) {
        return testVocacionalRepository.save(test);
    }
}