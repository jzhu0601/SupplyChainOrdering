package com.SupplyOrder.repository;

import com.SupplyOrder.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jason on 1/5/16.
 */
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
