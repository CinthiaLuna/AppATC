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
@Table (name = "plantrabajo_procedimiento")
public class PlanTrabajoProcedimiento {
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
