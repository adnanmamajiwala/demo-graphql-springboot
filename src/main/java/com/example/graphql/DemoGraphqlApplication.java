package com.example.graphql;

import com.example.graphql.books.Book;
import com.example.graphql.books.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;

@SpringBootApplication
public class DemoGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGraphqlApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(BookRepository repository) throws Exception {
        Book[] books = new ObjectMapper().readValue(new ClassPathResource("data.json").getInputStream(), Book[].class);
        return args -> repository.saveAll(Arrays.asList(books));
    }

}
