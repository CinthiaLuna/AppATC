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
@Table (name = "usuario_paciente")
public class UsuarioPaciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "numero_expediente")
	private String numeroExpediente;
	
	@Column(nullable = false, name = "contrasena")
	private String contrasena;
}
