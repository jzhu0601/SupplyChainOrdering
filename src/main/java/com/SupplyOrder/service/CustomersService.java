package com.SupplyOrder.service;

import com.SupplyOrder.model.Customers;
import com.SupplyOrder.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by Jason on 1/5/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomersService {
    @Autowired
    private CustomersRepository customersRepository;

    public Collection<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Customers addCustomer(Customers customer) {
        if (customer.getCustomerId() != null) {
            // cannot create restaurant with specified id value
            return null;
        }
        return customersRepository.save(customer);
    }
}
