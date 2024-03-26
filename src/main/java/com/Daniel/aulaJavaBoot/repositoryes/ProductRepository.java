package com.Daniel.aulaJavaBoot.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Daniel.aulaJavaBoot.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{ 
//Interface auto implementada do Jpa

}
