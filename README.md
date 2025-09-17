# FIT-TRACK
A full-featured fitness tracker backend built with Spring Boot, JWT authentication, and Spring Data JPA. This project provides REST APIs for user authentication, workout tracking, calorie logging, and progress dashboards.
FITTRACK – Fitness Tracker Backend

A full-featured fitness tracker backend built with Spring Boot, JWT authentication, and Spring Data JPA.
This project provides REST APIs for user authentication, workout tracking, calorie logging, and progress dashboards.

✨ Features
User Authentication

JWT-based signup/login

Password hashing with BCrypt

Role-based access: USER, ADMIN

User Profile

Store and update profile info: name, age, weight, height, fitness goals

Workout Logs

CRUD operations for workouts

Fields: id, user_id, type (cardio/strength), duration, calories burned, date, notes

Calorie Tracker

Log meals and calories intake

CRUD operations

Progress Dashboard

Weekly/monthly calories burned

Workouts count

Goal progress

Returns JSON in charts-ready format

Extras

Validation with @Valid

Global exception handling with @ControllerAdvice

Pagination & filtering for workouts and meals

Soft delete support

Swagger API documentation

Proper logging with SLF4J

Unit tests with JUnit + Mockito

🛠 Tech Stack

Backend: Spring Boot, Spring Data JPA

Database: PostgreSQL / MySQL

Security: JWT, Spring Security, BCrypt

API Docs: Swagger / OpenAPI

Testing: JUnit + Mockito

Build Tool: Maven

📁 Project Structure
    src/
        └── main/
            ├── java/
                    │   └── com/
                    │       └── fittrack/
                    │           ├── FitTrackApplication.java
                    │           ├── controller/
                    │           │   ├── AuthController.java
                    │           │   ├── UserController.java
                    │           │   ├── WorkoutController.java
                    │           │   ├── CalorieController.java
                    │           │   └── ProgressController.java
                    │           ├── dto/
                    │           │   ├── AuthRequest.java
                    │           │   ├── AuthResponse.java
                    │           │   ├── UserProfileDto.java
                    │           │   ├── WorkoutDto.java
                    │           │   └── CalorieDto.java
                    │           ├── exception/
                    │           │   ├── GlobalExceptionHandler.java
                    │           │   └── CustomException.java
                    │           ├── model/
                    │           │   ├── User.java
                    │           │   ├── Workout.java
                    │           │   └── Calorie.java
                    │           ├── repository/
                    │           │   ├── UserRepository.java
                    │           │   ├── WorkoutRepository.java
                    │           │   └── CalorieRepository.java
                    │           ├── security/
                    │           │   ├── JwtAuthenticationFilter.java
                    │           │   ├── JwtTokenProvider.java
                    │           │   ├── SecurityConfig.java
                    │           │   └── CustomUserDetailsService.java
                    │           ├── service/
                    │           │   ├── AuthService.java
                    │           │   ├── UserService.java
                    │           │   ├── WorkoutService.java
                    │           │   └── CalorieService.java
                    │           └── util/
                    │               └── DateUtil.java
                    └── resources/
                        ├── application.properties
                        └── data.sql
                        test/
                        └── java/
                            └── com/
                                └── fittrack/
                                    ├── controller/
                                    ├── service/
                                    └── FitTrackApplicationTests.java
                        
                        pom.xml
                        README.md
   

🖼 ER Diagram

The ER diagram illustrates the database structure and relationships:

Image is stored in the Docs folder in the repo.

📌 REST API Endpoints
Method	Endpoint	Description
POST	/api/auth/signup	Register new user
POST	/api/auth/login	Login and get JWT
GET	/api/users/profile	Get user profile
PUT	/api/users/profile	Update profile
POST	/api/workouts	Add a workout
GET	/api/workouts	List workouts (pagination & filters)
PUT	/api/workouts/{id}	Update a workout
DELETE	/api/workouts/{id}	Soft delete a workout
POST	/api/calories	Add meal/calorie
GET	/api/calories	List meals/calories
PUT	/api/calories/{id}	Update meal/calorie
DELETE	/api/calories/{id}	Soft delete meal/calorie
GET	/api/progress	Weekly/monthly progress
⚡ Setup Instructions

Clone the repo

git clone https://github.com/batta123/FITNESS-TRACK.git
cd fittrack


Configure Database
Edit application.properties for your PostgreSQL/MySQL settings:

spring.datasource.url=jdbc:postgresql://localhost:5432/fittrack
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update


Run the Application

mvn spring-boot:run


Swagger API Docs
Access at: http://localhost:8080/swagger-ui.html

🧪 Testing

Run unit tests:

mvn test

🚀 Future Enhancements

Mobile app integration

Social features (friends, challenges)

Advanced analytics & charts

AI-powered workout suggestions
