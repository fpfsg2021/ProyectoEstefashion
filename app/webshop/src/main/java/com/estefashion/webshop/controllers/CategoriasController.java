package com.estefashion.webshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.estefashion.webshop.entities.Categorias;
import com.estefashion.webshop.services.ICategoriasService;

@Controller
public class CategoriasController {
	@Autowired
	private ICategoriasService categoriasService;
	
	@RequestMapping(value = "/crearCategorias")
	public ModelAndView crearNuevaCategoria(
			@RequestParam(required=false) String nombre, 
			@RequestParam(required=false) String imagen) {
		if (nombre!=null) {
			Categorias c = new Categorias(nombre, imagen);
			categoriasService.addCategorias(c);
		}
		List<Categorias> categorias = categoriasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_categoria");
		mav.addObject("tipos_categorias",categorias);
		return mav;
	}
			
			
}