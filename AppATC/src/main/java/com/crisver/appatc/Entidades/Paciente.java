package com.crisver.appatc.Entidades;

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
	
	@OneToOne
	@JoinColumn( name="numero_expediente", referencedColumnName = "numero_expediente")
	private UsuarioPaciente UsuarioPaciente;
	
	
	
	
	public Paciente () {
		
	}
	
	public Paciente(Integer idPaciente, String nombrePaciente, String apellidoPaciente, Integer edadPaciente, UsuarioPaciente usuarioPaciente) {
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.apellidoPaciente = apellidoPaciente;
		this.edadPaciente = edadPaciente;
		UsuarioPaciente = usuarioPaciente;
	}
	
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public UsuarioPaciente getUsuarioPaciente() {
		return UsuarioPaciente;
	}
	public void setUsuarioPaciente(UsuarioPaciente usuarioPaciente) {
		UsuarioPaciente = usuarioPaciente;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UsuarioPaciente == null) ? 0 : UsuarioPaciente.hashCode());
		result = prime * result + ((apellidoPaciente == null) ? 0 : apellidoPaciente.hashCode());
		result = prime * result + ((edadPaciente == null) ? 0 : edadPaciente.hashCode());
		result = prime * result + ((idPaciente == null) ? 0 : idPaciente.hashCode());
		result = prime * result + ((nombrePaciente == null) ? 0 : nombrePaciente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Paciente))
			return false;
		Paciente other = (Paciente) obj;
		if (UsuarioPaciente == null) {
			if (other.UsuarioPaciente != null)
				return false;
		} else if (!UsuarioPaciente.equals(other.UsuarioPaciente))
			return false;
		if (apellidoPaciente == null) {
			if (other.apellidoPaciente != null)
				return false;
		} else if (!apellidoPaciente.equals(other.apellidoPaciente))
			return false;
		if (edadPaciente == null) {
			if (other.edadPaciente != null)
				return false;
		} else if (!edadPaciente.equals(other.edadPaciente))
			return false;
		if (idPaciente == null) {
			if (other.idPaciente != null)
				return false;
		} else if (!idPaciente.equals(other.idPaciente))
			return false;
		if (nombrePaciente == null) {
			if (other.nombrePaciente != null)
				return false;
		} else if (!nombrePaciente.equals(other.nombrePaciente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", apellidoPaciente="
				+ apellidoPaciente + ", edadPaciente=" + edadPaciente + ", UsuarioPaciente=" + UsuarioPaciente + "]";
	}
	
	
}
