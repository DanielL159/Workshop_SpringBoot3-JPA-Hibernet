package com.Daniel.aulaJavaBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.aulaJavaBoot.entities.User;
import com.Daniel.aulaJavaBoot.services.UserService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController//Indica que e um recurso web que e implementado por um controlador reste
@RequestMapping(value = "/users")//Da nome ao recurso
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping//Indica que esse metodo que responde o tipo get do http
	public ResponseEntity<List<User>> findAll(){ //ResponseEntity e um tipo especifico do spring para retornar resposta de requisiçoes web
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
