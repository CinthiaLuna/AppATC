package com.crisver.appatc.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crisver.appatc.Entidades.PlanTrabajo;
import com.crisver.appatc.Repositorios.PlanTrabajoRepositorio;

@Service
public class PlanTrabajoServiceImp implements PlanTrabajoService{
	@Autowired
	private PlanTrabajoRepositorio planTrabajoRepo;

	@Override
	@Transactional(readOnly = true)
	public List<PlanTrabajo> getPlanTrabajoPorIdPaciente(Integer idPaciente) {
		List<PlanTrabajo> planesTrabajo = this.planTrabajoRepo.findByPacienteIdPaciente(idPaciente);
		return planesTrabajo;
	}
	
	public PlanTrabajo getPlanTrabajo(Integer idPlanTrabajo) {
		Optional <PlanTrabajo> optional = this.planTrabajoRepo.findById(idPlanTrabajo);
		return optional.get();
	}

}
