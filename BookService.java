package com.example.Librarymanagement.services;


import com.example.Librarymanagement.entities.Book;

import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Librarymanagement.repositories.BookRepository;

@Service
public class BookService {
	
	
	
	
	 @Autowired
	    private BookRepository bookRepository;

	    public List<Book> getAllBooks() {
	        return bookRepository.findAll();
	    }
      @Cacheable("books")
	    public Book getBookById(Long id) {
	        return bookRepository.findById(id).orElse(null);
	    }

	    public Book saveBook(Book book) {
	        return bookRepository.save(book);
	    }

	    public void deleteBook(Long id) {
	        bookRepository.deleteById(id);
	    }
	
	
	
	

}
