package com.imranshafqat.coderbyteproject.model;

public class Comment {

	private Long id;
    private Long post_id;
    private String name;
    private String email;
    private String body;
    
	public Comment() {
		super();
	}
	
	public Comment(Long id, Long post_id, String name, String email, String body) {
		super();
		this.id = id;
		this.post_id = post_id;
		this.name = name;
		this.email = email;
		this.body = body;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPost_id() {
		return post_id;
	}

	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

}
