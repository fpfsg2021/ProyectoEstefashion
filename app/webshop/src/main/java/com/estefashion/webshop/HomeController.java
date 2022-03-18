package com.estefashion.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estefashion.webshop.entities.Categorias;
import com.estefashion.webshop.services.ICategoriasService;

@Controller
public class HomeController {
	@Autowired
	private ICategoriasService categoriasService;
	
	@RequestMapping(value = "/crearCategoria")
	public String angelManuel() {
		Categorias categoria = new Categorias(0,"Sombreros pamperos","sombreros.png");
		categoriasService.addCategorias(categoria);
		return "index.html";
	}
}