package com.crisver.appatc.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.Paciente;
import com.crisver.appatc.Servicios.PacienteServicio;

@RestController
@RequestMapping(path="/api/oauth2/paciente")
public class PacienteControlador {
	
	@Autowired
	private PacienteServicio pacienteServicio;
	

	
	@GetMapping("/{id_paciente}")
	public ResponseEntity<?> getPacientePorId(@PathVariable("id_paciente") Integer id_paciente) {
		Paciente paciente = pacienteServicio.getPacientePorId(id_paciente);
		if(paciente != null){
			return new ResponseEntity<>(paciente,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
