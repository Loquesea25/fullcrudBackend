
package com.example.fullcrud.service;

import com.example.fullcrud.entity.Ciudad;
import com.example.fullcrud.repository.ICiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadServiceIMPL implements ICiudadService{
    @Autowired
    private ICiudadRepository iCiudadRepository;
    @Override
    public List<Ciudad> mostrarCiudades() {
        return (List<Ciudad>) this.iCiudadRepository.findAll();
    }

    @Override
    public List<Ciudad> mostrarCiudadPorId(int id){
        List<Ciudad> ciudadRespuesta = new ArrayList<>();
        List<Ciudad> ciudad = (List<Ciudad>) this.iCiudadRepository.findAll();
        for (int i = 0; i < ciudad.size(); i ++ ){
            if (ciudad.get(i).getPais().getIdPais()== id){
                ciudadRespuesta.add(ciudad.get(i));
            }
        }
        return ciudadRespuesta;
    }

    @Override
    public Ciudad crearCiudad(Ciudad ciudad) {
        ciudad.setNameCiudad(ciudad.getNameCiudad());
        return this.iCiudadRepository.save(ciudad);
    }

    @Override
    public Ciudad modificarCiudad(Ciudad ciudad) {
        return this.iCiudadRepository.save(ciudad);
    }

    @Override
    public Ciudad buscarCiudadPorId(int id) {
        return this.iCiudadRepository.findById(id).get();
    }

    @Override
    public void eliminarCiudadPorId(int id) {
        this.iCiudadRepository.deleteById(id);
    }
}

