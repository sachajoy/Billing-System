package com.billingsystem.billing.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//@Entity
public class Order {

    @Id
    private int id;
    private Date orderDate;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
