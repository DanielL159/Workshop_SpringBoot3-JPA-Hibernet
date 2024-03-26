package com.Daniel.aulaJavaBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.aulaJavaBoot.entities.Product;
import com.Daniel.aulaJavaBoot.repositoryes.ProductRepository;

@Service//Registra a classe como um componente do spring para ser automaticamente implementada ou @Componente
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id){
		 Optional<Product> obj = repository.findById(id);
		 return obj.get();
	}
}
