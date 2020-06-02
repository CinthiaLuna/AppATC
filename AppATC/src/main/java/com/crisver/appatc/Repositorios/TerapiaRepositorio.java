package com.crisver.appatc.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisver.appatc.Entidades.Terapia;

public interface TerapiaRepositorio extends JpaRepository<Terapia, Integer>{
	
	List<Terapia> findByProcedimientoIdProcedimiento(Integer idProcedimiento);
	

	
}
