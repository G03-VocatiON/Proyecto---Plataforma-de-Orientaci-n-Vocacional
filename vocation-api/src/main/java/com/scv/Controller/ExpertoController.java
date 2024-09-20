package com.scv.Controller;

import com.scv.model.Experto;
import com.scv.service.ExpertoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expertos")
public class ExpertoController {
    @Autowired
    private ExpertoService expertoService;

    @GetMapping("/search")
    public ResponseEntity<List<Experto>> searchExpertos(@RequestParam String term) {
        return ResponseEntity.ok(expertoService.searchExpertos(term));
    }
}