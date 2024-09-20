package com.scv.Controller;

import com.scv.model.TestVocacional;
import com.scv.service.TestVocacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestVocacionalController {
    @Autowired
    private TestVocacionalService testVocacionalService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<TestVocacional>> getTestHistory(@PathVariable Long userId) {
        return ResponseEntity.ok(testVocacionalService.getTestHistoryByUser(userId));
    }

    @GetMapping("/{testId}")
    public ResponseEntity<TestVocacional> getTestDetails(@PathVariable Long testId) {
        return ResponseEntity.ok(testVocacionalService.getTestById(testId));
    }
}