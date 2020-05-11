package com.crisver.appatc.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.ExploracionFonologica;
import com.crisver.appatc.Servicios.ExploracionFonologicaService;

@RestController
@RequestMapping(path="/api/oauth2/exploracion_fonologica")
public class ExploracionFonologicaControlador {
	
	@Autowired
	private ExploracionFonologicaService exploracionFonologicaServicio;
	
	@GetMapping("paciente/{id_paciente}")
	public ResponseEntity<?> getExploracionFonologicaPorIdPaciente(@PathVariable("id_paciente") Integer id_paciente) {
		List<ExploracionFonologica> exploracionesFonologica = exploracionFonologicaServicio.getExploracionFonologicaPorIdPaciente(id_paciente);
		if(exploracionesFonologica != null){
			return new ResponseEntity<>(exploracionesFonologica,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/{id_exploracion_fonologica}")
	public ResponseEntity<?> getExploracionFonologica(@PathVariable("id_exploracion_fonologica") Integer idExploracionFonologica) {
		ExploracionFonologica exploracionFonologica = exploracionFonologicaServicio.getExploracionFonologica(idExploracionFonologica);
		if(exploracionFonologica != null){
			return new ResponseEntity<>(exploracionFonologica,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/pacienteAsc")
	public ResponseEntity<?> getExploracionFonologicaPorUserNameAsc() {
		List<ExploracionFonologica> exploracionesFonologicaPorUsername = exploracionFonologicaServicio.getExploracionFonologicaPorUsernameAsc();
		for(ExploracionFonologica exploracionFonologica: exploracionesFonologicaPorUsername) {
			if(exploracionFonologica.getNivelLenguajeOraciones().equals(true)) {exploracionFonologica.setNivelNumero(7);}
			else if(exploracionFonologica.getNivelLenguajeFrases().equals(true)) { exploracionFonologica.setNivelNumero(6);}
			else if(exploracionFonologica.getNivelLenguajePalabrasYuxtapuestas().equals(true)) {exploracionFonologica.setNivelNumero(5);}
			else if(exploracionFonologica.getNivelLenguajePalabrasSueltas().equals(true)) {exploracionFonologica.setNivelNumero(4);}
			else if(exploracionFonologica.getNivelLenguajeBisilabos().equals(true)) {exploracionFonologica.setNivelNumero(3);}
			else if(exploracionFonologica.getNivelLenguajeMonosilabos().equals(true)) {exploracionFonologica.setNivelNumero(2);}
			else if(exploracionFonologica.getNivelLenguajeBalbuceo().equals(true)) {exploracionFonologica.setNivelNumero(1);}
			
			if(exploracionFonologica.getGradoTrastorno().equals("Severo")) {exploracionFonologica.setGradoNumero(1);}
			else if(exploracionFonologica.getGradoTrastorno().equals("Moderado")){exploracionFonologica.setGradoNumero(2);}
			else if(exploracionFonologica.getGradoTrastorno().equals("Leve")) {exploracionFonologica.setGradoNumero(3);}
		};
		if(exploracionesFonologicaPorUsername != null){
			return new ResponseEntity<>(exploracionesFonologicaPorUsername,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/pacienteDesc")
	public ResponseEntity<?> getExploracionFonologicaPorUserNameDesc() {
		List<ExploracionFonologica> exploracionesFonologicaPorUsername = exploracionFonologicaServicio.getExploracionFonologicaPorUsernameDesc();
		if(exploracionesFonologicaPorUsername != null){
			return new ResponseEntity<>(exploracionesFonologicaPorUsername,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
