package com.Daniel.aulaJavaBoot.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.aulaJavaBoot.entities.User;

@RestController//Indica que e um recurso web que e implementado por um controlador reste
@RequestMapping(value = "/users")//Da nome ao recurso
public class UserResource {

	@GetMapping//Indica que esse metodo que responde o tipo get do http
	public ResponseEntity<User> findAll(){ //ResponseEntity e um tipo especifico do spring para retornar resposta de requisiçoes web
		User u = new User(1L,"Maria","maria@gmail.com","9999999","12345");
		return ResponseEntity.ok().body(u);
		
	}
}
