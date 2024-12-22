package com.exemple.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
