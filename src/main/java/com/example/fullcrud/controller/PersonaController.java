package com.example.fullcrud.controller;

import com.example.fullcrud.entity.Persona;
import com.example.fullcrud.service.PersonaServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/persona")
public class PersonaController {
    @Autowired
    private PersonaServiceIMPL personaServiceIMPL;
    @GetMapping
    @RequestMapping(value = "mostrarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> mostrarPersonas(){
        List<Persona> listaPersonas = this.personaServiceIMPL.mostrarPersonas();
        return ResponseEntity.ok(listaPersonas);
    }
    @PostMapping
    @RequestMapping(value = "crearPersona", method = RequestMethod.POST)
    public ResponseEntity<?> crearPersona(@RequestBody Persona persona){
        Persona personaCreada = this.personaServiceIMPL.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaCreada);
    }
    @PutMapping
    @RequestMapping(value = "modificarPersona", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPersona(@RequestBody Persona persona){
        Persona personaModificada = this.personaServiceIMPL.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaModificada);
    }
    @GetMapping
    @RequestMapping(value = "buscarPersonaPorId/{id}", method = RequestMethod.GET)
        public ResponseEntity<?> buscarPersonaPorId(@PathVariable int id){
        Persona persona = this.personaServiceIMPL.buscarPersonaPorId(id);
        return ResponseEntity.ok(persona);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarPersonaPorId/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarPersonaPorId(@PathVariable int id){
        this.personaServiceIMPL.eliminarPersonaPorId(id);
        return ResponseEntity.ok().build();
    }
}

