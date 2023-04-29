# User_Management_System_With_Validation_Springboot

This is a User Management System built with Java and Spring Boot. The project uses ArrayList as a database for storing user information. The application provides functionality to create, read, update and delete users.

## Frameworks and Language Used

* Java 11 
* Spring Boot
* Spring Web
* Spring Validation

## Data Flow

The data flow in this system is divided into four main layers: Controller, Service, Repository and Database.

### Controller

The Controller layer handles incoming HTTP requests and responses. It receives the request from the client, validates the input, calls the appropriate service methods, and returns the response to the client.

### Service

The Service layer is responsible for implementing the business logic of the application. It receives the data from the Controller layer, processes it, and interacts with the Repository layer to retrieve or store data.

### Repository
The Repository layer manages the data storage and retrieval. In this application, an ArrayList is used to store and manage user data.

### Database Design
This project uses an in-memory data storage approach, using ArrayList in Java to store user data. The User class contains the following attributes:

id: unique identifier for each user.

name: name of the user.

UserName: email address of the user.

date of birth: date of birth of the user.

email: email of the user.

phone number: phone number of user.

date: date to be mentioned.

time: time to be mentioned.

The User class also includes appropriate getters and setters for these attributes.

## Data Structured Used
The ArrayList data structure is used to store and manage user data. Each user is represented by a User class, which contains the user's ID, name, email, address and Phone number.

## Project Summary

This is a simple user management system built using Java and Spring Boot. It allows users to create, retrieve, update, and delete user data. The system uses an ArrayList to store and manage user data instead of a database. The system is divided into three main layers: Controller, Service, and Repository. The User class is used to represent user data and contains the user's ID, name, email, address and Phone number. Springboot Validation is used to validate user input. The code follows a layered structure design pattern.
