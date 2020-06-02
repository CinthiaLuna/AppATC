package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.Procedimiento;
import com.crisver.appatc.Servicios.ProcedimientoService;

@RestController
@RequestMapping(path="api/oauth2/procedimiento")
public class ProcedimientoControlador {
	@Autowired
	private ProcedimientoService procedimientoServicio;
	
	@GetMapping()
	public ResponseEntity<?> getCitasPorUserName() {
		List<Procedimiento> listaProcedimiento = procedimientoServicio.getListaProcedimiento();
		if(listaProcedimiento != null){
			return new ResponseEntity<>(listaProcedimiento,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
