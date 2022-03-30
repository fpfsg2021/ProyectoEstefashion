package com.estefashion.webshop.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estefashion.webshop.entities.Producto;
import com.estefashion.webshop.services.IProductosService;

@RestController
public class RestProductosController {
	@Autowired
	IProductosService productosService;
	
	@GetMapping(path="/productos", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Producto> getProductos(){
		return productosService.findAll();
	}
}
