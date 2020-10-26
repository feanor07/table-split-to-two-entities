package com.dilek.alptug.tablesplittotwoentities.controller;

import com.dilek.alptug.tablesplittotwoentities.dto.BookWithAuthor;
import com.dilek.alptug.tablesplittotwoentities.dto.BookWithoutAuthor;
import com.dilek.alptug.tablesplittotwoentities.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(@Autowired BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books-without-author/{id}")
    // curl -X GET http://localhost:8080/books-without-author/{id}
    public BookWithoutAuthor getBookWithoutAuthor(@PathVariable("id") long id) {
        return new BookWithoutAuthor(bookService.getBook(id));
    }

    @GetMapping("/books-with-author-exception/{id}")
    // curl -X GET http://localhost:8080/books-with-author-exception/{id}
    public BookWithAuthor getBookWithAuthorThrowingException(@PathVariable("id") long id) {
        return new BookWithAuthor(bookService.getBook(id));
    }

    @GetMapping("/books-with-author/{id}")
    // curl -X GET http://localhost:8080/books-with-author-exception/{id}
    public BookWithAuthor getBookWithAuthor(@PathVariable("id") long id) {
        return new BookWithAuthor(bookService.getBookWithAuthor(id));
    }
}
