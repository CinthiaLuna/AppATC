package com.crisver.appatc.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="configuracion")
public class Configuracion{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_configuracion")
	private Integer idConfiguracion;
	
	@Column(name="ruta_almacenar")
	private String rutaAlmacenar;
	
	@Column(name ="pdf_guardar")
	private boolean pdfGuardar;
	
	@Column(name="xml_guardar")
	private boolean xmlGuardar;
	
	@OneToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	
	public Integer getIdConfiguracion() {
		return idConfiguracion;
	}
	public void setIdConfiguracion(Integer idConfiguracion) {
		this.idConfiguracion = idConfiguracion;
	}
	public String getRutaAlmacenar() {
		return rutaAlmacenar;
	}
	public void setRutaAlmacenar(String rutaAlmacenar) {
		this.rutaAlmacenar = rutaAlmacenar;
	}
	public boolean isPdfGuardar() {
		return pdfGuardar;
	}
	public void setPdfGuardar(boolean pdfGuardar) {
		this.pdfGuardar = pdfGuardar;
	}
	public boolean isXmlGuardar() {
		return xmlGuardar;
	}
	public void setXmlGuardar(boolean xmlGuardar) {
		this.xmlGuardar = xmlGuardar;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
	
}