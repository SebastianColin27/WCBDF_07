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

public class Estudiante {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(50)")
    private String nombre;

    private String correo;
    private String matricula;

    //un estudiante tiene un perfi
    //Traer la llave foranea
    @OneToOne(targetEntity = Perfil.class)
    private Perfil perfil;

    //un estudiante tiene un tutor ->muchos estudiantes tienen un tutor
    @ManyToOne(targetEntity = Tutor.class)
    private Tutor tutor;

    //un estudiante tiene muchos cursos
    @ManyToMany(targetEntity = Curso.class, fetch = FetchType.LAZY)
    private List<Curso> cursos;

}
