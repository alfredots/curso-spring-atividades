package com.alfredots.libraryapi.api.resource;

import com.alfredots.libraryapi.api.dto.BookDTO;
import com.alfredots.libraryapi.api.model.entity.Book;
import com.alfredots.libraryapi.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO dto) {
        Book entity = Book.builder().author(dto.getAuthor()).title(dto.getTitle()).isbn(dto.getIsbn()).build();
        service.save(entity);
        return BookDTO.builder().author(entity.getAuthor()).title(entity.getTitle()).isbn(entity.getIsbn()).build();
    }
}
