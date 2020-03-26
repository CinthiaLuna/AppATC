package com.crisver.appatc.Servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.Paciente;
import com.crisver.appatc.Repositorios.PacienteRepositorio;

@Service
public class PacienteServicio {
	
	@Autowired
	private PacienteRepositorio pacienteRepo;
	
	public Paciente getPacientePorId(Integer id_paciente) {
		Optional<Paciente> optional = this.pacienteRepo.findById(id_paciente);
		return optional.get();
	}
	
}
