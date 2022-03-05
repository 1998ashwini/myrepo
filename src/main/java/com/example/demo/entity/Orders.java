package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class Orders {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int medicine_id;
	  
	  
	  @Column(name = "medicine_name")
	  private String medicine_name;
	  
	  @Column(name = "quantity")
	  private int quantity;
	  
	  

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMedicine_id() {
		return medicine_id;
	}

	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orders(int medicine_id, String medicine_name, int quantity) {
		super();
		this.medicine_id = medicine_id;
		this.medicine_name = medicine_name;
		this.quantity = quantity;
	}

	
	 

}
