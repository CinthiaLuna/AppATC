package com.crisver.appatc.Servicios;

import java.util.List;


import com.crisver.appatc.Entidades.PlanTrabajoProcedimiento;

public interface PlanTrabajoProcedimientoService {
	public List <PlanTrabajoProcedimiento> getPlanTrabajoProcedimientoPorIdPlanTrabajo(Integer idPlanTrabajo);
	
	public List <PlanTrabajoProcedimiento> getPlanTrabajoProcedimientoPorIdPaciente(Integer idPaciente);
	

}
