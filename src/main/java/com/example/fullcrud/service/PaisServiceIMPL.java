
package com.example.fullcrud.service;

import com.example.fullcrud.entity.Pais;
import com.example.fullcrud.repository.IPaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaisServiceIMPL implements IPaisService{
    @Autowired
    private IPaisRepository iPaisRepository;
    @Override
    public List<Pais> mostrarPaises() {
        return (List<Pais>) this.iPaisRepository.findAll();
    }

    @Override
    public Pais crearPais(Pais pais) {
        pais.setNamePais(pais.getNamePais());
        return this.iPaisRepository.save(pais);
    }

    @Override
    public Pais modificarPais(Pais pais) {
        return this.iPaisRepository.save(pais);
    }

    @Override
    public Pais buscarPaisPorId(int id) {
        return this.iPaisRepository.findById(id).get();
    }

    @Override
    public void eliminarPaisPorId(int id) {
        this.iPaisRepository.deleteById(id);
    }
}

