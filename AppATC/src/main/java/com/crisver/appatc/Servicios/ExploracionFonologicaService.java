package com.crisver.appatc.Servicios;
import java.util.List;
import com.crisver.appatc.Entidades.ExploracionFonologica;


public interface ExploracionFonologicaService {
	
public List <ExploracionFonologica> getExploracionFonologicaPorIdPaciente(Integer idPaciente);

public List <ExploracionFonologica> getExploracionFonologicaPorUsernameAsc();

public List <ExploracionFonologica> getExploracionFonologicaPorUsernameDesc();

public ExploracionFonologica getExploracionFonologica(Integer idExploracionFonologica);
}