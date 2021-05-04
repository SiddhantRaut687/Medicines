package com.medicines.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicines.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
