package com.SupplyOrder.controller;

import com.SupplyOrder.model.Products;
import com.SupplyOrder.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jason on 1/5/16.
 */
@RestController
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = "/api/products/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Products> getProductById(@PathVariable("id") Long productId) {
        return new ResponseEntity<Products>(productsService.getProductById(productId), HttpStatus.OK);
    }

    @RequestMapping(value = "/api/products", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Products> addProduct(@RequestBody Products product) {
        return new ResponseEntity<>(productsService.addProduct(product), HttpStatus.CREATED);
    }
}
