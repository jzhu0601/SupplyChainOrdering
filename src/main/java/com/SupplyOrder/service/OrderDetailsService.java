package com.SupplyOrder.service;

import com.SupplyOrder.model.OrderDetails;
import com.SupplyOrder.repository.OrderDetailsRepository;
import com.SupplyOrder.repository.OrdersRepository;
import com.SupplyOrder.repository.ProductsRepository;
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
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ProductsRepository productsRepository;

    public Collection<OrderDetails> findAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public OrderDetails addOrderDetail(OrderDetails orderDetail) {
        if (orderDetail.getOrderDetailsId() != null) {
            // cannot create restaurant with specified id value
            return null;
        }
        orderDetail.setOrders(ordersRepository.findOne(orderDetail.getOrderId()));
        orderDetail.setProducts(productsRepository.findOne(orderDetail.getProductId()));
        return orderDetailsRepository.save(orderDetail);
    }
}
