# FITTRACK - Fitness Tracker

FITTRACK is a comprehensive fitness tracking application built using Spring Boot. It allows users to log their workouts, track calorie intake, and monitor their progress through a user-friendly dashboard. The application features user authentication, JWT-based security, and a modular architecture for easy maintenance and scalability.

## Features

- **User Authentication**: Secure signup and login functionality with JWT authentication.
- **Workout Logs**: Create, read, update, and delete workout logs.
- **Calorie Tracking**: Manage calorie intake and meal logs.
- **Progress Dashboard**: View weekly and monthly statistics to track fitness progress.
- **API Documentation**: Automatically generated API documentation using Swagger.

## Technologies Used

- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- JPA (Java Persistence API)
- H2 Database (for development)
- Swagger for API documentation

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/FITTRACK.git
   ```

2. Navigate to the project directory:
   ```
   cd FITTRACK
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

### API Endpoints

- **Authentication**
  - `POST /api/auth/signup`: Register a new user.
  - `POST /api/auth/login`: Authenticate a user and receive a JWT token.

- **User Management**
  - `GET /api/users`: Get user profile information.
  - `PUT /api/users`: Update user profile information.

- **Workout Management**
  - `GET /api/workouts`: Retrieve all workout logs.
  - `POST /api/workouts`: Create a new workout log.
  - `PUT /api/workouts/{id}`: Update an existing workout log.
  - `DELETE /api/workouts/{id}`: Delete a workout log.

- **Calorie Management**
  - `GET /api/calories`: Retrieve all calorie logs.
  - `POST /api/calories`: Create a new calorie log.
  - `PUT /api/calories/{id}`: Update an existing calorie log.
  - `DELETE /api/calories/{id}`: Delete a calorie log.

- **Dashboard**
  - `GET /api/dashboard`: Get progress statistics.

### API Documentation

Access the Swagger UI at `http://localhost:8080/swagger-ui.html` to explore the API endpoints and their usage.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.