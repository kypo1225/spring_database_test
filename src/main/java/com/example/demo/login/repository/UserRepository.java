package com.example.demo.login.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.demo.Entity.User;
 
public interface UserRepository extends JpaRepository<User, Integer> {
 
}

		