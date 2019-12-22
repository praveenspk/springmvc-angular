
# Spring Mvc, Hibernate, MySQL,AngularJs and REST API

A simple Spring boot application that demonstrates the usage of RESTful API using Springmvc, Hibernate and MySQL. 

## Tools and Technologies used

* Java 1.8
* Spring mvc
* MySQL
* JPA
* Hibernate
* Maven
* Eclipse Oxygen

## Steps to install

**1. Clone the application**

```bash
https://github.com/praveenspk/springmvc-angular.git
```

**2. Create MySQL database**

```sql
CREATE DATABASE demo
```
	
**4. Change MySQL Username and Password as per your MySQL Installation**
	
+ open `src/main/resources/application.properties` file.

+ change `spring.datasource.username` and `spring.datasource.password` as per your installation
	
**5. Run the app**

You can run the spring boot app by typing the following command -

```bash
mvn spring-boot:run
```


The server will start on port 2020.
	
## Explore Rest APIs

The app defines following CRUD APIs.

    GET /book/list
    
    POST /book/save
    
    GET /book/books/{id}
    
    PUT /book/books/{id}
    
    DELETE /book/books/{id}

You can test them using postman or any other rest client.



## Learn more
https://praveenspk.github.io/





