package com.Daniel.aulaJavaBoot.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Daniel.aulaJavaBoot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{ 
//Interface auto implementada do Jpa

}
