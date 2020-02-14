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
@Table (name = "sustituye_aspecto_fonologico")
public class SustituyeAspectoFonologico {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_sustituye_aspecto_fonologico")
	private Integer idSustituyeAspectoFonologico;
	
	@Column (name = "sustituye_fonema")
	private String sustituyeFonema;
	
	@ManyToOne
	@JoinColumn (name = "id_aspecto_fonologico", referencedColumnName = "id_aspecto_fonologico")
	private AspectoFonologico aspectoFonologico;

	public Integer getIdSustituyeAspectoFonologico() {
		return idSustituyeAspectoFonologico;
	}

	public void setIdSustituyeAspectoFonologico(Integer idSustituyeAspectoFonologico) {
		this.idSustituyeAspectoFonologico = idSustituyeAspectoFonologico;
	}

	public String getSustituyeFonema() {
		return sustituyeFonema;
	}

	public void setSustituyeFonema(String sustituyeFonema) {
		this.sustituyeFonema = sustituyeFonema;
	}

	public AspectoFonologico getAspectoFonologico() {
		return aspectoFonologico;
	}

	public void setAspectoFonologico(AspectoFonologico aspectoFonologico) {
		this.aspectoFonologico = aspectoFonologico;
	}
	
	

}
