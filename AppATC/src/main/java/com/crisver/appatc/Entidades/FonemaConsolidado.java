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
@Table (name = "fonema_consolidado")
public class FonemaConsolidado implements Serializable{
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_fonema_consolidado")
	private Integer idFonemaConsolidado;
	
	@Column (name = "sesion_fonema_consolidado")
	private Integer sesionFonemaConsolidado;
	
	@Column (name = "bloque_fonema_consolidado")
	private Integer bloqueFonemaConsolidado;
	
	@ManyToOne
	@JoinColumn(name = "id_fonema", referencedColumnName = "id_fonema")
	private Fonema fonema;
	
	@ManyToOne
	@JoinColumn(name = "id_resultado", referencedColumnName = "id_resultado")
	private Resultado resultado;

	public Integer getIdFonemaConsolidado() {
		return idFonemaConsolidado;
	}

	public void setIdFonemaConsolidado(Integer idFonemaConsolidado) {
		this.idFonemaConsolidado = idFonemaConsolidado;
	}

	public Integer getSesionFonemaConsolidado() {
		return sesionFonemaConsolidado;
	}

	public void setSesionFonemaConsolidado(Integer sesionFonemaConsolidado) {
		this.sesionFonemaConsolidado = sesionFonemaConsolidado;
	}

	public Integer getBloqueFonemaConsolidado() {
		return bloqueFonemaConsolidado;
	}

	public void setBloqueFonemaConsolidado(Integer bloqueFonemaConsolidado) {
		this.bloqueFonemaConsolidado = bloqueFonemaConsolidado;
	}

	public Fonema getFonema() {
		return fonema;
	}

	public void setFonema(Fonema fonema) {
		this.fonema = fonema;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	
	
	

}
