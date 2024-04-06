package com.example.Librarymanagement.controllers;


import com.example.Librarymanagement.entities.Book;
import com.example.Librarymanagement.services.BookService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;





public class BookControllerTest {
	@Mock
    private BookService bookService;

    @InjectMocks
    private BookController bookController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllBooks() {
        // Mock data
        Book book1 = new Book();
        book1.setId(1L);
        Book book2 = new Book();
        book2.setId(2L);
        List<Book> books = Arrays.asList(book1, book2);

        // Mock service method
        when(bookService.getAllBooks()).thenReturn(books);

        // Test
        List<Book> result = bookController.getAllBooks();
        assertEquals(2, result.size());
        verify(bookService, times(1)).getAllBooks();
    }

   
}
	
	
	
	
	
	


