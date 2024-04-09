package com.brewedbrilliance.cafe.application.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CoffeeDetails")
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    String coffeeName;
    String description;
    String price;

    String size;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
