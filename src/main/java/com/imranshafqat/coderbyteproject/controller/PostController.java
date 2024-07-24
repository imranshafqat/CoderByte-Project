package com.imranshafqat.coderbyteproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imranshafqat.coderbyteproject.model.Post;
import com.imranshafqat.coderbyteproject.service.ApiService;

@RestController
@RequestMapping("/posts")
public class PostController {
    
    @Autowired
    private ApiService apiService;

	@GetMapping
	public Post[] getAllPosts(@RequestParam(required = false) Long user_id) {
		if (user_id != null) {
			return apiService.getPostsByUserId(user_id);
		} else {
			return apiService.getAllPosts();
		}
	}

}
