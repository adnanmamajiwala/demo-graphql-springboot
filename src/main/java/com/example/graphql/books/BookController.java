package com.example.graphql.books;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository repository;

    @GetMapping
    public List<Book> getAll() {
        return repository.findAll();
    }

    @GetMapping("search")
    public Book getAll(@RequestParam("name") String name) {
        return repository.findByName(name);
    }
}
