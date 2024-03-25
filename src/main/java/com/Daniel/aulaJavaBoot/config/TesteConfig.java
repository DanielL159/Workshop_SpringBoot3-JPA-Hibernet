package com.Daniel.aulaJavaBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Daniel.aulaJavaBoot.entities.User;
import com.Daniel.aulaJavaBoot.repositoryes.UserRepository;

@Configuration// indicar que e uma classe especifica de configuracao
@Profile("test")//indica que e uma config especifica de teste
public class TesteConfig implements CommandLineRunner{/*Interface utilizada para executar uma linha de comando quando a aplicacao rodar*/
	
	@Autowired//mecanismo de injeçao de dependencia desacoplada
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
			User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
			User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
			
			userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
}
