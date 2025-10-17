# Hibernate JPA Project: Salle & Machine Management

This project demonstrates the use of **Hibernate** with **JPA** for managing entities in a MySQL database. It covers CRUD operations, entity relationships, and unit testing with JUnit.

---

## Table of Contents

- [Overview](#overview)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Unit Tests](#unit-tests)
- [Features](#features)
- [License](#license)

---

## Overview

This project manages two entities:

- **Salle**: Represents a room.
- **Machine**: Represents a machine located in a `Salle`.

Features include:

- Hibernate configuration with MySQL
- One-to-Many (`Salle` → `Machine`) and Many-to-One (`Machine` → `Salle`) relationships
- CRUD operations implemented via service classes
- Named queries to filter machines by purchase date
- Unit tests using **JUnit**

---

## Technologies

- Java 11+
- Hibernate 5.6
- JPA 2.2
- MySQL 8+
- Maven
- JUnit 4.13

---

## Project Structure

```
src
├── main
│   ├── java
│   │   ├── entities       # JPA entities: Salle, Machine
│   │   ├── dao            # Generic DAO interface
│   │   ├── services       # Service classes for CRUD operations
│   │   └── util           # Hibernate utility class (SessionFactory)
│   └── resources
│       └── hibernate.cfg.xml # Hibernate configuration
└── test
    └── java
        ├── SalleServiceTest
        └── MachineServiceTest
```

---

## Setup

1. Clone the repository:

```bash
git clone https://github.com/your-username/hibernate-project.git
cd hibernate-project
```

2. Update **hibernate.cfg.xml** with your MySQL credentials:

```xml
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database?zeroDateTimeBehavior=convertToNull</property>
```

3. Build the project with Maven:

```bash
mvn clean install
```

---

## Running the Application

The `Test` class demonstrates:

- Creating `Salle` and `Machine` entities
- Persisting them in the database
- Retrieving all rooms and their machines
- Filtering machines by purchase date

Run the `main` method in:

```
src/main/java/test/Test.java
```

---

## Unit Tests

- **SalleServiceTest**: Tests CRUD operations on `Salle`
- **MachineServiceTest**: Tests CRUD operations and date filtering on `Machine`

Run tests with Maven:

```bash
mvn test
```

---

## Features

- **Entity Relationships**: One-to-Many and Many-to-One
- **Transaction Management** via Hibernate services
- **Named Queries** to filter data
- **JUnit Testing** for persistence and CRUD validation
- **Automatic Schema Update** via `hibernate.hbm2ddl.auto=update`

---


