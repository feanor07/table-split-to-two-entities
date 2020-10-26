package com.dilek.alptug.tablesplittotwoentities.repository;

import com.dilek.alptug.tablesplittotwoentities.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> { }
