package com.books_catelog.main.service;

import com.books_catelog.main.entity.Book;
import java.util.Map;
/** Defines our “business logic” operations. */
public interface BookService {

    Book addBook(Book book);

    Map<Integer, Book> getAllBooks(); // New method to retrieve all books

    Book getBookById(Integer id);

    void deleteBook(Integer id);

    void updateAvailability(Integer id, Boolean available);
}
