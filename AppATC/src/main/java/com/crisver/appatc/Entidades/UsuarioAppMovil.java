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
@Table (name = "usuario_appmovil")
public class UsuarioAppMovil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_usuario_appmovil")
	private String idUsuarioAppMovil;
	
	@Column(nullable = false, name = "password")
	private String password;
	
	@Column(name = "numero_expediente")
	private String numeroExpediente;

	public String getIdUsuarioAppMovil() {
		return idUsuarioAppMovil;
	}

	public void setIdUsuarioAppMovil(String idUsuarioAppMovil) {
		this.idUsuarioAppMovil = idUsuarioAppMovil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(String numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuarioAppMovil == null) ? 0 : idUsuarioAppMovil.hashCode());
		result = prime * result + ((numeroExpediente == null) ? 0 : numeroExpediente.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UsuarioAppMovil))
			return false;
		UsuarioAppMovil other = (UsuarioAppMovil) obj;
		if (idUsuarioAppMovil == null) {
			if (other.idUsuarioAppMovil != null)
				return false;
		} else if (!idUsuarioAppMovil.equals(other.idUsuarioAppMovil))
			return false;
		if (numeroExpediente == null) {
			if (other.numeroExpediente != null)
				return false;
		} else if (!numeroExpediente.equals(other.numeroExpediente))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioAppMovil [idUsuarioAppMovil=" + idUsuarioAppMovil + ", password=" + password
				+ ", numeroExpediente=" + numeroExpediente + "]";
	}
	
	
	
	
}
