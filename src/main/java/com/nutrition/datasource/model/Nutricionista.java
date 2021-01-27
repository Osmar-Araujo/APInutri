package com.nutrition.datasource.model;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "nutricionista")
public class Nutricionista implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private LocalDate idade;
	
	@Column(name = "codigo_registro")
	private String codigoRegistro;
	
	@Column(name = "id_paciente")
	private Long IdPaciente;
	

	public Nutricionista() {
		
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	public Long getIdPaciente() {
		return IdPaciente;
	}
	public void setIdPaciente(Long idPaciente) {
		IdPaciente = idPaciente;
	}
	
	
}
