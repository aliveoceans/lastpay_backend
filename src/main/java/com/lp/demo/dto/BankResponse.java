package com.lp.demo.dto;

public class BankResponse {

	private String approved;

    public BankResponse(String approved) {
        this.approved = approved;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

}
