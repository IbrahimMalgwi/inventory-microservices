package com.ganzymalgwi.orderservice.repository;

import com.ganzymalgwi.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
