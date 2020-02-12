package com.crisver.appatc.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "aspecto_fonologico")
public class AspectoFonologico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_aspecto_fonologico")
	private Integer idAspectoFonologico;
	
	@Column(name= "falla_omite")
	private boolean fallaOmite;
	
	@Column(name= "falla_asimila")
	private boolean fallaAsimila;
	
	@Column(name= "falla_distorciona")
	private boolean fallaDistorsiona;
	
	@Column(name= "falla_omite_sinfones")
	private boolean fallaOmiteSinfones;
	
	@Column(name= "falla_omite_inicial")
	private boolean fallaOmiteInicial;
	
	@Column(name= "falla_omite_final")
	private boolean fallaOmiteFinal;
	
	@Column(name= "falla_omite_directa")
	private boolean fallaOmiteDirecta;
	
	@Column(name= "falla_omite_inversa")
	private boolean fallaOmiteInversa;
	
	@Column(name= "falla_omite_intervocalica")
	private boolean fallaOmiteIntervocalica;
	
	@Column(name= "falla_omite_trabadas")
	private boolean fallaOmiteTrabadas;
	
	@Column(name= "consolida_espontaneo")
	private boolean consolidaEspontaneo;
	
	@Column(name= "consolida_repetitivo")
	private boolean consolidaRepetitivo;
	
	@Column(name= "consolida_denominativo")
	private boolean consolidaDenominativo;
	
	@OneToMany
	@JoinColumn (name = "id_exploracion_fonologica")
	private ExploracionFonologica exploracionFonologica;
	
	@ManyToOne
	@JoinColumn (name = "id_fonema")
	private Fonema fonema;
	
	public Integer getIdAspectoFonologico() {
		return idAspectoFonologico;
	}
	public void setIdAspectoFonologico(Integer idAspectoFonologico) {
		this.idAspectoFonologico = idAspectoFonologico;
	}
	public boolean isFallaOmite() {
		return fallaOmite;
	}
	public void setFallaOmite(boolean fallaOmite) {
		this.fallaOmite = fallaOmite;
	}
	public boolean isFallaAsimila() {
		return fallaAsimila;
	}
	public void setFallaAsimila(boolean fallaAsimila) {
		this.fallaAsimila = fallaAsimila;
	}
	public boolean isFallaDistorsiona() {
		return fallaDistorsiona;
	}
	public void setFallaDistorsiona(boolean fallaDistorsiona) {
		this.fallaDistorsiona = fallaDistorsiona;
	}
	public boolean isFallaOmiteSinfones() {
		return fallaOmiteSinfones;
	}
	public void setFallaOmiteSinfones(boolean fallaOmiteSinfones) {
		this.fallaOmiteSinfones = fallaOmiteSinfones;
	}
	public boolean isFallaOmiteInicial() {
		return fallaOmiteInicial;
	}
	public void setFallaOmiteInicial(boolean fallaOmiteInicial) {
		this.fallaOmiteInicial = fallaOmiteInicial;
	}
	public boolean isFallaOmiteFinal() {
		return fallaOmiteFinal;
	}
	public void setFallaOmiteFinal(boolean fallaOmiteFinal) {
		this.fallaOmiteFinal = fallaOmiteFinal;
	}
	public boolean isFallaOmiteDirecta() {
		return fallaOmiteDirecta;
	}
	public void setFallaOmiteDirecta(boolean fallaOmiteDirecta) {
		this.fallaOmiteDirecta = fallaOmiteDirecta;
	}
	public boolean isFallaOmiteInversa() {
		return fallaOmiteInversa;
	}
	public void setFallaOmiteInversa(boolean fallaOmiteInversa) {
		this.fallaOmiteInversa = fallaOmiteInversa;
	}
	public boolean isFallaOmiteIntervocalica() {
		return fallaOmiteIntervocalica;
	}
	public void setFallaOmiteIntervocalica(boolean fallaOmiteIntervocalica) {
		this.fallaOmiteIntervocalica = fallaOmiteIntervocalica;
	}
	public boolean isFallaOmiteTrabadas() {
		return fallaOmiteTrabadas;
	}
	public void setFallaOmiteTrabadas(boolean fallaOmiteTrabadas) {
		this.fallaOmiteTrabadas = fallaOmiteTrabadas;
	}
	public boolean isConsolidaEspontaneo() {
		return consolidaEspontaneo;
	}
	public void setConsolidaEspontaneo(boolean consolidaEspontaneo) {
		this.consolidaEspontaneo = consolidaEspontaneo;
	}
	public boolean isConsolidaRepetitivo() {
		return consolidaRepetitivo;
	}
	public void setConsolidaRepetitivo(boolean consolidaRepetitivo) {
		this.consolidaRepetitivo = consolidaRepetitivo;
	}
	public boolean isConsolidaDenominativo() {
		return consolidaDenominativo;
	}
	public void setConsolidaDenominativo(boolean consolidaDenominativo) {
		this.consolidaDenominativo = consolidaDenominativo;
	}
	public ExploracionFonologica getExploracionFonologica() {
		return exploracionFonologica;
	}
	public void setExploracionFonologica(ExploracionFonologica exploracionFonologica) {
		this.exploracionFonologica = exploracionFonologica;
	}
	public Fonema getFonema() {
		return fonema;
	}
	public void setFonema(Fonema fonema) {
		this.fonema = fonema;
	}

	
	
	
	
	
	
	
	
	
	
	
}
