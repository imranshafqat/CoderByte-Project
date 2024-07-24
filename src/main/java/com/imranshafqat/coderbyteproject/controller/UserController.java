package com.imranshafqat.coderbyteproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imranshafqat.coderbyteproject.model.User;
import com.imranshafqat.coderbyteproject.service.ApiService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private ApiService apiService;
	
	@GetMapping
	public User[] getAllUsers() {
        return apiService.getAllUsers();
	}
	
}
