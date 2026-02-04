
```
## Base URL: https://ecommerce-item-api.onrender.com

# Ecommerce Items REST API

A simple Java Spring Boot backend application that provides RESTful APIs
to manage ecommerce items (similar to a basic Flipkart-style catalog).

---

## Project Overview

This application exposes REST endpoints to:
- Add a new ecommerce item
- Fetch an item by ID
- Fetch all items

Data is stored in memory using an ArrayList as per the task requirement.

---

## Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Web
- Bean Validation
- Maven
- In-memory storage (ArrayList)

```
```
## Project Structure
item-api/
├── README.md
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── itemapi/
│                       ├── ItemApiApplication.java
│                       ├── controller/
│                       │   └── ItemController.java
│                       ├── model/
│                       │   └── Item.java
│                       ├── service/
│                       │   └── ItemService.java
│                       └── exception/
│                           └── GlobalExceptionHandler.java

````

---

## How to Run Locally

### Prerequisites
- Java 17 installed
- Maven installed

### Run Command

```
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## API Endpoints

### 1. Add Item

**Endpoint**

```
POST /api/items
```

**Request Body**

```json
{
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 79999
}
```

**Response**

```json
{
  "id": 1,
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 79999
}
```

---

### 2. Get Item by ID

**Endpoint**

```
GET /api/items/{id}
```

**Example**

```
GET /api/items/1
```

**Responses**

* `200 OK` → Item found
* `404 Not Found` → Item not found

---

### 3. Get All Items

**Endpoint**

```
GET /api/items
```

**Response**

```json
[
  {
    "id": 1,
    "name": "iPhone 15",
    "description": "Latest Apple smartphone",
    "price": 79999
  },
  
  {
    "id": 2,
    "name": "IPad mini",
    "description": "Latest Apple IPad",
    "price": 49999
  }
]
```

**Note**

* Returns an empty list `[]` if no items exist.

---

## Validation Rules

* `name` → required, cannot be blank
* `description` → required, cannot be blank
* `price` → required, cannot be null

Invalid input returns:

```
HTTP 400 Bad Request
```

with field-level error messages.

---

## Notes

* In-memory storage (ArrayList) is used as required.
* Data resets on application restart.
* No database is configured.
* No authentication or security is implemented.

---

