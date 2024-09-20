package com.scv.model;

import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "test_vocacional")
public class TestVocacional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;

    @Column(name = "estudiante_id")
    private Long estudianteId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}