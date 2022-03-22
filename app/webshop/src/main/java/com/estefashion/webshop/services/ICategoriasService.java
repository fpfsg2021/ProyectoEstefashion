package com.estefashion.webshop.services;
import java.util.List;

import com.estefashion.webshop.entities.Categorias;


public interface ICategoriasService {
	public void addCategorias(Categorias c);
	public List<Categorias> findAll();
}
