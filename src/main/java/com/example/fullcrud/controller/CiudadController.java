package com.example.fullcrud.controller;

import com.example.fullcrud.entity.Ciudad;
import com.example.fullcrud.service.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/ciudad")
public class CiudadController {
    @Autowired
    private ICiudadService iCiudadService;
    @GetMapping
    @RequestMapping(value = "mostrarCiudades", method = RequestMethod.GET)
    public ResponseEntity<?> mostrarCiudades(){
        List<Ciudad> listaCiudad = this.iCiudadService.mostrarCiudades();
        return ResponseEntity.ok(listaCiudad);
    }
    @GetMapping
    @RequestMapping(value = "mostrarCiudadPorId/{idPais}", method = RequestMethod.GET)
    public ResponseEntity<?> mostrarCiudadPorId(@PathVariable int idPais){
        Ciudad ciudad = this.iCiudadService.buscarCiudadPorId(idPais);
        return ResponseEntity.ok(ciudad);
    }

    @PostMapping
    @RequestMapping(value = "crearCiudad", method = RequestMethod.POST)
    public ResponseEntity<?> crearCiudad(@RequestBody Ciudad ciudad){
        Ciudad ciudadCreada = this.iCiudadService.crearCiudad(ciudad);
        return ResponseEntity.status(HttpStatus.CREATED).body(ciudadCreada);
    }
    @PutMapping
    @RequestMapping(value = "modificarCiudad", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarCiudad(@RequestBody Ciudad ciudad){
        Ciudad ciudadModificada = this.iCiudadService.modificarCiudad(ciudad);
        return ResponseEntity.status(HttpStatus.CREATED).body(ciudadModificada);
    }
    @GetMapping
    @RequestMapping(value = "buscarCiudadPorId", method = RequestMethod.GET)
    public ResponseEntity<?> buscarCiudadPorId(@PathVariable int id){
        Ciudad ciudad = this.iCiudadService.buscarCiudadPorId(id);
        return ResponseEntity.ok(ciudad);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarCiudadPorId", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarCiudadPorId(@PathVariable int id){
        this.iCiudadService.eliminarCiudadPorId(id);
        return ResponseEntity.ok().build();
    }
}
