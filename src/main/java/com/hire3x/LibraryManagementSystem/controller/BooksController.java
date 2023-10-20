package com.hire3x.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hire3x.LibraryManagementSystem.entity.Books;
import com.hire3x.LibraryManagementSystem.service.BooksService;
import com.hire3x.LibraryManagementSystem.util.ResponseStructure;

@RestController
@RequestMapping("/books")
public class BooksController {
	@Autowired
	private BooksService booksService;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Books>> addBooks(@RequestBody Books books){
		return booksService.addBooks(books);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Books>> findAllBooks(){
		return booksService.findAllBooks();
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<Books>> updateBooksByIsbn(@RequestParam long isbn, @RequestBody Books books){
		return booksService.updateBooksByIsbn(isbn, books);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Books>> deleteBooksByIsbn(@RequestParam long isbn){
		return booksService.deleteBooksByIsbn(isbn);
	}
	
}
