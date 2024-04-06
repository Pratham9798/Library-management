package com.example.Librarymanagement.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Librarymanagement.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	

}
