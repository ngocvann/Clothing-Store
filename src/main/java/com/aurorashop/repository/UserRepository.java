package com.aurorashop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aurorashop.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{
	
	public UserDtls findByEmail(String email);
}
