package com.books_catelog.main.service.impl;

import com.books_catelog.main.entity.Book;
import com.books_catelog.main.repository.BookRepository;
import com.books_catelog.main.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Map;
/** Implements business rules on top of the repository. */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Map<Integer, Book> getAllBooks() {
        return bookRepository.findAll(); 
    }

    @Override
    public Book getBookById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.delete(id);
    }

    @Override
    public void updateAvailability(Integer id, Boolean available) {
        Book book = bookRepository.findById(id);
        if (book != null) {
            book.setAvailable(available);
            bookRepository.save(book);
        }
    }
}
