package com.imranshafqat.coderbyteproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.imranshafqat.coderbyteproject.model.Comment;
import com.imranshafqat.coderbyteproject.model.Post;
import com.imranshafqat.coderbyteproject.model.User;

@Service
public class ApiService {
	private final RestTemplate restTemplate = new RestTemplate();

	private final String API_BASE_URL = "https://gorest.co.in/public/v2/";

	private final String USER_URL = API_BASE_URL + "users";
	private final String POST_URL = API_BASE_URL + "posts";
	private final String COMMENT_URL = API_BASE_URL + "comments";

	public User[] getAllUsers() {
		return restTemplate.getForObject(USER_URL, User[].class);
	}

	public Post[] getAllPosts() {
		return restTemplate.getForObject(POST_URL, Post[].class);
	}

	public Comment[] getAllComments() {
		return restTemplate.getForObject(COMMENT_URL, Comment[].class);
	}

	public Post[] getPostsByUserId(Long userId) {
		String url = USER_URL + "/" + userId  + "/posts";
		return restTemplate.getForObject(url, Post[].class);
	}

	public Comment[] getCommentsByPostId(Long postId) {
		String url = POST_URL + "/" + postId  + "/comments";
		return restTemplate.getForObject(url, Comment[].class);
	}
}
