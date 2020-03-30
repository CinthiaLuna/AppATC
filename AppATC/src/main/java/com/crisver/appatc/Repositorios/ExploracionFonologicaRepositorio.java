package com.crisver.appatc.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.crisver.appatc.Entidades.ExploracionFonologica;


public interface ExploracionFonologicaRepositorio extends JpaRepository <ExploracionFonologica, Integer> {
    public List<ExploracionFonologica> findByPacienteIdPaciente(Integer idPaciente);
}