![2025-01-23_14-06-50](https://github.com/user-attachments/assets/3eb9452f-78ea-4b85-b1a0-245b1d01c493)
![2025-01-23_14-05-38](https://github.com/user-attachments/assets/dd6eb529-5426-4088-bbf5-3825b8e55408)
-------------------------------------------------
# Registration and Login Project
This is a web application called "Registration and Login System," developed in Java using Spring Boot, Thymeleaf, MySQL, and Spring Security. The application provides basic mechanisms for user registration, authentication, and authorization.

## Features

The application offers the following features:

•   **Home Page:** Displays general information (accessible to everyone).
•   **User Registration:** Users can register by providing their first name, last name, email, and password.
•   **User Authentication:** Registered users can log in using their credentials.
•   **Access Control:**
    •   Access to the `/users` page is restricted to users with the `ADMIN` role.
    •   Access to all other protected pages requires user authentication.
•   **Logout:** Users can log out of the system.

## Technologies

The following technologies were used in the project:

•   **Java 17:** The primary programming language.
•   **Spring Boot:** A framework for rapid web application development.
•   **Spring MVC:** A Spring Framework module for handling web requests.
•   **Thymeleaf:** A template engine for creating HTML pages.
•   **Spring Data JPA:** For interaction with the database.
•   **Hibernate:** An implementation of JPA.
•   **MySQL Database:** The database used for storing application data.
•   **Spring Security:** For user authentication and authorization.
•   **BCryptPasswordEncoder:** For encrypting passwords.
•   **Maven:** A tool for project management and dependency management.
•   **Bootstrap:** A framework for building a responsive web interface.
•   **Validation API:** For data validation.

