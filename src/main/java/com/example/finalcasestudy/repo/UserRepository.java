package com.example.finalcasestudy.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.finalcasestudy.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByUserNameIgnoreCase(String userName);
	
	List<User> findByPasswordIgnoreCase(String password);
	
	List<User> findById(int id);
	
	List<User> deleteById(int id);
	


}
