package com.nkdebug.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Order {
    @Id
    @GeneratedValue
    int id;
    private String name;
    private double price;
    private int qty;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String name, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
  
 
}
