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
@Table (name = "plantrabajo_procedimiento")
public class PlanTrabajoProcedimiento implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_plan_trabajo_procedimiento")
	private Integer idPlanTrabajoProcedimiento;
	
	@ManyToOne
	@JoinColumn(name="id_procedimiento", referencedColumnName = "id_procedimiento")
	private Procedimiento procedimiento; 
	
	@ManyToOne
	@JoinColumn(name = "id_plan_trabajo", referencedColumnName = "id_plan_trabajo")
	private PlanTrabajo planTrabajo;
	
	@ManyToOne
	@JoinColumn(name= "id_paciente", referencedColumnName = "id_paciente")
	private Paciente paciente;
	
	

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Integer getIdPlanTrabajoProcedimiento() {
		return idPlanTrabajoProcedimiento;
	}

	public void setIdPlanTrabajoProcedimiento(Integer idPlanTrabajoProcedimiento) {
		this.idPlanTrabajoProcedimiento = idPlanTrabajoProcedimiento;
	}

	public Procedimiento getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}

	public PlanTrabajo getPlanTrabajo() {
		return planTrabajo;
	}

	public void setPlanTrabajo(PlanTrabajo planTrabajo) {
		this.planTrabajo = planTrabajo;
	}
	
	
}
