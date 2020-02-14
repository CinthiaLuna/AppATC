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
@Table (name = "sustituye_revaloracion")
public class SustituyeRevaloracion {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_sustituye_rev")
	private Integer idSustituyeRevaloracion;
	
	@Column (name = "fonema_sustituye_rev")
	private String fonemaSustituyeRevaloracion;
	
	@ManyToOne
	@JoinColumn (name = "id_revaloracion", referencedColumnName = "id_revaloracion")
	private Revaloracion revaloracion;

	
	
	public Integer getIdSustituyeRevaloracion() {
		return idSustituyeRevaloracion;
	}

	public void setIdSustituyeRevaloracion(Integer idSustituyeRevaloracion) {
		this.idSustituyeRevaloracion = idSustituyeRevaloracion;
	}

	public String getFonemaSustituyeRevaloracion() {
		return fonemaSustituyeRevaloracion;
	}

	public void setFonemaSustituyeRevaloracion(String fonemaSustituyeRevaloracion) {
		this.fonemaSustituyeRevaloracion = fonemaSustituyeRevaloracion;
	}

	public Revaloracion getRevaloracion() {
		return revaloracion;
	}

	public void setRevaloracion(Revaloracion revaloracion) {
		this.revaloracion = revaloracion;
	}
	
	
}
