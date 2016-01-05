package com.SupplyOrder.controller;

import com.SupplyOrder.model.Employees;
import com.SupplyOrder.service.EmployeesService;
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
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value = "/api/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Employees>> getAllEmployees() {
        return new ResponseEntity<>(employeesService.getAllEmployees(), HttpStatus.OK);
    }
}
