package com.estefashion.webshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estefashion.webshop.entities.Categorias;
import com.estefashion.webshop.repository.ICategoriasRepository;

@Service
public class CategoriasServiceImpl implements ICategoriasService {
	@Autowired
	ICategoriasRepository repo;//repo es un Repositorio de Categorias
	
	@Override
	public void addCategorias(Categorias c) {
		repo.save(c);
	}
}
