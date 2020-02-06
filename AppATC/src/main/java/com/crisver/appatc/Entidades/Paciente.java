package com.crisver.appatc.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Cinth
 *
 */
@Entity
@Table (name = "paciente")
public class Paciente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_paciente")
	private Integer idPaciente;
	@Column(name="nombre_paciente")
	private String nombrePaciente;
	@Column(name="apellido_paciente")
	private String apellidoPaciente;
	@Column(name="edad_paciente")
	private Integer edadPaciente;
	@Column(nullable=false,name="numero_expediente",unique = true)
	private String numeroExpediente;
	@Column(nullable=false, name="password")
	private String password;
	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getApellidoPaciente() {
		return apellidoPaciente;
	}
	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}
	public Integer getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(Integer edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getNumeroExpediente() {
		return numeroExpediente;
	}
	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
