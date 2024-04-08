# Spring Custom Query Example


This Spring Boot application demonstrates custom query usage with Spring Data JPA, featuring JPA-generated, JPQL, and native SQL queries.

## Usage

To use this application, follow these steps:

1. Clone the repository to your local machine.
2. Import the project into your preferred IDE.
3. Configure your database connection in `application.yml`.
4. Build and run the application.

## API Endpoints

The application provides the following API endpoints:

### Standard JPA Queries:

1. `GET /api/v1/users/jpa/active` - Retrieves a list of active users using JPA.
2. `GET /api/v1/users/jpa/findByUsernameAndActiveTrue?username={username}` - Retrieves active users by username using JPA.
3. `GET /api/v1/users/jpa/findBySalaryGreaterThan/{salary}` - Retrieves users with salary greater than the specified amount using JPA.
4. `GET /api/v1/users/jpa/findBySalaryBetween/{minSalary}/{maxSalary}` - Retrieves users with salary within the specified range using JPA.
5. `GET /api/v1/users/jpa/countActiveUsers` - Counts the number of active users using JPA.

### JPQL Queries:

1. `GET /api/v1/users/jpql/active` - Retrieves a list of active users using JPQL.
2. `GET /api/v1/users/jpql/findByUsernameAndActiveTrue?username={username}` - Retrieves active users by username using JPQL.
3. `GET /api/v1/users/jpql/findBySalaryGreaterThan/{salary}` - Retrieves users with salary greater than the specified amount using JPQL.
4. `GET /api/v1/users/jpql/findBySalaryBetween/{minSalary}/{maxSalary}` - Retrieves users with salary within the specified range using JPQL.
5. `GET /api/v1/users/jpql/countActiveUsers` - Counts the number of active users using JPQL.

### Native SQL Queries:

1. `GET /api/v1/users/native/active` - Retrieves a list of active users using native SQL.
2. `GET /api/v1/users/native/findByUsernameAndActiveTrue?username={username}` - Retrieves active users by username using native SQL.
3. `GET /api/v1/users/native/findBySalaryGreaterThan/{salary}` - Retrieves users with salary greater than the specified amount using native SQL.
4. `GET /api/v1/users/native/findBySalaryBetween/{minSalary}/{maxSalary}` - Retrieves users with salary within the specified range using native SQL.
5. `GET /api/v1/users/native/countActiveUsers` - Counts the number of active users using native SQL.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgresSQL
- Docker
- Maven