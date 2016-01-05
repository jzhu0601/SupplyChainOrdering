package com.SupplyOrder.controller;

import com.SupplyOrder.model.OrderDetails;
import com.SupplyOrder.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Jason on 1/5/16.
 */
@RestController
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @RequestMapping(value = "/api/orderDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<OrderDetails>> getAllOrderDetails() {
        return new ResponseEntity<>(orderDetailsService.findAllOrderDetails(), HttpStatus.OK);
    }

    @RequestMapping(value = "/api/orderDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderDetails> addOrderDetail(@RequestBody OrderDetails orderDetail) {
        return new ResponseEntity<OrderDetails>(orderDetailsService.addOrderDetail(orderDetail), HttpStatus.CREATED);
    }
}