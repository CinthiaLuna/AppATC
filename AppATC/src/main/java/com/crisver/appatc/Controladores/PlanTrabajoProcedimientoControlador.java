package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.PlanTrabajoProcedimiento;
import com.crisver.appatc.Servicios.PlanTrabajoProcedimientoService;

@RestController
@RequestMapping(path="/api/plantrabajo_procedimiento")
public class PlanTrabajoProcedimientoControlador {
	@Autowired
	private PlanTrabajoProcedimientoService planTrabajoProcedimientoServicio;
	
	
	@GetMapping("plan_trabajo/{id_plan_trabajo}")
	public ResponseEntity<?> getPlanTrabajo(@PathVariable("id_plan_trabajo") Integer idPlanTrabajo) {
		List <PlanTrabajoProcedimiento> procedimientosPlanes= planTrabajoProcedimientoServicio.getPlanTrabajoProcedimientoPorIdPlanTrabajo(idPlanTrabajo);
		if(procedimientosPlanes != null){
			return new ResponseEntity<>(procedimientosPlanes,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping ("/{id_paciente}")
	public ResponseEntity<?> getPlanTrabajoProcedimientoPorIdPaciente(@PathVariable("id_paciente") Integer idPaciente) {
		List <PlanTrabajoProcedimiento> procedimientosPorIdPaciente= planTrabajoProcedimientoServicio.getPlanTrabajoProcedimientoPorIdPaciente(idPaciente);
		if(procedimientosPorIdPaciente != null){
			return new ResponseEntity<>(procedimientosPorIdPaciente,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
