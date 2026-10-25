# Spring Boot CRUD API

A simple Spring Boot REST API for managing products. The project demonstrates basic CRUD-style operations using Spring Web MVC, an in-memory product list, and an H2 database configured for local development.

## Technologies

- Java 21
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```text
src/
├── main/
│   ├── java/com/example/ecom/
│   │   ├── Controller/
│   │   ├── Model/
│   │   ├── Service/
│   │   └── repository/
│   └── resources/
│       └── application.properties
└── test/
    └── java/com/example/ecom/
```

## Getting Started

### Prerequisites

- Java 21 or later
- Git

### Run the application

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

On macOS or Linux:

```bash
./mvnw spring-boot:run
```

The application starts at:

```text
http://localhost:8080
```

## API Endpoints

### Get all products

```http
GET /products
```

### Get a product by ID

```http
GET /products/{prodId}
```

Example:

```text
GET http://localhost:8080/products/101
```

### Add a product

```http
POST /products
Content-Type: application/json
```

Request body:

```json
{
  "prodId": 104,
  "prodName": "Laptop",
  "prodPrice": 75000
}
```

## H2 Console

The H2 web console is available at:

```text
http://localhost:8080/h2-console/
```

Use these connection details:

```text
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: leave blank
```

The H2 database is an in-memory database, so its data is cleared when the application stops.

## Run Tests

On Windows:

```powershell
.\mvnw.cmd test
```

On macOS or Linux:

```bash
./mvnw test
```

## Notes

- Product data is currently stored in an in-memory list for the REST operations.
- H2 and Spring Data JPA are configured for local database experimentation.
- Build output, IDE metadata, and other generated files are excluded through `.gitignore`.
