package com.alfredots.libraryapi.service;

import com.alfredots.libraryapi.api.model.entity.Book;
import lombok.Data;

public interface BookService {
    Book save(Book any);
}
