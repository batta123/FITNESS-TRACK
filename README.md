# 🏋️‍♂️ FITTRACK Backend Spring Boot Project

A modular Java backend for tracking fitness activities, calories, and user progress. Built with Spring Boot, JWT authentication, and RESTful APIs.

---

## 📁 Project Structure

    src/ 
    └── main/ 
    ├── java/com/fittrack/ 
    │ ├── FitTrackApplication.java 
    │ ├── controller/ # REST endpoints 
    │ ├── dto/ # Request/response payloads 
    │ ├── exception/ # Global error handling 
    │ ├── model/ # Entity classes 
    │ ├── repository/ # JPA repositories 
    │ ├── security/ # JWT & auth filters 
    │ ├── service/ # Business logic 
    │ └── util/ # Utility classes 
    └── resources/ 
    ├── application.properties 
    └── data.sql

    test/ 
    └── java/com/fittrack/ 
    ├── controller/ 
    ├── service/ 
    └── FitTrackApplicationTests.java


---
## 📘 ER Diagram

The following Entity-Relationship Diagram illustrates the core data model for the fitness tracking application. It includes three main tables: `User`, `Workout`, and `Calorie`, with relationships defined via foreign keys.

![Entity Relationship Diagram](https://github.com/batta123/FITNESS-TRACK/blob/main/%7B04430792-8E73-4199-A970-6CE840763346%7D%20(1).png)



## 🚀 Features

- 🔐 JWT-based authentication
- 🧍 User registration & profile management
- 🏃 Workout logging & retrieval
- 🔥 Calorie tracking
- 📈 Progress monitoring
- 📊 Dashboard-ready endpoints

---

## 🛠️ Tech Stack

| Layer        | Technology            |
|--------------|------------------------|
| Language     | Java 17                |
| Framework    | Spring Boot            |
| Database     | PostgreSQL / MySQL     |
| Security     | Spring Security + JWT  |
| ORM          | Hibernate / JPA        |
| Build Tool   | Maven                  |
| Docs         | Swagger / OpenAPI      |

---

## ⚙️ Setup Instructions

1. **Clone the repo**
   ```bash
   git clone https://github.com/batta123/FITNESS-TRACK.git
   cd FITNESS-TRACK

## Run the app

'''bash
mvn spring-boot:run

## Access Swagger

Visit http://localhost:8080/swagger-ui/

Authentication
Login returns JWT token.

Include token in headers:

Code
Authorization: Bearer <your-token>

## 📬 Sample Endpoints

    Method	Endpoint	Description
    POST	/api/auth/login	Authenticate user
    POST	/api/auth/register	Register new user
    GET	/api/users/profile	Fetch user profile
    POST	/api/workouts	Log workout
    GET	/api/workouts	Get workout history
    POST	/api/calories	Log calorie intake
    GET	/api/progress	View progress summary
    
## 📌 Future Enhancements

    🧬 AI-based workout recommendations
    
    📱 Mobile app integration
    
    🧭 GPS-based activity tracking
    
    🧑‍🤝‍🧑 Social features (leaderboards, challenges)

## 👨‍💻 Author
    
    Dileep Batta

