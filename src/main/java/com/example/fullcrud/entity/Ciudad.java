
package com.example.fullcrud.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "Ciudades")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_ciudad")
    private int idCiudad;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais Pais;

    @Column(name = "nombre_ciudad")
    private String nameCiudad;
}

