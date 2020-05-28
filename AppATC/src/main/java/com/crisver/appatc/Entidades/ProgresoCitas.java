package com.crisver.appatc.Entidades;


public class ProgresoCitas {
	private Integer asistencias;
	private Integer faltas;
	private Integer restantes;
	private Integer mayor;
	private Integer sesionEvaluada;
	
	public ProgresoCitas() {
		this.restantes = 0;
		this.asistencias = 0;
		this.faltas = 0;
		this.mayor = 0;
		this.sesionEvaluada = 0;
	}
	public Integer getRestantes() {
		return restantes;
	}
	public void setRestantes(Integer restantes) {
		this.restantes += restantes;
	}
	public Integer getSesionEvaluada() {
		return sesionEvaluada;
	}
	public void setSesionEvaluada(Integer sesionEvaluada) {
		this.sesionEvaluada += sesionEvaluada;
	}
	public Integer getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(Integer asistencias) {
		this.asistencias += asistencias;
	}
	public Integer getFaltas() {
		return faltas;
	}
	public void setFaltas(Integer faltas) {
		this.faltas += faltas;
	}
	public Integer getMayor() {
		return mayor;
	}
	public void setMayor(Integer mayor) {
		this.mayor = mayor;
	}
	

}
