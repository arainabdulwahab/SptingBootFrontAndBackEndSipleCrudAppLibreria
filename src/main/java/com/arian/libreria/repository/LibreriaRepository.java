package com.arian.libreria.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arian.libreria.model.Libreria;

@Repository
public interface LibreriaRepository extends CrudRepository<Libreria, Integer>{

}
