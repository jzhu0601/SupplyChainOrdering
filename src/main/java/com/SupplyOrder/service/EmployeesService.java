package com.SupplyOrder.service;

import com.SupplyOrder.model.Employees;
import com.SupplyOrder.repository.EmployeesRepository;
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
public class EmployeesService {
    @Autowired
    private EmployeesRepository employeesRepository;

    public Collection<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }
}
