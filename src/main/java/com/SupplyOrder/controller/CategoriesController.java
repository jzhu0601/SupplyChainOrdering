package com.SupplyOrder.controller;

import com.SupplyOrder.model.Categories;
import com.SupplyOrder.service.CategoriesService;
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
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @RequestMapping(value = "/api/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Categories>> getAllCategories() {
        return new ResponseEntity<>(categoriesService.getAllCategories(), HttpStatus.OK);
    }

}
