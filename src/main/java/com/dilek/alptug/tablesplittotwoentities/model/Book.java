package com.dilek.alptug.tablesplittotwoentities.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="book")
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int publishYear;
    @Version
    private int version;
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private BookAuthor bookAuthor;
}
