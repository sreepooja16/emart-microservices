package com.project.Loginservice.service;

import com.project.Loginservice.pojo.BuyerSignupPojo;

public interface BuyerSignupService {

	
	BuyerSignupPojo validateBuyerSignup(BuyerSignupPojo buyerSignupPojo);

	BuyerSignupPojo getBuyer(int BuyerId);
	
}
