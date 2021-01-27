package com.nutrition.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {
	
	@JsonProperty("nome_nutricionista")
	private String nome;
	
	@JsonProperty("idade")
	private String idade;
	
	@JsonProperty("codigo_registro")
	private String codigoRegistro;
	
	@JsonProperty("id_paciente")
	private String idPaciente;
	

	public NutricionistaResource(String nome, String idade, String codigoRegistro, String idPaciente) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.codigoRegistro = codigoRegistro;
		this.idPaciente = idPaciente;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getCodigoRegistro() {
		return codigoRegistro;
	}


	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}


	@Override
	public String toString() {
		return "NutricionistaResource [nome=" + nome + ", idade=" + idade + ", codigoRegistro=" + codigoRegistro
				+ ", idPaciente=" + idPaciente + "]";
	}
	
	
	
}
