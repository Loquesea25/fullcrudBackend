
package com.example.fullcrud.service;

import com.example.fullcrud.entity.Ciudad;

import java.util.List;

public interface ICiudadService {
    public List<Ciudad> mostrarCiudades();
    public List<Ciudad> mostrarCiudadPorId(int id);
    public Ciudad crearCiudad(Ciudad ciudad);
    public Ciudad modificarCiudad(Ciudad ciudad);
    public Ciudad buscarCiudadPorId(int id);
    public void eliminarCiudadPorId(int id);
}

