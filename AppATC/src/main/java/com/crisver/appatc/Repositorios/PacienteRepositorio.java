package com.crisver.appatc.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisver.appatc.Entidades.Paciente;

public interface PacienteRepositorio extends JpaRepository <Paciente, Integer>{
	List<Paciente> findByIdPaciente(Integer id_paciente);
	public Optional <Paciente> findByUsuarioAppMovilUsername(String username); 
}
