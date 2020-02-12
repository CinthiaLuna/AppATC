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
@Table (name = "revaloracion")
public class Revaloracion {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_revaloracion")
	private Integer idRevaloracion;
	
    @Column(name = "falla_omite_ss")
    private Boolean fallaOmiteSs;
    
    @Column(name = "falla_asimila_ss")
    private Boolean fallaAsimilaSs;
    
    @Column(name = "falla_distorsiona_ss")
    private Boolean fallaDistorsionaSs;
    
    @Column(name = "falla_omite_sinfones_ss")
    private Boolean fallaOmiteSinfonesSs;
	
    @Column(name = "falla_omite_inicial_ss")
    private Boolean fallaOmiteInicialSs;
    
    @Column(name = "falla_omite_final_ss")
    private Boolean fallaOmiteFinalSs;
    
    @Column(name = "falla_omite_directa_ss")
    private Boolean fallaOmiteDirectaSs;
    
    @Column(name = "falla_omite_inversa_ss")
    private Boolean fallaOmiteInversaSs;

    @Column(name = "falla_omite_intervocalica_ss")
    private Boolean fallaOmiteIntervocalicaSs;
    
    @Column(name = "falla_omite_trabadas_ss")
    private Boolean fallaOmiteTrabadasSs;
    
    @Column(name = "consolida_espontaneo_ss")
    private Boolean consolidaEspontaneoSs;

    @Column(name = "consolida_repetitivo_ss")
    private Boolean consolidaRepetitivoSs;
    
    @Column(name = "consolida_denominativo_ss")
    private Boolean consolidaDenominativoSs;
    
    @ManyToOne
    @JoinColumn(name = "id_sesion_final")
    private SesionFinal sesionFinal;
    
    @ManyToOne
    @JoinColumn(name = "id_fonema")
    private Fonema fonema;

    
    
	public Integer getIdRevaloracion() {
		return idRevaloracion;
	}

	public void setIdRevaloracion(Integer idRevaloracion) {
		this.idRevaloracion = idRevaloracion;
	}

	public Boolean getFallaOmiteSs() {
		return fallaOmiteSs;
	}

	public void setFallaOmiteSs(Boolean fallaOmiteSs) {
		this.fallaOmiteSs = fallaOmiteSs;
	}

	public Boolean getFallaAsimilaSs() {
		return fallaAsimilaSs;
	}

	public void setFallaAsimilaSs(Boolean fallaAsimilaSs) {
		this.fallaAsimilaSs = fallaAsimilaSs;
	}

	public Boolean getFallaDistorsionaSs() {
		return fallaDistorsionaSs;
	}

	public void setFallaDistorsionaSs(Boolean fallaDistorsionaSs) {
		this.fallaDistorsionaSs = fallaDistorsionaSs;
	}

	public Boolean getFallaOmiteSinfonesSs() {
		return fallaOmiteSinfonesSs;
	}

	public void setFallaOmiteSinfonesSs(Boolean fallaOmiteSinfonesSs) {
		this.fallaOmiteSinfonesSs = fallaOmiteSinfonesSs;
	}

	public Boolean getFallaOmiteInicialSs() {
		return fallaOmiteInicialSs;
	}

	public void setFallaOmiteInicialSs(Boolean fallaOmiteInicialSs) {
		this.fallaOmiteInicialSs = fallaOmiteInicialSs;
	}

	public Boolean getFallaOmiteFinalSs() {
		return fallaOmiteFinalSs;
	}

	public void setFallaOmiteFinalSs(Boolean fallaOmiteFinalSs) {
		this.fallaOmiteFinalSs = fallaOmiteFinalSs;
	}

	public Boolean getFallaOmiteDirectaSs() {
		return fallaOmiteDirectaSs;
	}

	public void setFallaOmiteDirectaSs(Boolean fallaOmiteDirectaSs) {
		this.fallaOmiteDirectaSs = fallaOmiteDirectaSs;
	}

	public Boolean getFallaOmiteInversaSs() {
		return fallaOmiteInversaSs;
	}

	public void setFallaOmiteInversaSs(Boolean fallaOmiteInversaSs) {
		this.fallaOmiteInversaSs = fallaOmiteInversaSs;
	}

	public Boolean getFallaOmiteIntervocalicaSs() {
		return fallaOmiteIntervocalicaSs;
	}

	public void setFallaOmiteIntervocalicaSs(Boolean fallaOmiteIntervocalicaSs) {
		this.fallaOmiteIntervocalicaSs = fallaOmiteIntervocalicaSs;
	}

	public Boolean getFallaOmiteTrabadasSs() {
		return fallaOmiteTrabadasSs;
	}

	public void setFallaOmiteTrabadasSs(Boolean fallaOmiteTrabadasSs) {
		this.fallaOmiteTrabadasSs = fallaOmiteTrabadasSs;
	}

	public Boolean getConsolidaEspontaneoSs() {
		return consolidaEspontaneoSs;
	}

	public void setConsolidaEspontaneoSs(Boolean consolidaEspontaneoSs) {
		this.consolidaEspontaneoSs = consolidaEspontaneoSs;
	}

	public Boolean getConsolidaRepetitivoSs() {
		return consolidaRepetitivoSs;
	}

	public void setConsolidaRepetitivoSs(Boolean consolidaRepetitivoSs) {
		this.consolidaRepetitivoSs = consolidaRepetitivoSs;
	}

	public Boolean getConsolidaDenominativoSs() {
		return consolidaDenominativoSs;
	}

	public void setConsolidaDenominativoSs(Boolean consolidaDenominativoSs) {
		this.consolidaDenominativoSs = consolidaDenominativoSs;
	}

	public SesionFinal getSesionFinal() {
		return sesionFinal;
	}

	public void setSesionFinal(SesionFinal sesionFinal) {
		this.sesionFinal = sesionFinal;
	}

	public Fonema getFonema() {
		return fonema;
	}

	public void setFonema(Fonema fonema) {
		this.fonema = fonema;
	}
}
