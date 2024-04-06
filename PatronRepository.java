package com.example.Librarymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Librarymanagement.entities.Patron;

public interface PatronRepository extends JpaRepository<Patron, Long> {

}
