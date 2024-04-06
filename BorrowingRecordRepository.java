package com.example.Librarymanagement.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Librarymanagement.entities.BorrowingRecord;

public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long>
{

}
