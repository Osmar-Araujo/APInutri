package com.nutrition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutrition.Exception.NutricionistaException;
import com.nutrition.datasource.model.Nutricionista;
import com.nutrition.resource.NutricionistaResource;
import com.nutrition.service.NutricionistaService;

@RestController
@RequestMapping(value = "/api/v1")
public class NutricionistaController {
	
	
	@Autowired
	private NutricionistaService nutriService;
	
	@GetMapping(path = "/nutricionistas")
	public List<Nutricionista> buscarNutricionista() {
		
		return nutriService.buscarTodosNutricionistas();
	}
	
	@GetMapping(path = "/nutricionistas/id/{id}")
	public Nutricionista buscarNutricionistaPorId(@PathVariable (name = "id", required = true) Long id)throws NutricionistaException {
		return nutriService.buscarPorId(id);
	}
	
	@PostMapping(path = "/nutricionistas/save")
	public void salvaNutricionista(@RequestBody NutricionistaResource nutriResource) {
		nutriService.cadastrarNutricionista(nutriResource);
	}
	
	@DeleteMapping(path = "/nutricionistas/delete/{id}")
	public void deletaNutricionista(@PathVariable(name="id", required = true)Long id) throws NutricionistaException {
		nutriService.deletarPorId(id);
	}
}
