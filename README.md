# Library Book Catalog API

A Spring Boot-based REST API to manage a library’s book catalog. It allows adding, retrieving, updating, and deleting books. Data is stored in an in-memory structure using HashMap.

## How to Run the Project

### Prerequisites
- Java 8 or later
- Maven

### Steps to Run

1. Clone the repository:
   git clone https://github.com/darshanchaudharii/Library_Management_Books_Catelog_Backend_Server

2. Navigate into the project folder:
   cd Library_Management_Books_Catelog_Backend_Server

3. Run the application:
   mvn spring-boot:run

The application will start on:
http://localhost:8080

## API Endpoints

| Method | Endpoint                         | Description                      |
|--------|----------------------------------|----------------------------------|
| POST   | /books                           | Add a new book                   |
| GET    | /books                           | Retrieve all books               |
| GET    | /books/{id}                      | Get book by ID                   |
| DELETE | /books/{id}                      | Delete book                      |
| PATCH  | /books/{id}/availability         | Update book availability         |

## Sample Requests and Responses

### POST /books

Request Body:
{
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780062315007",
  "available": true
}

Response:
{
  "id": 1,
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780062315007",
  "available": true
}

### GET /books

Response:
{
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "isbn": "9780062315007",
    "available": true
    }
### PATCH /books/1/availability

Request Body:
{
  "available": false
}

Response:
{
  "id": 1,
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780062315007",
  "available": false
}

### DELETE /books/1

Response Status: 204 No Content

## Input Validation

- Title must not be blank
- Author must not be blank

## Postman Collection

Test this API using the shared Postman collection:  
https://www.postman.com/your-workspace/collections/your-collection-id

## Author

Darshan  
Aspiring Java Full Stack Developer  
GitHub: https://github.com/yourusername
