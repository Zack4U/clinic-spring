package com.clinica.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinica.demo.model.TipoTratamiento;

@Repository
public interface TipoTratamientoRepository extends CrudRepository<TipoTratamiento, Integer> {

}