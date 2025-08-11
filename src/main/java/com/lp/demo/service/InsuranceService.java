package com.lp.demo.service;

import org.springframework.stereotype.Service;

import com.lp.demo.dto.InsuranceResponse;

@Service
public class InsuranceService {
    public InsuranceResponse calculatePremium(Integer price, String status, Integer age, Integer owners) {
        double base = price * 0.05;
        if ("PRE_OWNED".equalsIgnoreCase(status)) {
            base += price * 0.02 * age;
            base += price * 0.01 * owners;
        }
        return new InsuranceResponse((int) Math.round(base));
    }
}
