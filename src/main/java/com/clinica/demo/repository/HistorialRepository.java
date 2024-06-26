package com.clinica.demo.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clinica.demo.model.Historial;
import com.clinica.demo.model.Paciente;

@Repository
public interface HistorialRepository extends CrudRepository<Historial, Integer> {

    ArrayList<Historial> findByPaciente(Paciente paciente);

}
