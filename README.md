# 💰 Expense Tracker REST API

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.6-brightgreen?logo=spring)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?logo=hibernate)
![Maven](https://img.shields.io/badge/Build-Maven-red?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-blue)

A backend **Expense Tracker REST API** built with **Java 17**, **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. The application follows a clean layered architecture and provides RESTful APIs for managing daily expenses with full CRUD functionality.

---

## 🚀 Features

- ✅ Create, Read, Update and Delete Expenses
- ✅ RESTful API Design
- ✅ Layered Architecture (Controller → Service → Repository)
- ✅ DTO Pattern
- ✅ Global Exception Handling
- ✅ Spring Data JPA
- ✅ Hibernate ORM
- ✅ MySQL Database Integration
- ✅ Maven Build Tool
- ✅ Postman API Testing
- ✅ Git & GitHub Version Control

---

## 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Spring Boot | 4.0.6 |
| Spring Data JPA | Latest |
| Hibernate | ORM |
| MySQL | 8.x |
| Maven | Latest |
| Postman | API Testing |
| Git | Version Control |

---

## 📂 Project Structure

```text
src
└── main
    ├── java
    │   └── com.example.expense_tracker
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── exception
    │       ├── repository
    │       ├── service
    │       └── ExpenseTrackerApplication.java
    └── resources
        └── application.properties
```

---

## 🏗️ Architecture

```text
Client
   │
   ▼
ExpenseController
   │
   ▼
ExpenseService
   │
   ▼
ExpenseRepository
   │
   ▼
MySQL Database
```

---

## 📌 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/expenses` | Create Expense |
| GET | `/expenses` | Get All Expenses |
| GET | `/expenses/{id}` | Get Expense by ID |
| PUT | `/expenses/{id}` | Update Expense |
| DELETE | `/expenses/{id}` | Delete Expense |

---

## ⚙️ Getting Started

### Prerequisites

- Java 17
- Maven
- MySQL Server

### Clone Repository

```bash
git clone https://github.com/gbhanuprasad5261/expense-tracker.git
cd expense-tracker
```

### Configure Database

Update `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

### Run the Application

```bash
mvn spring-boot:run
```

Application starts at:

```
http://localhost:8080
```

---

## 📬 Sample API Request

### POST `/expenses`

Request

```json
{
  "title": "Lunch",
  "amount": 250,
  "category": "Food"
}
```

Response

```json
{
  "id": 1,
  "title": "Lunch",
  "amount": 250.0,
  "category": "Food"
}
```

---

## 📸 API Screenshots

### Create Expense (POST)

![POST](Images/postman-post-expense.png)

---

### Get All Expenses (GET)

![GET ALL](Images/get-all-expenses.png)

---

### Get Expense By ID

![GET BY ID](Images/get-expense.png)

---

### Update Expense (PUT)

![PUT](Images/put-expense.png)

---

### Delete Expense (DELETE)

![DELETE](Images/delete-expense.png)

---

### Controller Implementation

![Controller](Images/controller-code.png)

---

## 🎯 Learning Outcomes

This project helped me gain hands-on experience in:

- Spring Boot REST API Development
- CRUD Operations
- Spring Data JPA & Hibernate
- DTO Pattern
- Layered Architecture
- Global Exception Handling
- MySQL Integration
- API Testing using Postman
- Git & GitHub Workflow
- Maven Project Management

---

# 🚀 Future Enhancements

The following features are planned for future releases:

- 🔹 Bean Validation (`@Valid`, `@NotBlank`, `@Positive`)
- 🔹 Swagger / OpenAPI Documentation
- 🔹 Pagination & Sorting
- 🔹 Search & Filter APIs
- 🔹 Spring Security with JWT Authentication
- 🔹 Docker Containerization
- 🔹 GitHub Actions (CI/CD)
- 🔹 Unit Testing with JUnit & Mockito
- 🔹 Logging using SLF4J & Logback
- 🔹 Cloud Deployment (Render / AWS)
- 🔹 Expense Analytics Dashboard

---

## 🤝 Contributing

Contributions, suggestions, and improvements are welcome.

Feel free to fork this repository and submit a pull request.

---

## 👨‍💻 Author

**G Bhanu Prasad**

- 💼 LinkedIn: https://linkedin.com/in/g-bhanu-prasad-66ab1b225
- 💻 GitHub: https://github.com/gbhanuprasad5261
- 📧 Email: gbhanuprasad1236@gmail.com

---

## ⭐ Support

If you found this project useful, please consider giving it a ⭐ on GitHub.

It motivates me to continue building and improving open-source Java projects.
