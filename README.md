<div align="center">

# 🎓 Student Management API

<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&pause=1000&color=36BCF7&center=true&vCenter=true&width=435&lines=Spring+Boot+REST+API;Student+Management+System;CRUD+Operations;MySQL+Database" alt="Typing SVG" />

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)

[![GitHub issues](https://img.shields.io/github/issues/yourusername/student-management-api?color=red&style=flat-square)](https://github.com/yourusername/student-management-api/issues)
[![GitHub forks](https://img.shields.io/github/forks/yourusername/student-management-api?style=flat-square)](https://github.com/yourusername/student-management-api/network)
[![GitHub stars](https://img.shields.io/github/stars/yourusername/student-management-api?style=flat-square)](https://github.com/yourusername/student-management-api/stargazers)

</div>

---

<div align="center">
  <h3>🚀 A RESTful API built with Spring Boot for managing student records</h3>
  <p><em>Supporting CRUD operations with flexible queries by technology and gender</em></p>
</div>

---

## ✨ Features

<details>
<summary>🔥 <strong>Core Features</strong> (Click to expand)</summary>

- ✅ **Complete CRUD Operations** - Create, Read, Update, Delete students
- 🔍 **Advanced Filtering** - Query by technology, gender, or both
- 🛡️ **Input Validation** - Robust validation with detailed error messages
- 🎯 **Exception Handling** - Global exception handler for clean error responses
- 💾 **JPA Integration** - Seamless database operations with Spring Data JPA
- 🔗 **RESTful Design** - Clean API endpoints following REST principles

</details>

---

## 🛠️ Tech Stack

<div align="center">

| Technology | Version | Purpose |
|------------|---------|---------|
| ![Spring Boot](https://img.shields.io/badge/-Spring%20Boot-6DB33F?style=flat&logo=spring&logoColor=white) | 3.x | Backend Framework |
| ![MySQL](https://img.shields.io/badge/-MySQL-4479A1?style=flat&logo=mysql&logoColor=white) | 8.x | Database |
| ![JPA](https://img.shields.io/badge/-JPA%2FHibernate-59666C?style=flat&logo=hibernate&logoColor=white) | 3.x | ORM |
| ![Lombok](https://img.shields.io/badge/-Lombok-BC4521?style=flat&logo=lombok&logoColor=white) | Latest | Code Generation |
| ![Validation](https://img.shields.io/badge/-Jakarta%20Validation-007396?style=flat&logo=java&logoColor=white) | 3.x | Input Validation |

</div>

---

## 🚀 Quick Start

### Prerequisites
## 🚀 Requirements

Before you begin, ensure you have met the following requirements:

| Tool       | Minimum Version | Check Version Command |
|------------|-----------------|-----------------------|
| **Java**   | 17+             | `java -version`       |
| **Maven**  | 3.6+            | `mvn -version`        |
| **MySQL**  | 8.0+            | `mysql --version`     |

---

### 💻 Installation

1. **Install Java 17 or later**

- 1️⃣ ***Clone the repository***
git clone https://github.com/yourusername/student-management-api.git

- cd student-management-api

- 2️⃣ ***Configure MySQL (update application.properties)***
- spring.datasource.url=jdbc:mysql://localhost:3306/spring_db
- spring.datasource.username=your_username
- spring.datasource.password=your_password

- 3️⃣ ***Build and run***
- ./mvnw clean install
- ./mvnw spring-boot:run


<div align="center">
  <img src="https://media.giphy.com/media/3o7TKTDn976rzVgky4/giphy.gif" width="100"/>
  <p><em>🎉 Server will start on http://localhost:8080</em></p>
</div>

---

## 🔥 API Endpoints

<div align="center">

### 📋 Student Operations

</div>

| Method | Endpoint | Description | Status |
|--------|----------|-------------|---------|
| <img src="https://img.shields.io/badge/GET-4CAF50?style=flat&logoColor=white"> | `/student` | 📚 Get all students | ✅ |
| <img src="https://img.shields.io/badge/GET-4CAF50?style=flat&logoColor=white"> | `/student/{rolno}` | 👤 Get student by ID | ✅ |
| <img src="https://img.shields.io/badge/GET-4CAF50?style=flat&logoColor=white"> | `/student/technology/{tech}` | 💻 Filter by technology | ✅ |
| <img src="https://img.shields.io/badge/GET-4CAF50?style=flat&logoColor=white"> | `/student/tg?gender=x&technology=y` | 🎯 Filter by gender & tech | ✅ |
| <img src="https://img.shields.io/badge/POST-2196F3?style=flat&logoColor=white"> | `/student` | ➕ Add new student | ✅ |
| <img src="https://img.shields.io/badge/PUT-FF9800?style=flat&logoColor=white"> | `/student` | ✏️ Update student | ✅ |
| <img src="https://img.shields.io/badge/DELETE-F44336?style=flat&logoColor=white"> | `/student/{rolno}` | 🗑️ Delete student | ✅ |

---

## 📝 Request/Response Examples

<details>
<summary>💡 <strong>POST /student</strong> - Add New Student</summary>

**Request:**
```
{
"name": "Alice Johnson",
"technology": "React",
"gender": "Female"
}
```

**Response:**

```
{
"rolno": 1,
"name": "Alice Johnson",
"technology": "React",
"gender": "Female"
}
```
</details>

<details>
<summary>⚠️ <strong>Validation Error Response</strong></summary>

```
{
"name": [
"name can't be empty",
"name length must within the range of 3 to 64"
],
"technology": [
"technology required"
]
}
  
```


</details>

---

# My Project

This is a brief overview of my project's structure.

```tree
📦 src/main/java/com/example/database/
├── 🎮 controller/
│ └── StudentController.java # REST endpoints
├── 🚨 exception/
│ └── GobalException.java # Global error handling
├── 📊 models/
│ └── StudentModel.java # JPA Entity
├── 🗃️ repository/
│ └── StudentRepo.java # Data access layer
└── ⚙️ services/
    └── StudentServices.java # Business logic

```
---

## 🎨 Code Highlights

<details>
<summary>🔍 <strong>StudentModel with Validation</strong></summary>

```@Entity
@Data
@AllArgsConstructor
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rolno;

    @NotNull(message = "name can't be empty")
    @Size(min=3, max=64, message = "name length must within the range of 3 to 64")
    private String name;

    @NotBlank(message = "technology required")
    private String technology;

    private String gender;
}
```

</details>

<details>
<summary>⚡ <strong>Custom JPA Query</strong></summary>

```
@Query(nativeQuery = true, value = "SELECT * FROM student_model WHERE gender = :gender AND technology = :technology")
List<StudentModel> findByGenderAndTechnology(String gender, String technology);
```


</details>

---

## 🔧 Configuration

<details>
<summary>🗂️ <strong>application.properties</strong></summary>

**Application**
  
```
spring.application.name=student-management-api
```
**Database Configuration**
```
spring.datasource.url=jdbc:mysql://localhost:3306/spring_db
spring.datasource.username=root
spring.datasource.password=your_password
```
**JPA Configuration**
```
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
</details>

---

<div align="center">

### 🌟 Don't forget to star this repo if you found it helpful! 🌟

<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&pause=1000&color=F75C7E&center=true&vCenter=true&width=435&lines=Thanks+for+visiting!;Happy+Coding!+%F0%9F%9A%80;Made+with+%E2%9D%A4%EF%B8%8F+and+Spring+Boot" alt="Typing SVG" />


</div>

