package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.Terapia;
import com.crisver.appatc.Servicios.TerapiaService;

@RestController
@RequestMapping(path="/api/oauth2/terapia")
public class TerapiaControlador {
	
	@Autowired
	private TerapiaService terapiaServicio;
	
	@GetMapping("/{id_procedimiento}")
	public ResponseEntity<?> getListaTerapia(@PathVariable("id_procedimiento") Integer idProcedimiento) {
		List<Terapia> listaTerapias = this.terapiaServicio.getListaTerapia(idProcedimiento);
		if(listaTerapias != null){
			return new ResponseEntity<>(listaTerapias,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
