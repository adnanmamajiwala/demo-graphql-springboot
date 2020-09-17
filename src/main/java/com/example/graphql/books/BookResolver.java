package com.example.graphql.books;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookResolver implements GraphQLQueryResolver {

    private final BookRepository repository;

    public Book book(Long id){
        return repository.findById(id).orElse(null);
    }

}
