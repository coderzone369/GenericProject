package com.coderszone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coderszone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("Select count(eMailId) from User where eMailId = ?1 ")
	public Integer isEmailUserExists(String email);

	@Query("Select count(mobileNo) from User where mobileNo = ?1 ")
	public Integer isMobileNumberExists(Long mobileNo);
}
