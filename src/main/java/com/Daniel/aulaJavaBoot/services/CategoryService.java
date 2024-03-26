package com.Daniel.aulaJavaBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.aulaJavaBoot.entities.Category;
import com.Daniel.aulaJavaBoot.repositoryes.CategoryRepository;

@Service//Registra a classe como um componente do spring para ser automaticamente implementada ou @Componente
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id){
		 Optional<Category> obj = repository.findById(id);
		 return obj.get();
	}
}
