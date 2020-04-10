package com.crisver.appatc.Servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.Paciente;
import com.crisver.appatc.Repositorios.PacienteRepositorio;

@Service
public class PacienteServicio {
	
	@Autowired
	private PacienteRepositorio pacienteRepo;
	
	public Paciente getPacientePorUsername() {
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		Optional<Paciente> optional = this.pacienteRepo.findByUsuarioAppMovilUsername(username);
		return optional.get();
	}

	
	
}
