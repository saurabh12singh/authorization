package com.cognizant.authorizationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.authorizationService.model.UserData;

/*
 * This interface uses methods from JPA repository 
 */
@Repository
public interface UserRepository extends JpaRepository<UserData, String> {

}
