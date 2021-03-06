package com.crisver.appatc.Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "plan_trabajo")
public class PlanTrabajo implements Serializable{
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_plan_trabajo")
	private Integer idPlanTrabajo;
	
	@Column (name = "fecha_plan_trabajo")
	private LocalDateTime fechaPlanTrabajo;
	
	@Column (name = "estado_plan_trabajo")
	private char estadoPlanTrabajo;
	
	@Column (name = "indicaciones_procedimiento")
	private String indicacionesProcedimiento;
	
	@Column(name = "numero_sesiones")
	private Integer numeroSesiones;
	
	@Column(name = "numero_bloque")
	private Integer numeroBloque;
	
	@Column(name = "temporalidad")
	private String temporalidad;
	
	@ManyToOne
	@JoinColumn (name = "id_paciente", referencedColumnName = "id_paciente")
	private Paciente paciente;
	
	@OneToOne
	@JoinColumn (name = "id_exploracion_fonologica", referencedColumnName = "id_exploracion_fonologica")
	private ExploracionFonologica exploracionFonologica;

	public Integer getIdPlanTrabajo() {
		return idPlanTrabajo;
	}

	public void setIdPlanTrabajo(Integer idPlanTrabajo) {
		this.idPlanTrabajo = idPlanTrabajo;
	}

	public LocalDateTime getFechaPlanTrabajo() {
		return fechaPlanTrabajo;
	}

	public void setFechaPlanTrabajo(LocalDateTime fechaPlanTrabajo) {
		this.fechaPlanTrabajo = fechaPlanTrabajo;
	}

	public char getEstadoPlanTrabajo() {
		return estadoPlanTrabajo;
	}

	public void setEstadoPlanTrabajo(char estadoPlanTrabajo) {
		this.estadoPlanTrabajo = estadoPlanTrabajo;
	}

	public String getIndicacionesProcedimiento() {
		return indicacionesProcedimiento;
	}

	public void setIndicacionesProcedimiento(String indicacionesProcedimiento) {
		this.indicacionesProcedimiento = indicacionesProcedimiento;
	}

	public Integer getNumeroSesiones() {
		return numeroSesiones;
	}

	public void setNumeroSesiones(Integer numeroSesiones) {
		this.numeroSesiones = numeroSesiones;
	}

	public Integer getNumeroBloque() {
		return numeroBloque;
	}

	public void setNumeroBloque(Integer numeroBloque) {
		this.numeroBloque = numeroBloque;
	}

	public String getTemporalidad() {
		return temporalidad;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ExploracionFonologica getExploracionFonologica() {
		return exploracionFonologica;
	}

	public void setExploracionFonologica(ExploracionFonologica exploracionFonologica) {
		this.exploracionFonologica = exploracionFonologica;
	}
	
	
	
}
