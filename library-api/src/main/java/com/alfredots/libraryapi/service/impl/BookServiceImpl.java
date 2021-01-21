package com.alfredots.libraryapi.service.impl;

import com.alfredots.libraryapi.api.model.entity.Book;
import com.alfredots.libraryapi.api.model.repository.BookRepository;
import com.alfredots.libraryapi.exception.BusinessException;
import com.alfredots.libraryapi.service.BookService;

public class BookServiceImpl implements BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        if(repository.existsByIsbn(book.getIsbn())) {
            throw new BusinessException("Isbn já cadastrado.");
        }

        return repository.save(book);
    }
}
