
package com.example.fullcrud.repository;

import com.example.fullcrud.entity.Ciudad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends CrudRepository<Ciudad, Integer> {
}

