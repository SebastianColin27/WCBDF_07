package com.upiiz.relaciones.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Leccion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String contenido;

    //muchas lecciones van a un curso
    @ManyToOne(targetEntity = Curso.class, fetch = FetchType.LAZY)
    private Curso cursos;
}
