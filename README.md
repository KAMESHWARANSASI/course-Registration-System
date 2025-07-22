# 📚 Course Registration System

A full-stack **Course Registration System** built with **Spring Boot**, **Java**, **MySQL**, and **Spring Data JPA** on the backend, and **HTML/CSS/JavaScript** on the frontend. It allows users to register for courses, view available courses, and view enrolled students using a simple and responsive UI.

---

## ✨ Features

- ✅ Register students for courses via a form
- ✅ Display list of available courses
- ✅ View enrolled students
- ✅ RESTful APIs built with Spring Boot
- ✅ Responsive UI with HTML, CSS, and JavaScript
- ✅ Data persisted using MySQL and Spring Data JPA

---

## 🧱 Tech Stack

### 💻 Backend
- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- REST API (JSON)
- Maven

### 🎨 Frontend
- HTML5 / CSS3
- JavaScript (Vanilla)
- Bootstrap (optional)

---

## 🗃️ Database Schema

### `Course`
| Field           | Type    |
|----------------|---------|
| courseId        | Long (PK) |
| courseName      | String  |
| trainer         | String  |
| durationInWeeks | int     |

### `Student`
| Field       | Type       |
|-------------|------------|
| id          | Long (PK)  |
| name        | String     |
| emailId     | String     |
| courseName  | String     |

---

## 📁 Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com.example.registration
│   │       ├── controller/
│   │       ├── entity/
│   │       ├── repository/
│   │       ├── service/
│   │       └── CourseRegistrationApplication.java
│   └── resources/
│       ├── application.properties
│       ├── static/
│       └── templates/
└── test/


---

### 🔧 Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/coursedb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=8080
---
### 🔗 API Endpoints

| Method | Endpoint           | Description                   |
| ------ | ------------------ | ----------------------------- |
| GET    | `/Course`          | Get list of available courses |
| POST   | `/Course/Register` | Register a student            |
| GET    | `/Course/Registry` | Get list of enrolled students |


📦 How to Run
Clone the project

bash
Copy code
git clone https://github.com/your-username/course-registration-system.git

----
Configure MySQL database

Create a database: coursedb

Update credentials in application.properties


----
Run the Spring Boot application

bash
Copy code
./mvnw spring-boot:run

----
Open Frontend

Open index.html in your browser.

OR deploy the frontend using GitHub Pages.

