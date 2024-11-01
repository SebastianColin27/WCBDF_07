package com.upiiz.relaciones.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;

    //un curso tiene muchos estudiantes
    @ManyToMany(targetEntity = Estudiante.class, fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;

    //un curso tiene muchas lecciones
    //@OneToMany(targetEntity = Leccion.class, fetch = FetchType.LAZY)
    //private List<Leccion> lecciones;
}

