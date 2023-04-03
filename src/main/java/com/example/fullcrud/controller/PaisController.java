package com.example.fullcrud.controller;

import com.example.fullcrud.entity.Pais;
import com.example.fullcrud.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/pais")
public class PaisController {
    @Autowired
    private IPaisService iPaisService;
    @GetMapping
    @RequestMapping(value = "mostrarPaises", method = RequestMethod.GET)
    public ResponseEntity<?> mostrarPaises(){
        List<Pais> listaPaises = this.iPaisService.mostrarPaises();
        return ResponseEntity.ok(listaPaises);
    }
    @PostMapping
    @RequestMapping(name = "crearPais", method = RequestMethod.POST)
    public ResponseEntity<?> crearPais(@RequestBody Pais pais){
        Pais paisCreado = this.iPaisService.crearPais(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisCreado);
    }
    @PutMapping
    @RequestMapping(value = "modificarPais", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPais(@RequestBody Pais pais){
        Pais paisModificado = this.iPaisService.modificarPais(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisModificado);
    }
    @GetMapping
    @RequestMapping(value = "buscarPaisPorId", method = RequestMethod.GET)
    public ResponseEntity<?> buscarPaisPorId(@PathVariable int id){
        Pais pais = this.iPaisService.buscarPaisPorId(id);
        return ResponseEntity.ok(pais);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarPaisPorId", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarPaisPorId(@PathVariable int id){
        this.iPaisService.eliminarPaisPorId(id);
        return ResponseEntity.ok().build();
    }
}
