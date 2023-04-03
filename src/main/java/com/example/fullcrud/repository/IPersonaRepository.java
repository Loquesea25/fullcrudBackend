package com.example.fullcrud.repository;

import com.example.fullcrud.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona, Integer> {
}
