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
@Table (name = "fonema")
public class Fonema {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_fonema")
	private Integer idFonema;
	
	@Column (name = "fonema")
	private String fonema;
	
	@ManyToOne
	@JoinColumn(name = "id_clasificacion_fonema", referencedColumnName = "id_clasificacion_fonema")
	private ClasificacionFonema clasificacionFonema;

	
	
	public Integer getIdFonema() {
		return idFonema;
	}

	public void setIdFonema(Integer idFonema) {
		this.idFonema = idFonema;
	}

	public String getFonema() {
		return fonema;
	}

	public void setFonema(String fonema) {
		this.fonema = fonema;
	}

	public ClasificacionFonema getClasificacionFonema() {
		return clasificacionFonema;
	}

	public void setClasificacionFonema(ClasificacionFonema clasificacionFonema) {
		this.clasificacionFonema = clasificacionFonema;
	}


	
	

}
