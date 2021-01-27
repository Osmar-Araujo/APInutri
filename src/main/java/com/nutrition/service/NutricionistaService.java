package com.nutrition.service;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.Exception.NutricionistaException;
import com.nutrition.datasource.model.Nutricionista;
import com.nutrition.repository.NutricionistaRepository;
import com.nutrition.resource.NutricionistaResource;

@Service
public class NutricionistaService {
	
	private static final Logger LOG = Logger.getLogger(NutricionistaService.class);
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	@Autowired
	private NutricionistaConversor nutriconv;

	public void cadastrarNutricionista(NutricionistaResource nutriResource) {
		
		try {
			Nutricionista nutri = nutriconv.conversor(nutriResource);
			nutricionistaRepository.saveAndFlush(nutri);
		}catch (NutricionistaException ex){
			LOG.error("Erro ao salvar o nutricionista:" + ex.getMessage(),ex);
		}
		
	}
	
	public List<Nutricionista> buscarTodosNutricionistas(){
		List<Nutricionista> listNutricionista = nutricionistaRepository.findAll();
		return listNutricionista;
	}
	
	public Nutricionista buscarPorId(Long id) throws NutricionistaException {
		Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
		Nutricionista nutri = null;
		if (!optionalNutricionista.isPresent()) {
			throw new NutricionistaException("Nutricionista não encontrado através do ID: " + id);
		}else {
			nutri = optionalNutricionista.get();
		}
		
		return nutri;
	}
	
	private Optional<Nutricionista> getOptional(Long id){
		Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
		return optionalNutricionista;
	}
	
	public void deletarPorId(Long id)throws NutricionistaException {
		Optional<Nutricionista> optional = getOptional(id);
		if (!optional.isPresent()) {
			throw new NutricionistaException("Nutricionista não encontrado através do ID: " + id);
		}else {
			nutricionistaRepository.delete(optional.get());
		}
		
		
	}
}
