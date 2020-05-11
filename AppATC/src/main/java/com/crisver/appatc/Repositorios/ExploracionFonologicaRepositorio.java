package com.crisver.appatc.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.crisver.appatc.Entidades.ExploracionFonologica;


public interface ExploracionFonologicaRepositorio extends JpaRepository <ExploracionFonologica, Integer> {
    public List<ExploracionFonologica> findByPacienteIdPaciente(Integer idPaciente);
    public List<ExploracionFonologica> findByPacienteUsuarioAppMovilUsernameOrderByFechaExploracionFonlogicaAsc(String username);
    public List<ExploracionFonologica> findByPacienteUsuarioAppMovilUsernameOrderByFechaExploracionFonlogicaDesc(String username);

}