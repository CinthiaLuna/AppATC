package com.crisver.appatc.Repositorios;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisver.appatc.Entidades.Cita;

public interface CitaRepositorio extends JpaRepository<Cita, Integer>{
	
	public List<Cita> findBySeguimientoPacienteUsuarioAppMovilUsernameOrderByFechaCitaDesc(String username);

}
