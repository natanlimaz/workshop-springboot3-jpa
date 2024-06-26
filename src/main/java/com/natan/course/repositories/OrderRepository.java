package com.natan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}