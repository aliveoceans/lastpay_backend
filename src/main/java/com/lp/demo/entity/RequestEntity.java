package com.lp.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RequestEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    private String carBrand;
    private String carModel;
    private Integer carPrice;
    private String carSpecs;
    private String carStatus;
    private Integer carAge;
    private Integer carOwners;
    private Integer insurancePremium;
    private String loanApproved;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getCarBrand() { return carBrand; }
    public void setCarBrand(String carBrand) { this.carBrand = carBrand; }
    public String getCarModel() { return carModel; }
    public void setCarModel(String carModel) { this.carModel = carModel; }
    public Integer getCarPrice() { return carPrice; }
    public void setCarPrice(Integer carPrice) { this.carPrice = carPrice; }
    public String getCarSpecs() { return carSpecs; }
    public void setCarSpecs(String carSpecs) { this.carSpecs = carSpecs; }
    public String getCarStatus() { return carStatus; }
    public void setCarStatus(String carStatus) { this.carStatus = carStatus; }
    public Integer getCarAge() { return carAge; }
    public void setCarAge(Integer carAge) { this.carAge = carAge; }
    public Integer getCarOwners() { return carOwners; }
    public void setCarOwners(Integer carOwners) { this.carOwners = carOwners; }
    public Integer getInsurancePremium() { return insurancePremium; }
    public void setInsurancePremium(Integer insurancePremium) { this.insurancePremium = insurancePremium; }
    public String getLoanApproved() { return loanApproved; }
    public void setLoanApproved(String loanApproved) { this.loanApproved = loanApproved; }
	@Override
	public String toString() {
		return "RequestEntity [id=" + id + ", customerName=" + customerName + ", carBrand=" + carBrand + ", carModel="
				+ carModel + ", carPrice=" + carPrice + ", carSpecs=" + carSpecs + ", carStatus=" + carStatus
				+ ", carAge=" + carAge + ", carOwners=" + carOwners + ", insurancePremium=" + insurancePremium
				+ ", loanApproved=" + loanApproved + "]";
	}
    
}