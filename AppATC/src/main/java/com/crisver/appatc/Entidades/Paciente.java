package com.crisver.appatc.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "paciente")
public class Paciente implements Serializable{
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
	
	@Column (name = "numero_expediente")
	private String numero_expediente;
	
	@OneToOne
	@JoinColumn(name="id_usuario_appmovil", referencedColumnName = "id_usuario_appmovil")
	private UsuarioAppMovil usuarioAppMovil;
	
	
	
	
	public Paciente () {
		
	}
		
	public Paciente(Integer idPaciente, String nombrePaciente, String apellidoPaciente, Integer edadPaciente,
			String numero_expediente, UsuarioAppMovil usuarioAppMovil) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.apellidoPaciente = apellidoPaciente;
		this.edadPaciente = edadPaciente;
		this.numero_expediente = numero_expediente;
		this.usuarioAppMovil = usuarioAppMovil;
	}

	public String getNumero_expediente() {
		return numero_expediente;
	}

	public void setNumero_expediente(String numero_expediente) {
		this.numero_expediente = numero_expediente;
	}

	public UsuarioAppMovil getUsuarioAppMovil() {
		return usuarioAppMovil;
	}

	public void setUsuarioAppMovil(UsuarioAppMovil usuarioAppMovil) {
		this.usuarioAppMovil = usuarioAppMovil;
	}

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
	
	private static final long serialVersionUID = 1L;
	
	
	
}
