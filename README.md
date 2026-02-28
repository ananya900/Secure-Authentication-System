# 🔐 Secure Password Manager

A secure password management system built using Java and Spring Boot with a modular, object-oriented architecture. The application ensures safe credential storage using BCrypt password hashing and MySQL database integration.

---

## 📌 Overview

This project provides a secure backend system for managing user credentials with a focus on:

* Secure password storage
* Modular and maintainable architecture
* RESTful API design
* Database optimization
* Strong encryption practices

---

## 🚀 Features

### 🔐 Secure Credential Management

* Store and manage user credentials securely
* BCrypt-based password hashing
* Protection against brute-force and rainbow table attacks
* Secure authentication workflow

### 🏗️ Modular Architecture

* Clean separation of concerns (Controller, Service, Repository)
* Object-Oriented Design principles
* Scalable and maintainable code structure

### 🗄️ Database Integration

* MySQL database for persistent storage
* Optimized queries for efficient data retrieval
* Reliable credential management

### 🔒 Security

* BCrypt password encryption
* Secure REST APIs
* Input validation
* Error handling mechanisms

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* BCrypt
* Maven
* REST APIs

---

## 📂 Project Structure

```
Secure-Password-Manager
├── src/main/java/com/ananya/passwordmanager
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   └── config
├── src/main/resources
│   └── application.properties
├── pom.xml
└── README.md
```

---

## ⚙️ Installation & Setup

### Prerequisites

* Java 17+
* Maven
* MySQL

---

### Database Configuration

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/password_manager
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

### Run the Application

```
mvn clean install
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 🔑 Password Encryption Example

```
BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
String encodedPassword = passwordEncoder.encode(rawPassword);
```

Passwords are never stored in plain text.

---

## 🔮 Future Enhancements

* JWT-based authentication
* Frontend integration
* Two-factor authentication (2FA)
* Password strength checker
* Encryption for stored credentials

---

## 📖 Learning Outcomes

* Implementing secure password hashing with BCrypt
* Designing modular Spring Boot applications
* Database integration with MySQL
* Building secure REST APIs


