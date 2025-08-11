package com.lp.demo.dto;

public class InsuranceResponse {

	private Integer premium;

    public InsuranceResponse(Integer premium) {
        this.premium = premium;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

}
