package com.Daniel.aulaJavaBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.aulaJavaBoot.entities.User;
import com.Daniel.aulaJavaBoot.repositoryes.UserRepository;

@Service//Registra a classe como um componente do spring para ser automaticamente implementada ou @Componente
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public  List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id){
		 Optional<User> obj = repository.findById(id);
		 return obj.get();
	}
}
