package com.books_catelog.main.repository;

import com.books_catelog.main.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Inmemory store for Book objects.
 */
@Repository
public class BookRepository {
	// holds books
    private final Map<Integer, Book> books = new ConcurrentHashMap<>();

    // Save a book in the repository
    public Book save(Book book) {
        books.put(book.getId(), book);
        return book;
    }

    // Get all books from the repository
    public Map<Integer, Book> findAll() {
        return books;
    }

    // Find a book by its ID
    public Book findById(Integer id) {
        return books.get(id);
    }

    // Delete a book by ID
    public void delete(Integer id) {
        books.remove(id);
    }
}
