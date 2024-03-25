package com.Daniel.aulaJavaBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.aulaJavaBoot.entities.Order;
import com.Daniel.aulaJavaBoot.services.OrderService;


@RestController//Indica que e um recurso web que e implementado por um controlador reste
@RequestMapping(value = "/orders")//Da nome ao recurso
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping//Indica que esse metodo que responde o tipo get do http
	public ResponseEntity<List<Order>> findAll(){ //ResponseEntity e um tipo especifico do spring para retornar resposta de requisiçoes web
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
