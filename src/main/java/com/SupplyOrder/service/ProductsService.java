package com.SupplyOrder.service;

import com.SupplyOrder.model.Products;
import com.SupplyOrder.repository.CategoriesRepository;
import com.SupplyOrder.repository.ProductsRepository;
import com.SupplyOrder.repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jason on 1/5/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;
    @Autowired
    private CategoriesRepository categoriesRepository;
    @Autowired
    private SuppliersRepository suppliersRepository;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Products addProduct(Products product) {
        if (product.getProductId() != null) {
            // cannot create restaurant with specified id value
            return null;
        }
        product.setCategories(categoriesRepository.findOne(product.getCategoryId()));
        product.setSuppliers(suppliersRepository.findOne(product.getSupplierId()));
        return productsRepository.save(product);
    }

    public Products getProductById(Long productId) {
        return productsRepository.findOne(productId);
    }


}
