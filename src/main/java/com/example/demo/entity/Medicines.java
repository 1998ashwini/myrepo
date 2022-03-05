package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicine_details")
public class Medicines {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private int medicine_id;
	
	 private String medicine_name;
	 
	 private String company_name;
	 
	 private int available;

	 

	public Medicines() {
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

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Medicines(int medicine_id, String medicine_name, String company_name, int available) {
		super();
		this.medicine_id = medicine_id;
		this.medicine_name = medicine_name;
		this.company_name = company_name;
		this.available = available;
	}
	
	 

}
