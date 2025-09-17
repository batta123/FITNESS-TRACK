# 🏋️‍♂️ FITTRACK Backend

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
