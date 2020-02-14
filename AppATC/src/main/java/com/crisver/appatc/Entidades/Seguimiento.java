package com.crisver.appatc.Entidades;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "seguimiento")
public class Seguimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_seguimiento")
	private Integer idSeguimiento;
	
	@Column (name = "fecha_seguimiento")
	private Timestamp fechaSeguimiento;
	
	@Column (name = "estado_seguimiento")
	private char estadoSeguimiento;
	
	@Column(name = "tipo_modalidad")
	private String tipoModalidad;
	
	@Column (name = "numero_sesion_seguimiento")
	private Integer numeroSesionSeguimiento;
	
	@Column (name = "bloque_sesion")
	private Integer bloqueSesion;
	
	@Column (name = "observaciones")
	private String observaciones;
	
	@ManyToOne
	@JoinColumn (name = "id_modalidad", referencedColumnName = "id_modalidad")
	private Modalidad modalidad;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
	private Paciente paciente;

	
	
	public Integer getIdSeguimiento() {
		return idSeguimiento;
	}

	public void setIdSeguimiento(Integer idSeguimiento) {
		this.idSeguimiento = idSeguimiento;
	}

	public Timestamp getFechaSeguimiento() {
		return fechaSeguimiento;
	}

	public void setFechaSeguimiento(Timestamp fechaSeguimiento) {
		this.fechaSeguimiento = fechaSeguimiento;
	}

	public char getEstadoSeguimiento() {
		return estadoSeguimiento;
	}

	public void setEstadoSeguimiento(char estadoSeguimiento) {
		this.estadoSeguimiento = estadoSeguimiento;
	}

	public String getTipoModalidad() {
		return tipoModalidad;
	}

	public void setTipoModalidad(String tipoModalidad) {
		this.tipoModalidad = tipoModalidad;
	}

	public Integer getNumeroSesionSeguimiento() {
		return numeroSesionSeguimiento;
	}

	public void setNumeroSesionSeguimiento(Integer numeroSesionSeguimiento) {
		this.numeroSesionSeguimiento = numeroSesionSeguimiento;
	}

	public Integer getBloqueSesion() {
		return bloqueSesion;
	}

	public void setBloqueSesion(Integer bloqueSesion) {
		this.bloqueSesion = bloqueSesion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


}
