package com.SupplyOrder.service;

import com.SupplyOrder.model.Categories;
import com.SupplyOrder.repository.CategoriesRepository;
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
public class CategoriesService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    public Collection<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }
}
