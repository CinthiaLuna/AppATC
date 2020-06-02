package com.crisver.appatc.Servicios;

import java.util.List;

import com.crisver.appatc.Entidades.Terapia;

public interface TerapiaService {
	
	public List<Terapia> getListaTerapia(Integer idProcedimiento);

}
