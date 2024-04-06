package com.example.Librarymanagement.services;

import com.example.Librarymanagement.entities.Book;
import com.example.Librarymanagement.entities.BorrowingRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Librarymanagement.repositories.BookRepository;
import com.example.Librarymanagement.repositories.BorrowingRecordRepository;




@Service
public class BorrowingRecordService {

	@Autowired
    private BorrowingRecordRepository borrowingRecordRepository;

    public List<BorrowingRecord> getAllBorrowingRecords() {
        return borrowingRecordRepository.findAll();
    }

    public BorrowingRecord getBorrowingRecordById(Long id) {
        return borrowingRecordRepository.findById(id).orElse(null);
    }

    public BorrowingRecord saveBorrowingRecord(BorrowingRecord borrowingRecord) {
        return borrowingRecordRepository.save(borrowingRecord);
    }

    public void deleteBorrowingRecord(Long id) {
        borrowingRecordRepository.deleteById(id);
    }
	
	
	
	
	
	
	
}
