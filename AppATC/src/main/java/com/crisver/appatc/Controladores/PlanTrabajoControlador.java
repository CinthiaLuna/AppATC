package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.PlanTrabajo;
import com.crisver.appatc.Servicios.PlanTrabajoService;

@RestController
@RequestMapping(path="api/oauth2/plan_trabajo/")
public class PlanTrabajoControlador {
	@Autowired
	private PlanTrabajoService planTrabajoServicio;
	
	@GetMapping("paciente/{id_paciente}")
	public ResponseEntity<?> getPlanTrabajoPorIdPaciente(@PathVariable("id_paciente") Integer idPaciente) {
		List<PlanTrabajo> planesTrabajo = planTrabajoServicio.getPlanTrabajoPorIdPaciente(idPaciente);
		if(planesTrabajo != null){
			return new ResponseEntity<>(planesTrabajo,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/{id_plan_trabajo}")
	public ResponseEntity<?> getPlanTrabajo(@PathVariable("id_plan_trabajo") Integer idPlanTrabajo) {
		PlanTrabajo planTrabajo = planTrabajoServicio.getPlanTrabajo(idPlanTrabajo);
		if(planTrabajo != null){
			return new ResponseEntity<>(planTrabajo,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("exploracion_fonologica/{id_exploracion_fonologica}")
	public ResponseEntity<?> getPlanTrabajoPorExploracionFonologica(@PathVariable("id_exploracion_fonologica") Integer idExploracionFonologica) {
		PlanTrabajo planTrabajo = planTrabajoServicio.getPlanTrabajoPorExploracionFonologica(idExploracionFonologica);
		if(planTrabajo != null){
			return new ResponseEntity<>(planTrabajo,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
