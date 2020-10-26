package com.dilek.alptug.tablesplittotwoentities.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
@Data
public class BookAuthor {
    @Id
    @GeneratedValue
    private Long id;
    private String author;
}
