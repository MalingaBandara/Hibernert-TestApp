
# Hibernate Test Application

## Project Overview

The Hibernate Test Application is a Java-based project designed to experiment with and learn the basics of Hibernate ORM. This application focuses on testing fundamental concepts such as setting up Hibernate configurations, mapping entities, and performing CRUD operations. It serves as a sandbox for practicing Hibernate while developing a deeper understanding of its integration with relational databases.

## Key Features

- **Basic CRUD Operations**: Test implementation of Create, Read, Update, and Delete operations.
- **Entity Mapping**: Demonstrates simple entity mappings using JPA annotations.
- **Hibernate Configuration**: Includes setup for Hibernate using `hibernate.cfg.xml`.
- **Learning-Focused**: Primarily built as a learning resource to experiment with different Hibernate features.

## Technologies Used

- **Java 17**
- **Hibernate 5.x**
- **MySQL**
- **Maven**
- **JPA Annotations**

## Project Structure and Code Explanation

1. **Entity Classes**:
   - Represents basic entities mapped using JPA annotations.
   ```java
   @Entity
   @Table(name = "test_entities")
   public class TestEntity {
       // Fields, Getters, Setters, and Mappings
   }
   ```

2. **Hibernate Configuration**:
   - The `hibernate.cfg.xml` file is configured to connect to the database and manage Hibernate settings.
   ```xml
   <hibernate-configuration>
       <session-factory>
           <!-- Database connection settings -->
           <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/test_db</property>
           <!-- Other properties -->
       </session-factory>
   </hibernate-configuration>
   ```

3. **DAO Classes**:
   - Data Access Object classes handle the CRUD operations using Hibernate’s SessionFactory.
   ```java
   public class TestEntityDAO {
       // Methods for CRUD operations
   }
   ```

## Committing Strategy and Learning Insights

This repository uses a learning-focused commit strategy:
- **Initial Setup Commits**: Includes setting up the basic Hibernate configuration and connecting to the database.
- **Testing and Experimentation Commits**: Each commit represents incremental learning through testing different Hibernate features like session management, lazy vs. eager fetching, and more.
- **Refactoring and Improvement Commits**: Commits focus on optimizing code structure, implementing best practices, and fixing bugs encountered during experimentation.
- **Documentation and Comment Commits**: Commits are added to enhance code clarity and understanding with detailed comments and inline documentation.

These commit strategies highlight the learning journey, capturing key takeaways at each step.

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/MalingaBandara/Hibernert-TestApp.git
   ```
2. Set up the MySQL database and update the `hibernate.cfg.xml` with your configurations.
3. Run the application using Maven:
   ```bash
   mvn clean install
   ```

## Purpose and Future Enhancements

This project is primarily for learning purposes, aimed at experimenting with Hibernate’s core functionalities. Future enhancements could include expanding the scope of testing with more complex entity relationships and advanced Hibernate features.
