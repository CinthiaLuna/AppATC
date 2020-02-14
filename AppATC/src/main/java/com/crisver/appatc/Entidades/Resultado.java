package com.crisver.appatc.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "resultado")
public class Resultado {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_resultado")
	private Integer idResultado;
	
	@Column (name = "avance_porcentaje")
	private double avancePorcentaje;
	
	@Column (name = "sesiones_total")
	private Integer sesionesTotal;
	
	@Column (name = "bloques_total")
	private Integer bloquesTotal;
	
	@ManyToOne
	@JoinColumn (name = "id_paciente", referencedColumnName = "id_paciente")
	private Paciente paciente;

	public Integer getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public double getAvancePorcentaje() {
		return avancePorcentaje;
	}

	public void setAvancePorcentaje(double avancePorcentaje) {
		this.avancePorcentaje = avancePorcentaje;
	}

	public Integer getSesionesTotal() {
		return sesionesTotal;
	}

	public void setSesionesTotal(Integer sesionesTotal) {
		this.sesionesTotal = sesionesTotal;
	}

	public Integer getBloquesTotal() {
		return bloquesTotal;
	}

	public void setBloquesTotal(Integer bloquesTotal) {
		this.bloquesTotal = bloquesTotal;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	

	
}
