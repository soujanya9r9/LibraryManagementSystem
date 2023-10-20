package com.hire3x.LibraryManagementSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hire3x.LibraryManagementSystem.entity.Books;
import com.hire3x.LibraryManagementSystem.repo.BookRepository;

@Repository
public class BooksDao {

	@Autowired
	private BookRepository bookRepository;

	public Books addBooks(Books books) {
		return bookRepository.save(books);
	}

	public List<Books> findAllBooks() {
		return bookRepository.findAll();
	}

	public Books updateBooksByIsbn(long isbn, Books books) {
		Optional<Books> optional = bookRepository.findById(isbn);
		if (optional.isPresent()) {
			books.setIsbn(isbn);
			return bookRepository.save(books);
		}
		return null;
	}

	public Books deleteByIsbn(long isbn) {
		Optional<Books> optional = bookRepository.findById(isbn);
		if (optional.isPresent()) {
			Books books = optional.get();
			bookRepository.delete(books);
			return books;
		}
		return null;
	}

}
