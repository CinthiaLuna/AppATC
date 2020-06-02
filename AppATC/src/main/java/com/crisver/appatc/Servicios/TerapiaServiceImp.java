package com.crisver.appatc.Servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.Terapia;
import com.crisver.appatc.Repositorios.TerapiaRepositorio;


@Service
public class TerapiaServiceImp implements TerapiaService{
	
	@Autowired
	private TerapiaRepositorio terapiaRepo;

	@Override
	public List<Terapia> getListaTerapia(Integer idProcedimiento) {
		List<Terapia> terapias = this.terapiaRepo.findByProcedimientoIdProcedimiento(idProcedimiento);
		return terapias;
	}
	

}
