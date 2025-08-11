package com.lp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.demo.entity.RequestEntity;
import com.lp.demo.repository.RequestRepository;

@Service
public class RequestService {
    @Autowired
    private RequestRepository requestRepository;

    public void saveRequest(RequestEntity request) {
        requestRepository.save(request);
    }
    
	/*
	 * public RequestEntity saveRequest(RequestEntity request) { Car car =
	 * carRepository.findByBrandIgnoreCaseAndModelIgnoreCase(request.getCarBrand(),
	 * request.getCarModel()); if (car == null) { throw new
	 * RuntimeException("Car not found"); }
	 * 
	 * RequestEntity responce = new RequestEntity();
	 * request.setCustomerName(request.getCustomerName());
	 * request.setCarBrand(car.getBrand()); request.setCarModel(car.getModel());
	 * request.setCarPrice(car.getPrice()); request.setCarSpecs(car.getSpecs());
	 * request.setCarStatus(car.getStatus()); request.setCarAge(car.getAge());
	 * request.setCarOwners(car.getOwners());
	 * request.setInsurancePremium(insuranceService.calculatePremium(car.getPrice(),
	 * car.getStatus(), car.getAge(), car.getOwners()).getPremium());
	 * request.setLoanApproved(bankService.checkLoanApproval(car.getPrice(),
	 * car.getStatus(), car.getAge(), car.getOwners(), request.getCustomerName()));
	 * 
	 * return requestRepository.save(request); }
	 */
    
    public List<RequestEntity> getAllRequests() {
        return requestRepository.findAll();
    }
}
