package com.Daniel.aulaJavaBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.aulaJavaBoot.entities.Order;
import com.Daniel.aulaJavaBoot.repositoryes.OrderRepository;

@Service//Registra a classe como um componente do spring para ser automaticamente implementada ou @Componente
public class OrderService {
	
	@Autowired
	private OrderRepository repository;

	public  List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id){
		 Optional<Order> obj = repository.findById(id);
		 return obj.get();
	}
}
