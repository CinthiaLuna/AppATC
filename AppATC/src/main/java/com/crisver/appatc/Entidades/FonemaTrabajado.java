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
@Table(name = "fonema_trabajado")
public class FonemaTrabajado implements Serializable{
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_fonema_trabajado")
	private Integer idFonemaTrabajado;
	
	@Column (name = "falla_articulacion_fonema_trabajado")
	private String fallaArticulacionFonemaTrabajado;
	
	@Column (name =  "inteligibilidad_fonema_trabajado")
	private String intelibilidadFonemaTrabajado;
	
	@Column (name = "consolida_expontaneo")
	private boolean consolidaExpontaneo;
	
	@Column (name = "consolida_repetitivo")
	private boolean consolidaRepetitivo;
	
	@ManyToOne
	@JoinColumn (name = "id_fonema", referencedColumnName = "id_fonema")
	private Fonema fonema;
	
	@ManyToOne
	@JoinColumn (name = "id_seguimiento", referencedColumnName = "id_seguimiento")
	private Seguimiento seguimiento;

	
	
	public Integer getIdFonemaTrabajado() {
		return idFonemaTrabajado;
	}

	public void setIdFonemaTrabajado(Integer idFonemaTrabajado) {
		this.idFonemaTrabajado = idFonemaTrabajado;
	}

	public String getFallaArticulacionFonemaTrabajado() {
		return fallaArticulacionFonemaTrabajado;
	}

	public void setFallaArticulacionFonemaTrabajado(String fallaArticulacionFonemaTrabajado) {
		this.fallaArticulacionFonemaTrabajado = fallaArticulacionFonemaTrabajado;
	}

	public String getIntelibilidadFonemaTrabajado() {
		return intelibilidadFonemaTrabajado;
	}

	public void setIntelibilidadFonemaTrabajado(String intelibilidadFonemaTrabajado) {
		this.intelibilidadFonemaTrabajado = intelibilidadFonemaTrabajado;
	}

	public boolean isConsolidaExpontaneo() {
		return consolidaExpontaneo;
	}

	public void setConsolidaExpontaneo(boolean consolidaExpontaneo) {
		this.consolidaExpontaneo = consolidaExpontaneo;
	}

	public boolean isConsolidaRepetitivo() {
		return consolidaRepetitivo;
	}

	public void setConsolidaRepetitivo(boolean consolidaRepetitivo) {
		this.consolidaRepetitivo = consolidaRepetitivo;
	}

	public Fonema getFonema() {
		return fonema;
	}

	public void setFonema(Fonema fonema) {
		this.fonema = fonema;
	}

	public Seguimiento getSeguimiento() {
		return seguimiento;
	}

	public void setSeguimiento(Seguimiento seguimiento) {
		this.seguimiento = seguimiento;
	}
	

}
