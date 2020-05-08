package com.crisver.appatc.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crisver.appatc.Entidades.ExploracionFonologica;
import com.crisver.appatc.Repositorios.ExploracionFonologicaRepositorio;

@Service
public class ExploracionFonologicaServicioImp implements ExploracionFonologicaService {

	@Autowired
	private ExploracionFonologicaRepositorio exploracionFonRepo;

	@Override
	@Transactional(readOnly = true)
	public List<ExploracionFonologica> getExploracionFonologicaPorIdPaciente(Integer idPaciente) {
		List<ExploracionFonologica> exploracion = this.exploracionFonRepo.findByPacienteIdPaciente(idPaciente);
		return exploracion;
	}

	@Override
	public ExploracionFonologica getExploracionFonologica(Integer idExploracionFonologica) {
		Optional<ExploracionFonologica> optional = this.exploracionFonRepo.findById(idExploracionFonologica);
		return optional.get();
	}

	@Override
	public List<ExploracionFonologica> getExploracionFonologicaPorUsername() {
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		List<ExploracionFonologica> exploracionUsername = this.exploracionFonRepo
				.findByPacienteUsuarioAppMovilUsernameOrderByFechaExploracionFonlogicaDesc(username);
		return exploracionUsername;
	}

}
