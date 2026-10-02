# Student Management System

A beginner-friendly REST API built using Spring Boot for managing student records.

This project was created to understand the fundamentals of backend development with Spring Boot, including REST APIs, dependency injection, and the Controller-Service-Repository architecture.

## 🚀 Features

- Add a student
- Get all students
- Get a student by ID
- Update student details
- Delete a student
- RESTful API endpoints
- Layered architecture using Controller, Service, and Repository

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Maven
- REST API
- IntelliJ IDEA

## 🏗️ Project Architecture

```text
Client / Postman
       ↓
Controller
       ↓
Service
       ↓
Repository
       ↓
ArrayList<Student>
```

### Layers

**Controller**  
Handles HTTP requests and exposes REST API endpoints.

**Service**  
Contains the application's business logic.

**Repository**  
Handles storing and retrieving student data.

**Model**  
Contains the `Student` class representing student information.

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students/getAllStudents` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students/add` | Add a new student |
| PUT | `/students/update/{id}` | Update a student |
| DELETE | `/students/delete/{id}` | Delete a student |

## 📝 Example Student JSON

```json
{
  "id": 1,
  "name": "Achint",
  "age": 20
}
```

## ▶️ How to Run

### Prerequisites

- Java 17 or higher
- Maven
- IntelliJ IDEA (recommended)

### Steps

1. Clone the repository:

```bash
git clone https://github.com/your-username/student-management-springboot.git
```

2. Open the project in IntelliJ IDEA.

3. Make sure the required Java version is configured.

4. Run the Spring Boot application.

5. The application will start on:

```text
http://localhost:8080
```

You can test the APIs using Postman or any REST API client.

## ⚠️ Current Limitation

Currently, student data is stored in an in-memory `ArrayList`. Therefore, the data will be lost whenever the application is restarted.

## 🔮 Future Improvements

- Add MySQL database
- Use Spring Data JPA and Hibernate
- Add input validation
- Add proper exception handling
- Return appropriate HTTP status codes
- Add Spring Security and JWT authentication
- Add unit and integration testing
- Build a React frontend
- Deploy the application

## 📚 What I Learned

Through this project, I learned:

- Spring Boot project structure
- REST APIs
- HTTP methods
- Dependency Injection
- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- Controller-Service-Repository architecture
- Basic CRUD operations

## 👨‍💻 Author

**Achint Gupta**

This project is part of my journey of learning Java, Spring Boot, and backend development.