package com.SupplyOrder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Jason on 1/4/16.
 */
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue
    private Long orderDetailsId;

    @Column(precision = 15, scale = 2)
    @NotNull
    private BigDecimal unitPrice;

    @NotNull
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference(value = "products")
    private Products products;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference(value = "orders")
    private Orders orders;

    @Transient
    private Long orderId;

    @Transient
    private Long productId;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
