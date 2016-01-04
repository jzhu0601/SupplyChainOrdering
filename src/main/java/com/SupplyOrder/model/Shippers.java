package com.SupplyOrder.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jason on 1/4/16.
 */
@Entity
public class Shippers {
    @Id
    @GeneratedValue
    private Long shipperId;
    private String companyName;
    private String phone;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "shippers")
    Set<Orders> orders = new HashSet<>();

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
