package com.lp.demo.dto;

import com.lp.demo.entity.Car;

public class CarDto {
    private String brand;
    private String model;
    private Integer price;
    private String specs;
    private String status;
    private Integer age;
    private Integer owners;

    // Constructor from Car entity, getters (omitted for brevity)
    public CarDto(Car car) {
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.price = car.getPrice();
        this.specs = car.getSpecs();
        this.status = car.getStatus();
        this.age = car.getAge();
        this.owners = car.getOwners();
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getOwners() {
		return owners;
	}

	public void setOwners(Integer owners) {
		this.owners = owners;
	}
    
    
}