package com.lp.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private Integer price;
    private String specs;
    private String status; // NEW, PRE_OWNED
    private Integer age;
    private Integer owners;

    public Car() {}	
    
    public Car(String brand, String model, Integer price, String specs, String status, Integer age, Integer owners) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.specs = specs;
		this.status = status;
		this.age = age;
		this.owners = owners;
	}
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }
    public String getSpecs() { return specs; }
    public void setSpecs(String specs) { this.specs = specs; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public Integer getOwners() { return owners; }
    public void setOwners(Integer owners) { this.owners = owners; }
}