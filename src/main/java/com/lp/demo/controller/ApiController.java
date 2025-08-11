package com.lp.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lp.demo.dto.BankResponse;
import com.lp.demo.dto.CarDto;
import com.lp.demo.dto.InsuranceResponse;
import com.lp.demo.entity.RequestEntity;
import com.lp.demo.repository.RequestRepository;
import com.lp.demo.service.BankService;
import com.lp.demo.service.DealerService;
import com.lp.demo.service.InsuranceService;
import com.lp.demo.service.RequestService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ApiController {

	@Autowired
	private DealerService dealerService;
	@Autowired
	private InsuranceService insuranceService;
	@Autowired
	private BankService bankService;
	@Autowired
	private RequestService requestService;

	@GetMapping("/brands")
	public List<String> getBrands() {
		return dealerService.getBrands();
	}

	@GetMapping("/models")
	public List<String> getModels(@RequestParam String brand) {
		return dealerService.getModels(brand);
	}

	@GetMapping("/car")
	public CarDto getCar(@RequestParam String brand, @RequestParam String model) {
		return dealerService.getCarDetails(brand, model);
	}

	@PostMapping("/insurance")
	public InsuranceResponse insurance(@RequestBody Map<String, Object> body) {
		Integer price = (Integer) body.get("price");
		String status = (String) body.get("status");
		Integer age = (Integer) body.get("age");
		Integer owners = (Integer) body.get("owners");
		return insuranceService.calculatePremium(price, status, age, owners);
	}

	@PostMapping("/bank")
	public BankResponse bank(@RequestBody Map<String, Object> body) {
		Integer price = (Integer) body.get("price");
		String status = (String) body.get("status");
		Integer age = (Integer) body.get("age");
		Integer owners = (Integer) body.get("owners");
		String customerName = (String) body.get("customerName");
		return bankService.checkLoanApproval(price, status, age, owners, customerName);
	}

	@PostMapping("/submit")
	public ResponseEntity<String> submit(@RequestBody RequestEntity request) {
		requestService.saveRequest(request);
		return ResponseEntity.ok("Request stored successfully");
	}

	/*
	 * public RequestEntity submit(@RequestBody RequestEntity request) { return
	 * requestService.saveRequest(request); }
	 */

	@GetMapping("/requests")
	public List<RequestEntity> getAllRequests() {
		return requestService.getAllRequests();

	}
}