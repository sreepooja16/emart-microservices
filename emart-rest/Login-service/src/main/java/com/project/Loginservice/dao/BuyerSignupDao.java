package com.project.Loginservice.dao;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Loginservice.entity.BuyerSignupEntity;



@Repository
public interface BuyerSignupDao extends JpaRepository<BuyerSignupEntity , Integer> {
	BuyerSignupEntity findByUsernameAndPassword(String username,String password);
	
	
	

}
