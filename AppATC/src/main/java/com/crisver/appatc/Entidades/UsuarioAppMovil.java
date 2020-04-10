package com.crisver.appatc.Entidades;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usuario_appmovil")
public class UsuarioAppMovil implements Serializable{
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_usuario_appmovil")
	private Long idUsuarioAppMovil;
	
	@Column(nullable = false, name = "username")
	private String username;
	
	@Column(nullable = false, name = "password")
	private String password;
	
	@Column(name = "numero_expediente")
	private String numeroExpediente;

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getIdUsuarioAppMovil() {
		return idUsuarioAppMovil;
	}

	public void setIdUsuarioAppMovil(Long idUsuarioAppMovil) {
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
	public String toString() {
		return "UsuarioAppMovil [idUsuarioAppMovil=" + idUsuarioAppMovil + ", password=" + password
				+ ", numeroExpediente=" + numeroExpediente + "]";
	}
	
	
	
	
	
	
}
