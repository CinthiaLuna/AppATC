package com.crisver.appatc.Entidades;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "sesion_final")
public class SesionFinal {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_sesion_final")
	private Integer idSesionFinal;
	
	@Column(name = "fecha_sesion_final")
    private Timestamp fechaSesionFinal;
	
    @Column(name = "estado_sesion_final")
    private String estadoSesionFinal;
    
    @Column(name = "observaciones_sesion_final")
    private String observacionesSesionFinal;
    
    @Column(name = "inteligibilidad_se_entiende_ss")
    private Boolean inteligibilidadSeEntiendeSs;   
    
    @Column(name = "inteligibilidad_nosiempre_seentiende_espontaneo_ss")
    private Boolean inteligibilidadNosiempreSeentiendeEspontaneoSs;

    @Column(name = "inteligibilidad_nosiempre_seentiende_repetitivo_ss")
    private Boolean inteligibilidadNosiempreSeentiendeRepetitivoSs;
    
    @Column(name = "inteligibilidad_nosiempre_seentiende_denominativo_ss")
    private Boolean inteligibilidadNosiempreSeentiendeDenominativoSs;
    
    @Column(name = "inteligibilidad_no_seentiende_ss")
    private Boolean inteligibilidadNoSeentiendeSs;

    @Column(name = "silabas_completas_ss")
    private Boolean silabasCompletasSs;
    
    @Column(name = "silaba_inicial_ss")
    private Boolean silabaInicialSs;
    
    @Column(name = "silaba_intermedia_ss")
    private Boolean silabaIntermediaSs;
    
    @Column(name = "silaba_final_ss")
    private Boolean silabaFinalSs;
    
    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    private Paciente paciente;

    
    
	public Integer getIdSesionFinal() {
		return idSesionFinal;
	}

	public void setIdSesionFinal(Integer idSesionFinal) {
		this.idSesionFinal = idSesionFinal;
	}

	public Timestamp getFechaSesionFinal() {
		return fechaSesionFinal;
	}

	public void setFechaSesionFinal(Timestamp fechaSesionFinal) {
		this.fechaSesionFinal = fechaSesionFinal;
	}

	public String getEstadoSesionFinal() {
		return estadoSesionFinal;
	}

	public void setEstadoSesionFinal(String estadoSesionFinal) {
		this.estadoSesionFinal = estadoSesionFinal;
	}

	public String getObservacionesSesionFinal() {
		return observacionesSesionFinal;
	}

	public void setObservacionesSesionFinal(String observacionesSesionFinal) {
		this.observacionesSesionFinal = observacionesSesionFinal;
	}

	public Boolean getInteligibilidadSeEntiendeSs() {
		return inteligibilidadSeEntiendeSs;
	}

	public void setInteligibilidadSeEntiendeSs(Boolean inteligibilidadSeEntiendeSs) {
		this.inteligibilidadSeEntiendeSs = inteligibilidadSeEntiendeSs;
	}

	public Boolean getInteligibilidadNosiempreSeentiendeEspontaneoSs() {
		return inteligibilidadNosiempreSeentiendeEspontaneoSs;
	}

	public void setInteligibilidadNosiempreSeentiendeEspontaneoSs(Boolean inteligibilidadNosiempreSeentiendeEspontaneoSs) {
		this.inteligibilidadNosiempreSeentiendeEspontaneoSs = inteligibilidadNosiempreSeentiendeEspontaneoSs;
	}

	public Boolean getInteligibilidadNosiempreSeentiendeRepetitivoSs() {
		return inteligibilidadNosiempreSeentiendeRepetitivoSs;
	}

	public void setInteligibilidadNosiempreSeentiendeRepetitivoSs(Boolean inteligibilidadNosiempreSeentiendeRepetitivoSs) {
		this.inteligibilidadNosiempreSeentiendeRepetitivoSs = inteligibilidadNosiempreSeentiendeRepetitivoSs;
	}

	public Boolean getInteligibilidadNosiempreSeentiendeDenominativoSs() {
		return inteligibilidadNosiempreSeentiendeDenominativoSs;
	}

	public void setInteligibilidadNosiempreSeentiendeDenominativoSs(
			Boolean inteligibilidadNosiempreSeentiendeDenominativoSs) {
		this.inteligibilidadNosiempreSeentiendeDenominativoSs = inteligibilidadNosiempreSeentiendeDenominativoSs;
	}

	public Boolean getInteligibilidadNoSeentiendeSs() {
		return inteligibilidadNoSeentiendeSs;
	}

	public void setInteligibilidadNoSeentiendeSs(Boolean inteligibilidadNoSeentiendeSs) {
		this.inteligibilidadNoSeentiendeSs = inteligibilidadNoSeentiendeSs;
	}

	public Boolean getSilabasCompletasSs() {
		return silabasCompletasSs;
	}

	public void setSilabasCompletasSs(Boolean silabasCompletasSs) {
		this.silabasCompletasSs = silabasCompletasSs;
	}

	public Boolean getSilabaInicialSs() {
		return silabaInicialSs;
	}

	public void setSilabaInicialSs(Boolean silabaInicialSs) {
		this.silabaInicialSs = silabaInicialSs;
	}

	public Boolean getSilabaIntermediaSs() {
		return silabaIntermediaSs;
	}

	public void setSilabaIntermediaSs(Boolean silabaIntermediaSs) {
		this.silabaIntermediaSs = silabaIntermediaSs;
	}

	public Boolean getSilabaFinalSs() {
		return silabaFinalSs;
	}

	public void setSilabaFinalSs(Boolean silabaFinalSs) {
		this.silabaFinalSs = silabaFinalSs;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
    
    
}
