package com.imranshafqat.coderbyteproject.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.imranshafqat.coderbyteproject.exception.ResourceNotFoundException;
import com.imranshafqat.coderbyteproject.exception.UnauthorizedException;
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
		try {
			return restTemplate.getForObject(USER_URL, User[].class);
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				throw new ResourceNotFoundException("Users not found");
			} else if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new UnauthorizedException("Unauthorized access");
			} else {
				throw new RuntimeException("An error occurred while fetching users");
			}
		}
	}

	public Post[] getAllPosts() {
		try {
			return restTemplate.getForObject(POST_URL, Post[].class);
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				throw new ResourceNotFoundException("Users not found");
			} else if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new UnauthorizedException("Unauthorized access");
			} else {
				throw new RuntimeException("An error occurred while fetching users");
			}
		}
	}

	public Comment[] getAllComments() {
		try {
			return restTemplate.getForObject(COMMENT_URL, Comment[].class);
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				throw new ResourceNotFoundException("Users not found");
			} else if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new UnauthorizedException("Unauthorized access");
			} else {
				throw new RuntimeException("An error occurred while fetching users");
			}
		}
	}

	public Post[] getPostsByUserId(Long userId) {
		try {
			String url = USER_URL + "/" + userId + "/posts";
			return restTemplate.getForObject(url, Post[].class);
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				throw new ResourceNotFoundException("Users not found");
			} else if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new UnauthorizedException("Unauthorized access");
			} else {
				throw new RuntimeException("An error occurred while fetching users");
			}
		}
	}

	public Comment[] getCommentsByPostId(Long postId) {
		try {
			String url = POST_URL + "/" + postId + "/comments";
			return restTemplate.getForObject(url, Comment[].class);
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
				throw new ResourceNotFoundException("Users not found");
			} else if (e.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new UnauthorizedException("Unauthorized access");
			} else {
				throw new RuntimeException("An error occurred while fetching users");
			}
		}
	}
}
