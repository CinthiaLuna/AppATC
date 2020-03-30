package com.crisver.appatc.Repositorios;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crisver.appatc.Entidades.PlanTrabajoProcedimiento;

public interface PlanTrabajoProcedimientoRepositorio extends JpaRepository<PlanTrabajoProcedimiento, Integer>{
	public List<PlanTrabajoProcedimiento> findByPlanTrabajoIdPlanTrabajo(Integer idPlanTrabajo);
	
	public List<PlanTrabajoProcedimiento> findByPacienteIdPaciente(Integer idPaciente);
	}
