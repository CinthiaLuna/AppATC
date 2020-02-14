package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.Paciente;
import com.crisver.appatc.Servicios.PacienteServicio;

@RestController
@RequestMapping(path = "/paciente")
public class PacienteControlador {
	@Autowired
	private PacienteServicio pacienteServicio;
	
	@GetMapping()
	public List <Paciente> getTodoPaciente(){
		return pacienteServicio.getTodoPaciente();
	}
	
}
