package com.crisver.appatc.Servicios;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crisver.appatc.Entidades.UsuarioAppMovil;
import com.crisver.appatc.Repositorios.UsuarioAppMovilRepositorio;

@Service
public class UsuarioAppMovilServiceIm implements IUsuarioAppMovilService, UserDetailsService{
	
	@Autowired
	private UsuarioAppMovilRepositorio usuarioAppMovilRepositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioAppMovil usuarioAppMovil  = usuarioAppMovilRepositorio.findByUsername(username);
		if (usuarioAppMovil == null) {
			throw new UsernameNotFoundException("Usuario no valido");
		}
		return new org.springframework.security.core.userdetails.User(usuarioAppMovil.getNumeroExpediente(), usuarioAppMovil.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE ADMIN")));
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
