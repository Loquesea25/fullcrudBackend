package com.example.fullcrud.service;

import com.example.fullcrud.entity.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> mostrarPersonas();
    public Persona crearPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public Persona buscarPersonaPorId(int id);
    public void eliminarPersonaPorId(int id);
}
