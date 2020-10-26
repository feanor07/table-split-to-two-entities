package com.dilek.alptug.tablesplittotwoentities.service;

import com.dilek.alptug.tablesplittotwoentities.model.Book;
import com.dilek.alptug.tablesplittotwoentities.model.QBook;
import com.dilek.alptug.tablesplittotwoentities.repository.BookRepository;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional
public class BookService {
    private BookRepository bookRepository;
    private EntityManager entityManager;

    public BookService(@Autowired BookRepository bookRepository, @Autowired @Qualifier("entityManagerFactory") EntityManager entityManager) {
        this.bookRepository = bookRepository;
        this.entityManager = entityManager;
    }

    public Book getBook(long id) {
        return bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid bookd id provided"));
    }

    public Book getBookWithAuthor(long id) {
        QBook book = QBook.book;

        return new JPAQuery<>(entityManager).from(book).where(book.id.eq(id)).rightJoin(book.bookAuthor).fetchJoin().select(book).fetchOne();
    }
}
