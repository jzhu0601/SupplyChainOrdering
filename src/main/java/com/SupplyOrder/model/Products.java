package com.SupplyOrder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jason on 1/4/16.
 */
@Entity
public class Products {
    @Id
    @GeneratedValue
    private Long productId;
    @NotNull
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference(value = "suppliers")
    private Suppliers suppliers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference(value = "categories")
    private Categories categories;

    @NotNull
    private Integer quantityPerUnit;

    @Column(precision = 15, scale = 2)
    private BigDecimal unitPrice;

    @NotNull
    private Integer unitsInStock;
    @NotNull
    private Integer unitsOnOrder;
    @NotNull
    private Integer reorderLevel;
    @NotNull
    private Boolean discontinued;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private Set<OrderDetails> orderDetails = new HashSet<>();

    @Transient
    private Long supplierId;

    @Transient
    private Long categoryId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Integer getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(Integer quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Integer getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Integer unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Set<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
