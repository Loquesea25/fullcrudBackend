
package com.example.fullcrud.service;

import com.example.fullcrud.entity.Pais;

import java.util.List;

public interface IPaisService {
    public List<Pais> mostrarPaises();
    public Pais crearPais(Pais pais);
    public Pais modificarPais(Pais pais);
    public Pais buscarPaisPorId(int id);
    public void eliminarPaisPorId(int id);
}

