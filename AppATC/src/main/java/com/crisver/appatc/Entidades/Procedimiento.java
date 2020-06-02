package com.crisver.appatc.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "procedimiento")
public class Procedimiento {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_procedimiento")
	private Integer idProcedimiento;
	
	@Column (name = "procedimiento")
	private String procedimiento;
	
	@Column(name= "imagen", nullable = false)
	private String imagen;


	public void setIdProcedimiento(Integer idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public String getProcedimiento() {
		return procedimiento;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}


	public Integer getIdProcedimiento() {
		return idProcedimiento;
	}


}
