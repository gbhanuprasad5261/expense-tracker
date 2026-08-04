# 💰 Expense Tracker REST API

> A production-ready backend application built with **Java 17**, **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL** that enables efficient expense management through RESTful APIs while following clean architecture and enterprise backend development practices.

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.6-brightgreen?logo=spring)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![Git](https://img.shields.io/badge/Git-Version%20Control-F05032?logo=git)

---

# 📖 Overview

Expense Tracker is a backend REST API designed to manage daily expenses through a clean, scalable, and maintainable architecture.

The application demonstrates modern Java backend development practices including RESTful API design, layered architecture, DTO pattern, exception handling, Spring Data JPA, Hibernate ORM, and MySQL database integration.

This project was developed to strengthen backend development skills while following software engineering best practices.

---

# ✨ Key Features

- 🚀 Full CRUD Operations
- 📦 RESTful API Design
- 🏗️ Layered Architecture
- 🔄 DTO Pattern
- ⚡ Spring Data JPA & Hibernate
- 🗄️ MySQL Database Integration
- 🛡️ Global Exception Handling
- 🧩 Clean Service Layer
- 🧪 API Testing using Postman
- 🔧 Maven Project Management
- 🌱 Easy to Extend & Maintain

---

# 🏛️ Architecture

```
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

# 🛠️ Technology Stack

| Category | Technologies |
|----------|--------------|
| Language | Java 17 |
| Framework | Spring Boot 4.0.6 |
| ORM | Hibernate |
| Persistence | Spring Data JPA |
| Database | MySQL |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git & GitHub |

---

# 📂 Project Structure

```
expense-tracker
│
├── controller
├── dto
├── entity
├── exception
├── repository
├── service
├── resources
└── ExpenseTrackerApplication
```

---

# 📌 REST API

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/expenses` | Create Expense |
| GET | `/expenses` | Retrieve All Expenses |
| GET | `/expenses/{id}` | Retrieve Expense by ID |
| PUT | `/expenses/{id}` | Update Expense |
| DELETE | `/expenses/{id}` | Delete Expense |

---

# ⚙️ Getting Started

### Clone Repository

```bash
git clone https://github.com/gbhanuprasad5261/expense-tracker.git
```

### Navigate

```bash
cd expense-tracker
```

### Configure Database

Update:

```
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=your_password
```

### Run

```bash
mvn spring-boot:run
```

Application:

```
http://localhost:8080
```

---

# 📷 Project Demo

### Create Expense

(Add Screenshot)

### Get All Expenses

(Add Screenshot)

### Get Expense By ID

(Add Screenshot)

### Update Expense

(Add Screenshot)

### Delete Expense

(Add Screenshot)

---

# 🎯 Skills Demonstrated

- REST API Development
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- DTO Pattern
- Layered Architecture
- Exception Handling
- CRUD Operations
- MySQL Integration
- Maven
- Git & GitHub

---

# 🚀 Roadmap

The following enhancements are planned:

- ✅ Bean Validation
- ✅ Swagger / OpenAPI
- ✅ Pagination & Sorting
- ✅ Search & Filter APIs
- ✅ Spring Security + JWT Authentication
- ✅ Docker Support
- ✅ GitHub Actions (CI/CD)
- ✅ Unit & Integration Testing
- ✅ Logging (SLF4J & Logback)
- ✅ Cloud Deployment
- ✅ Expense Analytics Dashboard

---

# 👨‍💻 Author

**G Bhanu Prasad**

🔗 GitHub  
https://github.com/gbhanuprasad5261

🔗 LinkedIn  
https://linkedin.com/in/g-bhanu-prasad-66ab1b225

---

## ⭐ Star this repository if you found it useful!

If this project helped you or inspired your learning, consider giving it a **⭐ Star**. Your support motivates me to continue building high-quality Java backend applications and sharing them with the community.
