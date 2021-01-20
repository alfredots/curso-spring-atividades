package com.alfredots.libraryapi.api.model.repository;

import com.alfredots.libraryapi.api.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
