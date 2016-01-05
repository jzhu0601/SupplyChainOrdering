package com.SupplyOrder.service;

import com.SupplyOrder.model.Orders;
import com.SupplyOrder.repository.CustomersRepository;
import com.SupplyOrder.repository.EmployeesRepository;
import com.SupplyOrder.repository.OrdersRepository;
import com.SupplyOrder.repository.ShippersRepository;
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
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private EmployeesRepository employeesRepository;
    @Autowired
    private CustomersRepository customersRepository;
    @Autowired
    private ShippersRepository shippersRepository;

    public Collection<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Orders addOrder(Orders order) {
        if (order.getOrderId() != null) {
            // cannot create restaurant with specified id value
            return null;
        }
        order.setEmployees(employeesRepository.findOne(order.getEmployeeId()));
        order.setCustomers(customersRepository.findOne(order.getCustomerId()));
        order.setShippers(shippersRepository.findOne(order.getShipperId()));
        return ordersRepository.save(order);
    }


}
