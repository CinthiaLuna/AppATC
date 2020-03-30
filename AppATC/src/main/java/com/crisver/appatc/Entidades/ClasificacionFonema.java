package com.crisver.appatc.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "clasificacion_fonema")
public class ClasificacionFonema implements Serializable {
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_clasificacion_fonema")
	private Integer idClasificacionFonema;
	
	@Column (name = "nombre_clasificacion_fonema")
	private String nombreClasificacionFonema;

	
	
	public Integer getIdClasificacionFonema() {
		return idClasificacionFonema;
	}

	public void setIdClasificacionFonema(Integer idClasificacionFonema) {
		this.idClasificacionFonema = idClasificacionFonema;
	}

	public String getNombreClasificacionFonema() {
		return nombreClasificacionFonema;
	}

	public void setNombreClasificacionFonema(String nombreClasificacionFonema) {
		this.nombreClasificacionFonema = nombreClasificacionFonema;
	}
	
	

}
