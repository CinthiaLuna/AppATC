package com.crisver.appatc.Servicios;

import java.util.List;

import com.crisver.appatc.Entidades.PlanTrabajo;

public interface PlanTrabajoService {
	public List<PlanTrabajo> getPlanTrabajoPorIdPaciente(Integer idPaciente);
	public PlanTrabajo getPlanTrabajo (Integer idPlanTrabajo);

}
