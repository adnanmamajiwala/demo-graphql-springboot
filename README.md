# Demo GraphQL with Spring Boot

1. Start the spring boot application 
2. Goto `http://localhost:8080/graphiql`
3. Use the sample request
    
    ```
    {
        book(id: 2) {
            id,
            name,
            author
        }  
    }
    ``` 