# Library Book Catalog API

A Spring Boot-based REST API to manage a library’s book catalog. It allows adding, retrieving, updating, and deleting books. Data is stored in an in-memory structure using HashMap.

## How to Run the Project

### Prerequisites
- Java 8 or later
- Maven

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-api.git
   ```

2. Navigate into the project folder:
   ```bash
   cd library-api
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

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

**Request Body**
```json
{
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780062315007",
  "available": true
}
```

**Response**
```json
{
  "id": 1,
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780062315007",
  "available": true
}
```

### GET /books

**Response**
```json
[
  {
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "isbn": "9780062315007",
    "available": true
  },
  {
    "id": 2,
    "title": "1984",
    "author": "George Orwell",
    "isbn": "9780451524935",
    "available": false
  }
]
```

### PATCH /books/1/availability

**Request Body**
```json
{
  "available": false
}
```

**Response**
```json
{
  "id": 1,
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780062315007",
  "available": false
}
```

### DELETE /books/1

**Response**
- Status: 204 No Content

## Input Validation

- `title` must not be blank
- `author` must not be blank

## Postman Collection

Test this API using the shared Postman collection:  
[Open Collection]([https://www.postman.com/your-workspace/collections/your-collection-id](https://restless-rocket-398046.postman.co/workspace/My-Workspace~d611aeb1-7e53-402e-8557-fca0c9eaf520/collection/45915590-141ca865-08a1-49b2-8588-ac7aeda002e4?action=share&creator=45915590)

## Author

Darshan  
Aspiring Java Full Stack Developer  
GitHub: https://github.com/darshanchaudharii
