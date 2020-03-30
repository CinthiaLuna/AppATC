package com.crisver.appatc.Entidades;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="exploracion_fonologica")
public class ExploracionFonologica implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_exploracion_fonologica")
	private Integer idExploracionFonologica;
	

	@Column (name = "fecha_exploracion_fonlogica")
	private Timestamp fechaExploracionFonlogica;
	
    @Column(name = "estado_exploracion_fonologica")
    private char estadoExploracionFonologica;
	
    @Column(name = "nivel_lenguaje_balbuceo")
    private Boolean nivelLenguajeBalbuceo;

    @Column(name = "nivel_lenguaje_monosilabos")
    private Boolean nivelLenguajeMonosilabos;
    
    @Column(name = "nivel_lenguaje_bisilabos")
    private Boolean nivelLenguajeBisilabos; 
    
    @Column(name = "nivel_lenguaje_palabras_sueltas")
    private Boolean nivelLenguajePalabrasSueltas;
    
    @Column(name = "nivel_lenguaje_palabras_yuxtapuestas")
    private Boolean nivelLenguajePalabrasYuxtapuestas;
    
    @Column(name = "nivel_lenguaje_frases")
    private Boolean nivelLenguajeFrases;
    
    @Column(name = "nivel_lenguaje_oraciones")
    private Boolean nivelLenguajeOraciones;
    
    @Column(name = "inteligibilidad_se_entiende")
    private Boolean inteligibilidadSeEntiende;
    
    @Column(name = "inteligibilidad_nosiempre_seentiende_espontaneo")
    private Boolean inteligibilidadNosiempreSeentiendeEspontaneo;

    @Column(name = "inteligibilidad_nosiempre_seentiende_repetitivo")
    private Boolean inteligibilidadNosiempreSeentiendeRepetitivo;
    
    @Column(name = "inteligibilidad_nosiempre_seentiende_denominativo")
    private Boolean inteligibilidadNosiempreSeentiendeDenominativo;
    
    @Column(name = "inteligibilidad_no_seentiende")
    private Boolean inteligibilidadNoSeentiende;

    @Column(name = "silabas_completas")
    private Boolean silabasCompletas;
    
    @Column(name = "grado_trastorno")
    private String gradoTrastorno;
    
    @Column(name = "observaciones")
    private String observaciones;
    
    @Column(name = "silaba_final")
    private Boolean silabaFinal;
    
    @Column(name = "silaba_inicial")
    private Boolean silabaInicial;
    
    @Column(name = "silaba_intermedia")
    private Boolean silabaIntermedia;
    
    @ManyToOne  (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
	private Paciente paciente;
    
    
    
	public Integer getIdExploracionFonologica() {
		return idExploracionFonologica;
	}

	public void setIdExploracionFonologica(Integer idExploracionFonologica) {
		this.idExploracionFonologica = idExploracionFonologica;
	}

	public Timestamp getFechaExploracionFonlogica() {
		return fechaExploracionFonlogica;
	}

	public void setFechaExploracionFonlogica(Timestamp fechaExploracionFonlogica) {
		this.fechaExploracionFonlogica = fechaExploracionFonlogica;
	}

	public char getEstadoExploracionFonologica() {
		return estadoExploracionFonologica;
	}

	public void setEstadoExploracionFonologica(char estadoExploracionFonologica) {
		this.estadoExploracionFonologica = estadoExploracionFonologica;
	}

	public Boolean getNivelLenguajeBalbuceo() {
		return nivelLenguajeBalbuceo;
	}

	public void setNivelLenguajeBalbuceo(Boolean nivelLenguajeBalbuceo) {
		this.nivelLenguajeBalbuceo = nivelLenguajeBalbuceo;
	}

	public Boolean getNivelLenguajeMonosilabos() {
		return nivelLenguajeMonosilabos;
	}

	public void setNivelLenguajeMonosilabos(Boolean nivelLenguajeMonosilabos) {
		this.nivelLenguajeMonosilabos = nivelLenguajeMonosilabos;
	}

	public Boolean getNivelLenguajeBisilabos() {
		return nivelLenguajeBisilabos;
	}

	public void setNivelLenguajeBisilabos(Boolean nivelLenguajeBisilabos) {
		this.nivelLenguajeBisilabos = nivelLenguajeBisilabos;
	}

	public Boolean getNivelLenguajePalabrasSueltas() {
		return nivelLenguajePalabrasSueltas;
	}

	public void setNivelLenguajePalabrasSueltas(Boolean nivelLenguajePalabrasSueltas) {
		this.nivelLenguajePalabrasSueltas = nivelLenguajePalabrasSueltas;
	}

	public Boolean getNivelLenguajePalabrasYuxtapuestas() {
		return nivelLenguajePalabrasYuxtapuestas;
	}

	public void setNivelLenguajePalabrasYuxtapuestas(Boolean nivelLenguajePalabrasYuxtapuestas) {
		this.nivelLenguajePalabrasYuxtapuestas = nivelLenguajePalabrasYuxtapuestas;
	}

	public Boolean getNivelLenguajeFrases() {
		return nivelLenguajeFrases;
	}

	public void setNivelLenguajeFrases(Boolean nivelLenguajeFrases) {
		this.nivelLenguajeFrases = nivelLenguajeFrases;
	}

	public Boolean getNivelLenguajeOraciones() {
		return nivelLenguajeOraciones;
	}

	public void setNivelLenguajeOraciones(Boolean nivelLenguajeOraciones) {
		this.nivelLenguajeOraciones = nivelLenguajeOraciones;
	}

	public Boolean getInteligibilidadSeEntiende() {
		return inteligibilidadSeEntiende;
	}

	public void setInteligibilidadSeEntiende(Boolean inteligibilidadSeEntiende) {
		this.inteligibilidadSeEntiende = inteligibilidadSeEntiende;
	}

	public Boolean getInteligibilidadNosiempreSeentiendeEspontaneo() {
		return inteligibilidadNosiempreSeentiendeEspontaneo;
	}

	public void setInteligibilidadNosiempreSeentiendeEspontaneo(Boolean inteligibilidadNosiempreSeentiendeEspontaneo) {
		this.inteligibilidadNosiempreSeentiendeEspontaneo = inteligibilidadNosiempreSeentiendeEspontaneo;
	}

	public Boolean getInteligibilidadNosiempreSeentiendeRepetitivo() {
		return inteligibilidadNosiempreSeentiendeRepetitivo;
	}

	public void setInteligibilidadNosiempreSeentiendeRepetitivo(Boolean inteligibilidadNosiempreSeentiendeRepetitivo) {
		this.inteligibilidadNosiempreSeentiendeRepetitivo = inteligibilidadNosiempreSeentiendeRepetitivo;
	}

	public Boolean getInteligibilidadNosiempreSeentiendeDenominativo() {
		return inteligibilidadNosiempreSeentiendeDenominativo;
	}

	public void setInteligibilidadNosiempreSeentiendeDenominativo(Boolean inteligibilidadNosiempreSeentiendeDenominativo) {
		this.inteligibilidadNosiempreSeentiendeDenominativo = inteligibilidadNosiempreSeentiendeDenominativo;
	}

	public Boolean getInteligibilidadNoSeentiende() {
		return inteligibilidadNoSeentiende;
	}

	public void setInteligibilidadNoSeentiende(Boolean inteligibilidadNoSeentiende) {
		this.inteligibilidadNoSeentiende = inteligibilidadNoSeentiende;
	}

	public Boolean getSilabasCompletas() {
		return silabasCompletas;
	}

	public void setSilabasCompletas(Boolean silabasCompletas) {
		this.silabasCompletas = silabasCompletas;
	}

	public String getGradoTrastorno() {
		return gradoTrastorno;
	}

	public void setGradoTrastorno(String gradoTrastorno) {
		this.gradoTrastorno = gradoTrastorno;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Boolean getSilabaFinal() {
		return silabaFinal;
	}

	public void setSilabaFinal(Boolean silabaFinal) {
		this.silabaFinal = silabaFinal;
	}

	public Boolean getSilabaInicial() {
		return silabaInicial;
	}

	public void setSilabaInicial(Boolean silabaInicial) {
		this.silabaInicial = silabaInicial;
	}

	public Boolean getSilabaIntermedia() {
		return silabaIntermedia;
	}

	public void setSilabaIntermedia(Boolean silabaIntermedia) {
		this.silabaIntermedia = silabaIntermedia;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


    

}
