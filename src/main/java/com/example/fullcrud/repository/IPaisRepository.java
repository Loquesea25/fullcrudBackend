
package com.example.fullcrud.repository;

import com.example.fullcrud.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepository extends CrudRepository<Pais, Integer> {
}

