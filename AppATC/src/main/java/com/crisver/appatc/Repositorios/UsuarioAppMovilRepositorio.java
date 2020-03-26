package com.crisver.appatc.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisver.appatc.Entidades.UsuarioAppMovil;



public interface UsuarioAppMovilRepositorio extends JpaRepository<UsuarioAppMovil, Long>{
	
	public UsuarioAppMovil findByUsername(String username);
	

	
	
	

}
