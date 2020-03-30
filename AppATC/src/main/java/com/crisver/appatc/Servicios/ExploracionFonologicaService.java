package com.crisver.appatc.Servicios;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.ExploracionFonologica;
import com.crisver.appatc.Entidades.UsuarioAppMovil;
import com.crisver.appatc.Repositorios.ExploracionFonologicaRepositorio;

public interface ExploracionFonologicaService {
	
public List <ExploracionFonologica> getExploracionFonologicaPorIdPaciente(Integer idPaciente);
}