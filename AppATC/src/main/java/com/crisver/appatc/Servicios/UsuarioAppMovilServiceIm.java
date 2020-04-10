package com.crisver.appatc.Servicios;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crisver.appatc.Entidades.UsuarioAppMovil;
import com.crisver.appatc.Repositorios.UsuarioAppMovilRepositorio;

@Service
public class UsuarioAppMovilServiceIm implements IUsuarioAppMovilService, UserDetailsService{
	
	private Logger logger = LoggerFactory.getLogger(UsuarioAppMovilServiceIm.class);
	
	@Autowired
	private UsuarioAppMovilRepositorio usuarioAppMovilRepositorio;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioAppMovil usuarioAppMovil  = usuarioAppMovilRepositorio.findByUsername(username);
		List<GrantedAuthority> authorities = new ArrayList<>();
		if (usuarioAppMovil == null) {
			logger.error("Usuario no valido: " + username);
			throw new UsernameNotFoundException("Usuario no valido: " + username);
		}
		return new User(usuarioAppMovil.getUsername(), usuarioAppMovil.getPassword(), true, true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UsuarioAppMovil> findAll() {
		return (List<UsuarioAppMovil>) usuarioAppMovilRepositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioAppMovil findById(Long id) {
		return usuarioAppMovilRepositorio.findById(id).orElse(null);
	}

	@Override
	public UsuarioAppMovil crearUsuarioAppMovil(UsuarioAppMovil usuarioAppMovil) {
		usuarioAppMovil = this.usuarioAppMovilRepositorio.saveAndFlush(usuarioAppMovil);
		return usuarioAppMovil;
	}

	
	



}
