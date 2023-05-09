package com.ganzymalgwi.repository;


import com.ganzymalgwi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
