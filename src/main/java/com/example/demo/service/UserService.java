package com.example.demo.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRegistration;
import com.example.demo.service.UserService;

public interface UserService extends UserDetailsService{
	User save(UserRegistration registration);
}
