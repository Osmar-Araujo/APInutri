package com.nutrition.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.nutrition.Exception.NutricionistaException;
import com.nutrition.datasource.model.Nutricionista;
import com.nutrition.resource.NutricionistaResource;

@Component
public class NutricionistaConversor {
	public Nutricionista conversor(NutricionistaResource nutriResource) throws NutricionistaException {
		
		try {
			Nutricionista nutri = new Nutricionista();
			Long idPaciente = checkIdPaciente(nutriResource.getIdPaciente());
			LocalDate idade = checkIdade(nutriResource.getIdade());
			nutri.setIdPaciente(idPaciente);
			nutri.setIdade(idade);
			nutri.setCodigoRegistro(nutriResource.getCodigoRegistro());
			nutri.setNome(nutriResource.getNome());
			return nutri;
		}catch(Exception e) {
			throw new NutricionistaException(
					"Falha ao converter o resource para entidade, resource: " + nutriResource);
		}
	}
	
	private Long checkIdPaciente(String idPaciente) {
		return Long.parseLong(idPaciente);
	}
	
	private LocalDate checkIdade(String idade) {
		return LocalDate.parse(idade);
	}
}
