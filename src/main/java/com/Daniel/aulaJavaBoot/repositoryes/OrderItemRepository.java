package com.Daniel.aulaJavaBoot.repositoryes;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Daniel.aulaJavaBoot.entities.OrderItem;
import com.Daniel.aulaJavaBoot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}