package com.example.finalcasestudy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalcasestudy.model.User;


@Repository
public interface UserRepository extends JpaRepository<User , String> {

}
