package com.example.fullcrud.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_persona", nullable = false)
    private int idPersona;
    @Column(name = "nombre_persona", nullable = false)
    private String namePersona;
    @Column(name = "apellido_persona", nullable = false)
    private String lastNamePersona;
    @Column(name = "edad_persona", nullable = false)
    private int agePersona;
    @Column(name = "correo_persona", nullable = false, unique = true)
    private String emailPersona;

   /* @ManyToOne
    @JoinColumn(name = "nombre_pais")
    private Pais pais;
    @ManyToOne
    @JoinColumn(name = "nombre_ciudad")
    private Ciudad ciudad;*/

}
