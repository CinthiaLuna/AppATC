package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.Cita;
import com.crisver.appatc.Entidades.ProgresoCitas;
import com.crisver.appatc.Servicios.CitaService;


@RestController
@RequestMapping(path="/api/oauth2/cita")
public class CitaControlador {
	
	@Autowired
	private CitaService citaServicio;
	
	@GetMapping()
	public ResponseEntity<?> getCitasPorUserName() {
		List<Cita> citasPorUserName = citaServicio.getCitaPorPaciente();
		if(citasPorUserName != null){
			return new ResponseEntity<>(citasPorUserName,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/progreso_cita")
	public ResponseEntity<?> getProgresoCitas() {
		List<Cita> citasPorUserName = citaServicio.getCitaPorPaciente();
		ProgresoCitas progresoCita = new ProgresoCitas();
		for(Cita cita: citasPorUserName) {
			if(cita.getBloque() >= progresoCita.getMayor()) {
				progresoCita.setMayor(cita.getBloque());
			}
		};
		for(Cita cita: citasPorUserName) {
			if(cita.getBloque() == progresoCita.getMayor()) {
				if(cita.getAsistenciaCita().equals(true)) {progresoCita.setAsistencias(1);}
				else if(cita.getAsistenciaCita().equals(false)) {progresoCita.setFaltas(1);}
				
				if(cita.getAsistenciaCita().equals(null)) {
					progresoCita.setSesionEvaluada(cita.getNumeroSesion()-1);
				}
				if(cita.getNumeroSesion() >= progresoCita.getSesionEvaluada()) {
					progresoCita.setSesionEvaluada(cita.getNumeroSesion());
				}
			}
		}; 
		return new ResponseEntity<>(progresoCita,HttpStatus.OK);
	}
}
