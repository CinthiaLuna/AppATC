package com.crisver.appatc.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisver.appatc.Entidades.PlanTrabajo;

public interface PlanTrabajoRepositorio extends JpaRepository <PlanTrabajo, Integer>{
	
public List<PlanTrabajo> findByPacienteIdPaciente(Integer idPaciente);
public Optional <PlanTrabajo> findByExploracionFonologicaIdExploracionFonologica(Integer idExploracionFonologica);


}
