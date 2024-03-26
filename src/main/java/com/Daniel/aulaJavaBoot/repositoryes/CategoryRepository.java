package com.Daniel.aulaJavaBoot.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Daniel.aulaJavaBoot.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{ 
//Interface auto implementada do Jpa

}
