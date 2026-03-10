# RBAC Authentication System

A **Role Based Access Control (RBAC) Authentication System** built using **Spring Boot, MySQL, HTML, CSS, and JavaScript**.
This project demonstrates user authentication, role-based dashboards, and admin user management.

---

# Project Features

* User Registration
* User Login
* Role Based Dashboard (Admin / User)
* Admin Panel to Manage Users
* View All Users
* Delete Users
* Search Users
* Pagination Support
* User Profile Page
* Update Profile
* Delete Account
* MySQL Database Integration

---

# Technologies Used

Backend

* Java
* Spring Boot
* Spring Data JPA
* Maven

Frontend

* HTML
* CSS
* JavaScript

Database

* MySQL

Tools

* Postman (API testing)
* Git & GitHub

---

# Project Structure

```
RbacAuthApplication
│
├── src/main/java/com/example/rbacauthapplication
│
│   ├── controller
│   │   ├── AuthController.java
│   │   ├── AdminController.java
│   │   └── UserController.java
│   │
│   ├── entity
│   │   └── User.java
│   │
│   ├── repository
│   │   └── UserRepository.java
│   │
│   ├── service
│   │   └── AuthService.java
│   │
│   └── RbacAuthApplication.java
│
├── src/main/resources
│   ├── static
│   │   └── index.html
│   └── application.properties
│
├── pom.xml
└── README.md
```

---

# Database Setup

Open MySQL and run the following:

```sql
CREATE DATABASE rbacdb;

USE rbacdb;

CREATE TABLE users (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
email VARCHAR(100),
password VARCHAR(100),
role VARCHAR(20)
);
```

---

# Configure Database

Edit `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/rbacdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# How to Run the Project

Step 1: Clone the repository

```
git clone https://github.com/yourusername/rbac-auth-system.git
```

Step 2: Navigate to the project folder

```
cd rbac-auth-system
```

Step 3: Run the project

```
mvn spring-boot:run
```

Step 4: Open browser

```
http://localhost:8080/index.html
```

---

# API Endpoints

Authentication APIs

```
POST /api/auth/register
POST /api/auth/login
```

User APIs

```
GET /api/user/profile/{email}
PUT /api/user/update/{id}
DELETE /api/user/delete/{id}
```

Admin APIs

```
GET /api/admin/users
DELETE /api/admin/users/{id}
GET /api/admin/search/{email}
```

---

# Example Workflow

1. Register a new user
2. Login using email and password
3. Dashboard appears based on role

Admin:

* Manage users
* Delete users
* Search users

User:

* View profile
* Update profile
* Delete account

---

---

# Future Improvements

* JWT Authentication
* Password Encryption (BCrypt)
* Spring Security Integration
* Responsive UI
* Docker Deployment

---

# Author

Ashwini Jadhav
GitHub: https://github.com/AshwiniJadhav202
