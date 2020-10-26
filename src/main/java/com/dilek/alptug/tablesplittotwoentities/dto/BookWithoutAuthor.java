package com.dilek.alptug.tablesplittotwoentities.dto;

import com.dilek.alptug.tablesplittotwoentities.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookWithoutAuthor {
    private long id;
    private String name;
    private int publishYear;

    public BookWithoutAuthor(Book book) {
        this.id = book.getId();
        this.name = book.getName();
        this.publishYear = book.getPublishYear();
    }
}
