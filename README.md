PAF Week 5 Submission - Spring Boot REST API
============================================

A simple Spring Boot REST API demonstrating basic endpoint creation, path variables, request parameters, and logging functionality.

📋 Overview
-----------

This project is a submission for Week 5 of the PAF (Programming Application Framework) course. It implements a basic RESTful web service using Spring Boot that showcases fundamental concepts like request handling, parameter binding, and logging.

🚀 Features
-----------

-   Root Endpoint: Basic health check endpoint
-   Greeting Endpoints: Multiple endpoints demonstrating different parameter handling
    -   Simple greeting without parameters
    -   Personalized greeting with path variables
    -   Custom messages using query parameters
-   Logging: Comprehensive logging for all endpoint access

🛠️ Technology Stack
--------------------

-   Java 17+
-   Spring Boot 3.x
-   Maven
-   SLF4J for logging

📁 Project Structure
--------------------

text

src/main/java/org/example/paf_w5_submission/
├── PafW5SubmissionApplication.java    # Main application class
└── GreetingController.java            # REST Controller with endpoints

🔌 API Endpoints
----------------

### 1\. Root Endpoint

-   URL: `/`
-   Method: `GET`
-   Response: `"Your Spring Boot Application is Alive.!"`
-   Logs: Records access to root endpoint

### 2\. Basic Greeting

-   URL: `/greet`
-   Method: `GET`
-   Response: `"Welcome to Spring Boot!"`
-   Logs: Records access to greet endpoint

### 3\. Personalized Greeting

-   URL: `/greet/{name}`
-   Method: `GET`
-   Path Variable: `name` - Person's name
-   Query Parameter: `message` (optional) - Custom message
-   Response Examples:
    -   Without custom message: `"Hello John! Welcome to Spring Boot!"`
    -   With custom message: `"Hello John! Have a great day!"`
-   Logs: Records name and any custom message provided

🚦 Getting Started
------------------

### Prerequisites

-   Java Development Kit (JDK) 17 or later

-   Maven 3.6+

-   Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1.  Clone the repository
```
    git clone https://github.com/dyneth02/paf-w5-submission.git
```

```
    cd paf-w5-submission
```
2.  Build the project

    bash

    mvn clean install

3.  Run the application

    bash

    mvn spring-boot:run

    Or run the main class `PafW5SubmissionApplication` from your IDE.

4.  Access the application

    -   Application will start on `http://localhost:8080`

📝 Usage Examples
-----------------

Test the endpoints using your browser or tools like curl/Postman:

```

# Root endpoint
curl http://localhost:8080/

# Basic greeting
curl http://localhost:8080/greet

# Personalized greeting without message
curl http://localhost:8080/greet/John

# Personalized greeting with custom message
curl http://localhost:8080/greet/John?message=Have%20a%20nice%20day!

```

📊 Logging Output
-----------------

The application logs all requests with timestamps:

text

INFO GreetingController: Root endpoint accessed
INFO GreetingController: Greet endpoint accessed
INFO GreetingController: Greeting request received for name: John
INFO GreetingController: Custom message provided: Have a nice day!

🧪 Testing
----------

You can test the endpoints manually using:

-   Web browser for GET requests

-   Postman/Insomnia for API testing

-   curl commands in terminal

🤝 Contributing
---------------

This is a course submission project. Feel free to fork and experiment with the code.

📄 License
----------

This project is for educational purposes as part of the PAF course.

✨ Acknowledgments
-----------------

-   PAF Course Instructors

-   Spring Boot Documentation

-   Open source community

* * * * *

Author: Dineth Hirusha\
Course: PAF (Programming Application Framework)\
Week: 5\
Submission: REST API Implementation
