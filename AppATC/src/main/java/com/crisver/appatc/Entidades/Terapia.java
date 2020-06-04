package com.crisver.appatc.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "terapia")
public class Terapia implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_terapia")
	private Integer idTerapia;
	
	@Column (name = "nombre_terapia")
	private String nombreTerapia;
	
	@Column (name = "descripcion")
	private String descripcion;
	

	@Column (name = "imagen", nullable = false)
	private String imagen;
	
	@Column (name = "enlace")
	private String enlace;
	
	@ManyToOne
	@JoinColumn(name = "id_procedimiento")
	private Procedimiento procedimiento;
	

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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public String getNombreTerapia() {
		return nombreTerapia;
	}

	public void setNombreTerapia(String nombreTerapia) {
		this.nombreTerapia = nombreTerapia;
	}

	public Procedimiento getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}
	
	

}
