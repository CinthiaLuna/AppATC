package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.Cita;
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
}
