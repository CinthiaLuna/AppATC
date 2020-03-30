package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.ExploracionFonologica;
import com.crisver.appatc.Servicios.ExploracionFonologicaService;

@RestController
@RequestMapping(path="/api/exploracion_fonologica")
public class ExploracionFonologicaControlador {
	
	@Autowired
	private ExploracionFonologicaService exploracionFonologicaServicio;
	
	@GetMapping("/{id_paciente}")
	public ResponseEntity<?> getExploracionFonologicaPorIdPaciente(@PathVariable("id_paciente") Integer id_paciente) {
		List<ExploracionFonologica> exploracionFonologica = exploracionFonologicaServicio.getExploracionFonologicaPorIdPaciente(id_paciente);
		if(exploracionFonologica != null){
			return new ResponseEntity<>(exploracionFonologica,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
