package com.example.Librarymanagement.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class BorrowingRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Book book;
    
    @ManyToOne
    private Patron patron;
    
    private LocalDate borrowDate;
    private LocalDate returnDate;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
