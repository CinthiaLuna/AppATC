package com.crisver.appatc.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.Cita;
import com.crisver.appatc.Repositorios.CitaRepositorio;

@Service
public class CitaServiceImp implements CitaService{
	@Autowired
	private CitaRepositorio CitaRepo;

	@Override
	public List<Cita> getCitaPorPaciente() {
			String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			List<Cita> citasPaciente = this.CitaRepo.findBySeguimientoPacienteUsuarioAppMovilUsernameOrderByBloque(username);
			return citasPaciente;
	}



}
