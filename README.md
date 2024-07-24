## Run app

To run app, go to project folder, open cmd and run this command:

    mvn spring-boot:run
    
This will launch application on port 8080. Import postman collection or check Api's section and call needed api's.

## Security

Rest api's can be secured using multiple different methods, like keycloak, auth0, external third party servers, etc. In this project I have used self signed jwt without depending on any other third party service.

    Send a POST request to http://localhost:8080/api/v1/token endpoint with credentials via basic auth and you will get back the jwt.
    POST URL: http://localhost:8080/api/v1/token
    Default basic auth credentials are:
    username: admin
    password: password

Use this newly generated jwt as bearer token to access all secure resource endpoints.

## POSTMAN Collection

Postman collection is part of this project, please import postman collection (CoderByte-Project.postman_collection.json) to easily run and test all api's.

## Api's

> All api's are secured and accept bearer token as header for authorization

### Get all the users
HTTP GET: http://localhost:8080/api/v1/users

### Get all the posts
HTTP GET: http://localhost:8080/api/v1/posts

### Get all the comments
HTTP GET: http://localhost:8080/api/v1/comments

### Filter the posts for a user
HTTP GET: http://localhost:8080/api/v1/posts?user_id={pass_user_id}

### Filter the comments of a post
HTTP GET: http://localhost:8080/api/v1/comments?post_id={pass_post_id}



## Author
Imran Shafqat

[Imran's LinkedIn Profile](https://www.linkedin.com/in/imranshafqat1/)

[Imran's Website](https://www.imranshafqat.com/)