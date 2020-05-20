package com.crisver.appatc.Entidades;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="cita")
public class Cita implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_cita")
	private Integer idCita;
	
	@Column (name = "bloque")
	private Integer bloque;
	
	@Column (name = "numero_sesion")
	private Integer numeroSesion;
	
	@Column (name = "asistencia_cita")
	private Boolean asistenciaCita;
	
	@Column (name = "tipo_cita")
	private String tipoCita;
	
	@Column (name = "fecha_cita")
	private LocalDate fechaCita;
	
	
	@OneToOne
	@JoinColumn (name = "id_seguimiento", referencedColumnName="id_seguimiento")
	private Seguimiento seguimiento;
	

	public Integer getIdCita() {
		return idCita;
	}

	public Seguimiento getSeguimiento() {
		return seguimiento;
	}


	public void setSeguimiento(Seguimiento seguimiento) {
		this.seguimiento = seguimiento;
	}


	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public Integer getBloque() {
		return bloque;
	}

	public void setBloque(Integer bloque) {
		this.bloque = bloque;
	}

	public Integer getNumeroSesion() {
		return numeroSesion;
	}

	public void setNumeroSesion(Integer numeroSesion) {
		this.numeroSesion = numeroSesion;
	}

	public Boolean getAsistenciaCita() {
		return asistenciaCita;
	}

	public void setAsistenciaCita(Boolean asistenciaCita) {
		this.asistenciaCita = asistenciaCita;
	}

	public String getTipoCita() {
		return tipoCita;
	}

	public void setTipoCita(String tipoCita) {
		this.tipoCita = tipoCita;
	}


	public LocalDate getFechaCita() {
		return fechaCita;
	}


	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}






	
	
	
	
	
}
