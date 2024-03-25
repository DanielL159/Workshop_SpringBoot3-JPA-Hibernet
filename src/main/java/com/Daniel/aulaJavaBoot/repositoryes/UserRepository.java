package com.Daniel.aulaJavaBoot.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Daniel.aulaJavaBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ 
//Interface auto implementada do Jpa

}
