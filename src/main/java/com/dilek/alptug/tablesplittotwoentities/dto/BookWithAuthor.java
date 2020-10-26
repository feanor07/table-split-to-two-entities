package com.dilek.alptug.tablesplittotwoentities.dto;

import com.dilek.alptug.tablesplittotwoentities.model.Book;
import lombok.Data;

@Data
public class BookWithAuthor {
    private long id;
    private String name;
    private int publishYear;
    private String author;

    public BookWithAuthor(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.publishYear = book.getPublishYear();
        this.author = book.getBookAuthor().getAuthor();
    }
}
