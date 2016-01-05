package com.SupplyOrder.repository;

import com.SupplyOrder.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jason on 1/5/16.
 */
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
