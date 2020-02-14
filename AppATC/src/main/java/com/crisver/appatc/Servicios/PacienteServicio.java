package com.crisver.appatc.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.Paciente;
import com.crisver.appatc.Repositorios.PacienteRepositorio;

@Service
public class PacienteServicio {

	@Autowired
	private PacienteRepositorio pacienteRepositorio;
	
	
	public List <Paciente> getTodoPaciente(){
		return this.pacienteRepositorio.findAll();
	}
}
