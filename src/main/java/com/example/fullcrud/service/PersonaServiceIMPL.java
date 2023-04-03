package com.example.fullcrud.service;

import com.example.fullcrud.entity.Persona;
import com.example.fullcrud.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceIMPL implements IPersonaService{
    @Autowired
    private IPersonaRepository iPersonaRepository;
    @Override
    public List<Persona> mostrarPersonas() {
        return (List<Persona>) this.iPersonaRepository.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        persona.setNamePersona(persona.getNamePersona());
        return this.iPersonaRepository.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.iPersonaRepository.save(persona);
    }

    @Override
    public Persona buscarPersonaPorId(int id) {
        return this.iPersonaRepository.findById(id).get();
    }

    @Override
    public void eliminarPersonaPorId(int id) {
        this.iPersonaRepository.deleteById(id);
    }
}
