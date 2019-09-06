package com.example.demo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.Entity.User;
import com.example.demo.login.repository.UserRepository;
 
@Service
public class UserService {
 
    @Autowired
    UserRepository repository;
 
    public User search(Integer id) {
        User user = repository.findOne(id);//JpaRepository継承してるのにエラーが出る
        return user;
    }
 
}
