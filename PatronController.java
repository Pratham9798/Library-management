package com.example.Librarymanagement.controllers;


import com.example.Librarymanagement.entities.Patron;

import com.example.Librarymanagement.services.PatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/patrons")

public class PatronController {
	
	@Autowired
    private PatronService patronService;

    @GetMapping
    public List<Patron> getAllPatrons() {
        return patronService.getAllPatrons();
    }

    @GetMapping("/{id}")
    public Patron getPatronById(@PathVariable Long id) {
        return patronService.getPatronById(id);
    }

    @PostMapping
    public Patron addPatron(@RequestBody Patron patron) {
        return patronService.savePatron(patron);
    }

    @PutMapping("/{id}")
    public Patron updatePatron(@PathVariable Long id, @RequestBody Patron patron) {
        patron.setId(id);
        return patronService.savePatron(patron);
    }

    @DeleteMapping("/{id}")
    public void deletePatron(@PathVariable Long id) {
        patronService.deletePatron(id);
    }
	
	
	
	
	

}
