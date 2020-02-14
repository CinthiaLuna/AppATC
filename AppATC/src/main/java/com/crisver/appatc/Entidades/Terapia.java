package com.crisver.appatc.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "terapia")
public class Terapia {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_terapia")
	private Integer idTerapia;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	@Lob
	@Column (name = "imagen", nullable = false)
	private Byte[] imagen;
	
	@Column (name = "enlace")
	private String enlace;
	
	@ManyToOne
	@JoinColumn (name = "id_fonema", referencedColumnName = "id_fonema")
	private Fonema fonema;

	public Integer getIdTerapia() {
		return idTerapia;
	}

	public void setIdTerapia(Integer idTerapia) {
		this.idTerapia = idTerapia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public Fonema getFonema() {
		return fonema;
	}

	public void setFonema(Fonema fonema) {
		this.fonema = fonema;
	}
	
	

}
