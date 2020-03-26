package com.crisver.appatc.Servicios;

import java.util.List;

import com.crisver.appatc.Entidades.UsuarioAppMovil;

public interface IUsuarioAppMovilService {
	
	public List <UsuarioAppMovil> findAll();
	
	public UsuarioAppMovil crearUsuarioAppMovil(UsuarioAppMovil usuarioAppMovil);
	
	public UsuarioAppMovil findById(Long id);
	

}
