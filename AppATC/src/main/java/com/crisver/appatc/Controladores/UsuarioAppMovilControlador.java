package com.crisver.appatc.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crisver.appatc.Entidades.UsuarioAppMovil;
import com.crisver.appatc.Repositorios.UsuarioAppMovilRepositorio;
import com.crisver.appatc.Servicios.IUsuarioAppMovilService;



@RestController
@RequestMapping("/api")
public class UsuarioAppMovilControlador {
	@Autowired
	private UsuarioAppMovilRepositorio usuarioAppMovilRepo;
	
	@Autowired
	private IUsuarioAppMovilService usuarioAppMovilService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder; //Para guardar de manera segura las contraseñas
	
	
	@GetMapping("/usuariosAppMovil")
	public ResponseEntity<?> obtenerUsuariosAppMovil(){
		List<UsuarioAppMovil> usuariosAppMovil = usuarioAppMovilService.findAll();
		if(usuariosAppMovil != null) {
			return new ResponseEntity<>(usuariosAppMovil, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("usuariosAppMovil/{idUsuarioAppMovil}")
	public ResponseEntity<?> obtenerUsuarioPorId(@PathVariable("idUsuarioAppMovil") Long idUsuarioAppMovil){
		Optional<UsuarioAppMovil> usuarioAppMovilOp = usuarioAppMovilRepo.findById(idUsuarioAppMovil);
		if (usuarioAppMovilOp != null) {
			return new ResponseEntity<>(usuarioAppMovilOp, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
		
	@PostMapping("/crear_usuarioAppMovil")
	public ResponseEntity<?> create(@RequestBody UsuarioAppMovil usuarioAppMovil){
		usuarioAppMovil.setPassword(bCryptPasswordEncoder.encode(usuarioAppMovil.getPassword()));
		this.usuarioAppMovilService.crearUsuarioAppMovil(usuarioAppMovil);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
