package com.imranshafqat.coderbyteproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imranshafqat.coderbyteproject.model.Comment;
import com.imranshafqat.coderbyteproject.service.ApiService;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    
    @Autowired
    private ApiService apiService;

	@GetMapping
	public Comment[] getAllComments(@RequestParam(required = false) Long post_id) {
		if (post_id != null) {
			return apiService.getCommentsByPostId(post_id);
		} else {
			return apiService.getAllComments();
		}
	}

}
