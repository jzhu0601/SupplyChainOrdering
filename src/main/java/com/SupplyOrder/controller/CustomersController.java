package com.SupplyOrder.controller;

import com.SupplyOrder.model.Customers;
import com.SupplyOrder.service.CustomersService;
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
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @RequestMapping(value = "/api/customers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Customers>> getAllCustomers() {
        return new ResponseEntity<>(customersService.getAllCustomers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/api/customers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customers> addEmployee(@RequestBody Customers customer) {
        return new ResponseEntity<>(customersService.addCustomer(customer), HttpStatus.OK);
    }
}