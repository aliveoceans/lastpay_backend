package com.lp.demo.service;

import org.springframework.stereotype.Service;

import com.lp.demo.dto.BankResponse;

@Service
public class BankService {
    public BankResponse checkLoanApproval(Integer price, String status, Integer age, Integer owners, String customerName) {
        String approved;
        if ("NEW".equalsIgnoreCase(status)) {
            approved = price < 50000 ? "Approved" : "Denied";
        } else if ("PRE_OWNED".equalsIgnoreCase(status)) {
            approved = (age < 5 && owners <= 1) ? "Approved" : "Denied";
        } else {
            approved = "Denied";
        }
        return new BankResponse(approved);
    }
}
