package com.example.Librarymanagement.controllers;


import com.example.Librarymanagement.entities.BorrowingRecord;
import com.example.Librarymanagement.entities.Patron;
import com.example.Librarymanagement.services.BorrowingRecordService;
import com.example.Librarymanagement.services.PatronService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/borrowing-records")


public class BorrowingRecordController {
	
	@Autowired
    private BorrowingRecordService borrowingRecordService;

    @GetMapping
    public List<BorrowingRecord> getAllBorrowingRecords() {
        return borrowingRecordService.getAllBorrowingRecords();
    }

    @GetMapping("/{id}")
    public BorrowingRecord getBorrowingRecordById(@PathVariable Long id) {
        return borrowingRecordService.getBorrowingRecordById(id);
    }

    @PostMapping
    public BorrowingRecord addBorrowingRecord(@RequestBody BorrowingRecord borrowingRecord) {
        return borrowingRecordService.saveBorrowingRecord(borrowingRecord);
    }

    @PutMapping("/{id}")
    public BorrowingRecord updateBorrowingRecord(@PathVariable Long id, @RequestBody BorrowingRecord borrowingRecord) {
        borrowingRecord.setId(id);
        return borrowingRecordService.saveBorrowingRecord(borrowingRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteBorrowingRecord(@PathVariable Long id) {
        borrowingRecordService.deleteBorrowingRecord(id);
    }
	
	
	
	
	
	
	
	
	
	
	

}
