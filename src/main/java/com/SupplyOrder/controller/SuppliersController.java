package com.SupplyOrder.controller;

import com.SupplyOrder.model.Suppliers;
import com.SupplyOrder.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Jason on 1/5/16.
 */
@RestController
public class SuppliersController {
    @Autowired
    private SuppliersService suppliersService;

    @RequestMapping(value = "/api/suppliers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Suppliers>> getAllSuppliers() {
        return new ResponseEntity<>(suppliersService.findAll(), HttpStatus.OK);
    }
}
