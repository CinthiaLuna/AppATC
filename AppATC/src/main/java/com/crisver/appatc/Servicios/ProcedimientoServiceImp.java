package com.crisver.appatc.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crisver.appatc.Entidades.Procedimiento;
import com.crisver.appatc.Repositorios.ProcedimientoRepositorio;


@Service
public class ProcedimientoServiceImp implements ProcedimientoService{
	@Autowired
	private ProcedimientoRepositorio procedimientoRepo;

	@Override
	public List<Procedimiento> getListaProcedimiento() {
		List<Procedimiento> listaProcedimientos = this.procedimientoRepo.findAll();
		return listaProcedimientos;
	}
	
	

}
