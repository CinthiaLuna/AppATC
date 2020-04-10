package com.crisver.appatc.Servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.PlanTrabajoProcedimiento;
import com.crisver.appatc.Repositorios.PlanTrabajoProcedimientoRepositorio;

@Service
public class PlanTrabajoProcedimientoServiceImp implements PlanTrabajoProcedimientoService {
	@Autowired
	private PlanTrabajoProcedimientoRepositorio planTrabajoProcedimientoRepo;

	@Override
	public List<PlanTrabajoProcedimiento> getPlanTrabajoProcedimientoPorIdPlanTrabajo(Integer idPlanTrabajo) {
		List<PlanTrabajoProcedimiento> procedimientosPlanTrabajo = this.planTrabajoProcedimientoRepo.findByPlanTrabajoIdPlanTrabajo(idPlanTrabajo);
		return procedimientosPlanTrabajo;
	}

	@Override
	public List<PlanTrabajoProcedimiento> getPlanTrabajoProcedimientoPorIdPaciente(Integer idPaciente) {
		List<PlanTrabajoProcedimiento> procedimientosPorIdPaciente = this.planTrabajoProcedimientoRepo.findByPacienteIdPaciente(idPaciente);
		return procedimientosPorIdPaciente;
	}
	

}
