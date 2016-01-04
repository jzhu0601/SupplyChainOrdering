package com.SupplyOrder.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jason on 1/4/16.
 */
@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long orderId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
    Set<OrderDetails> orderDetails = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Customers customers;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employees employees;

    @ManyToOne(fetch = FetchType.LAZY)
    private Shippers shippers;

    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private BigDecimal freight;
    private String shipName;
    private String shipAdddress;
    private String shipCity;
    private String shipReigon;
    private String shipPostalCode;
    private String shipCountry;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipVia() {
        return shipVia;
    }

    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAdddress() {
        return shipAdddress;
    }

    public void setShipAdddress(String shipAdddress) {
        this.shipAdddress = shipAdddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipReigon() {
        return shipReigon;
    }

    public void setShipReigon(String shipReigon) {
        this.shipReigon = shipReigon;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public Shippers getShippers() {
        return shippers;
    }

    public void setShippers(Shippers shippers) {
        this.shippers = shippers;
    }

    public Set<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
}