[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Ev761u1o)
# OOP-JAVA(DCIT 201 - Graded Assignment)
# Advanced Vehicle Rental Management System

## Assignment Objective
Design a comprehensive Vehicle Rental Management System that demonstrates **ALL** Object-Oriented Programming (OOP) Principles:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Composition

## Problem Domain: Vehicle Rental Management System

### Core Requirements

#### 1. Abstraction Principle
Create an abstract base class `Vehicle` with the following abstract methods:
- `calculateRentalCost(int days)`
- `isAvailableForRental()`

#### 2. Inheritance Hierarchy
Implement concrete vehicle classes that inherit from `Vehicle`:
- `Car` (extends Vehicle)
- `Motorcycle` (extends Vehicle)
- `Truck` (extends Vehicle)

Each vehicle type must have unique rental characteristics:
- Different base rental rates
- Specific rental rules
- Unique additional features

#### 3. Encapsulation
Each vehicle class must:
- Use private fields for critical information
- Provide public getter and setter methods
- Implement input validation in setters
- Protect sensitive data from direct modification

#### 4. Polymorphism Implementation
Create interfaces and method overriding:
- `Rentable` interface with methods:
  - `rent(Customer customer, int days)`
  - `returnVehicle()`
- Override methods in each vehicle class
- Demonstrate method overloading and overriding

#### 5. Composition
Design supporting classes:
- `Customer`
- `RentalAgency`
- `RentalTransaction`

### Detailed Class Requirements

#### Vehicle (Abstract Class)
```java
public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructors with validation
    // Getters and setters
    // Abstract methods for rental calculation
}
```

#### Vehicle Specific Classes
Each vehicle class must implement unique:
- Rental cost calculations
- Availability checks
- Special features

#### Customer Class
- Manage customer rental history
- Track current rentals
- Implement rental eligibility checks

#### RentalAgency Class
- Manage vehicle fleet
- Process rentals
- Generate reports
- Implement complex business logic

### Bonus Challenges
1. Implement a loyalty program using interfaces
2. Create custom exceptions for rental scenarios
3. Add a rating system for vehicles and customers

### Additional OOP Principles to Demonstrate
- Use of `final` keyword for immutability
- Static factory methods
- Composition over inheritance
- Interface-based design

### Specific Implementation Guidelines

#### Encapsulation Requirements
- All fields must be private
- Use constructor/setter validation
- Provide controlled access through methods

#### Inheritance Requirements
- Create a meaningful inheritance hierarchy
- Use `super()` for parent class initialization
- Override `toString()`, `equals()`, and `hashCode()`

#### Polymorphism Requirements
- Implement method overriding
- Use interfaces for flexible design
- Create methods that accept base class/interface types

#### Abstraction Requirements
- Use abstract classes and interfaces
- Hide complex implementation details
- Provide clean, intuitive public interfaces

### Testing Requirements
1. Unit test each class independently
2. Test all possible scenarios
3. Validate encapsulation
4. Check inheritance and polymorphic behavior
5. Verify abstraction implementations

### Evaluation Criteria
- Correct implementation of OOP principles
- Code quality and readability
- Comprehensive test coverage
- Innovative solution design
- Error handling and validation

### Submission Guidelines
1. Create a well-structured Maven/Gradle project
2. Use meaningful package structure
3. Include comprehensive unit tests
4. Write clean, documented code
5. Follow Java naming conventions

## Recommended Tools
- JDK 11+
- Maven/Gradle
- JUnit 5
- Mockito (optional)

## Grading Rubric
- OOP Principles Implementation: 20%
- Code Quality: 5%
- Testing Coverage: 5%
- Design Creativity: 5%
- Documentation: 5%

Good luck, and happy coding-Joe!
