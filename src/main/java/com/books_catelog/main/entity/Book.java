package com.books_catelog.main.entity;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.NotBlank;
/*
  Represents one Book in our catalog.
 */
public class Book {
    private static final AtomicInteger COUNTER = new AtomicInteger();
 // unique identifier
    private Integer id;
 // If someone tries to create a book without a title validation will fail automatically
    @NotBlank(message = "Title is required")
    private String title;
 // If someone tries to create a book without the author name validation will fail automatically
    @NotBlank(message = "Author is required")
    private String author;
    
    private String isbn;

    // Default value is true
    private Boolean available = true;  
    
    
    // Constructor
    public Book(String title, String author, String isbn) {
     // Generates unique ID using AtomicInteger
        this.id = COUNTER.incrementAndGet(); 
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
