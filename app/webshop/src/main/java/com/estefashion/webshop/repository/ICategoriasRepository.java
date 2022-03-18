package com.estefashion.webshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estefashion.webshop.entities.Categorias;

public interface ICategoriasRepository extends JpaRepository<Categorias, Integer>{
}