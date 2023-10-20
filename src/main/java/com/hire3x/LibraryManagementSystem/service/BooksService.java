package com.hire3x.LibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hire3x.LibraryManagementSystem.dao.BooksDao;
import com.hire3x.LibraryManagementSystem.dto.BooksDto;
import com.hire3x.LibraryManagementSystem.entity.Books;
import com.hire3x.LibraryManagementSystem.exception.IsbnNotFoundException;
import com.hire3x.LibraryManagementSystem.util.ResponseStructure;

@Service
public class BooksService {

	@Autowired
	private BooksDao booksDao;
	
	public ResponseEntity<ResponseStructure<Books>> addBooks(Books books){
		Books dbBooks = booksDao.addBooks(books);
		BooksDto booksDto = new BooksDto();
		booksDto.setIsbn(dbBooks.getIsbn());
		booksDto.setTitle(dbBooks.getTitle());
		booksDto.setAuthor(dbBooks.getAuthor());
		booksDto.setGenre(dbBooks.getGenre());
		booksDto.setPublicationyear(dbBooks.getPublicationyear());
		
		ResponseStructure<Books> structure = new ResponseStructure<Books>();
		structure.setMessage("Book Added Successfully");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(booksDto);
		return new ResponseEntity<ResponseStructure<Books>>(structure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Books>> findAllBooks(){
		List<Books> dbBooks = booksDao.findAllBooks();

		ResponseStructure<Books> structure = new ResponseStructure<Books>();
		structure.setMessage("Books Found Successfully");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(dbBooks);
		return new ResponseEntity<ResponseStructure<Books>>(structure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Books>> updateBooksByIsbn(long isbn, Books books){
		Books dbBooks = booksDao.updateBooksByIsbn(isbn, books);
		if(dbBooks != null) {
		BooksDto booksDto = new BooksDto();
		booksDto.setIsbn(dbBooks.getIsbn());
		booksDto.setTitle(dbBooks.getTitle());
		booksDto.setAuthor(dbBooks.getAuthor());
		booksDto.setGenre(dbBooks.getGenre());
		booksDto.setPublicationyear(dbBooks.getPublicationyear());
		
		ResponseStructure<Books> structure = new ResponseStructure<Books>();
		structure.setMessage("Book Updated Successfully");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(booksDto);
		return new ResponseEntity<ResponseStructure<Books>>(structure,HttpStatus.OK);
	}
		else {
			throw new IsbnNotFoundException("Enter Valid ISBN");
		}
	}
	
	public ResponseEntity<ResponseStructure<Books>> deleteBooksByIsbn(long isbn){
		Books dbBooks = booksDao.deleteByIsbn(isbn);
		if(dbBooks != null) {
		BooksDto booksDto = new BooksDto();
		booksDto.setIsbn(dbBooks.getIsbn());
		booksDto.setTitle(dbBooks.getTitle());
		booksDto.setAuthor(dbBooks.getAuthor());
		booksDto.setGenre(dbBooks.getGenre());
		booksDto.setPublicationyear(dbBooks.getPublicationyear());
		
		ResponseStructure<Books> structure = new ResponseStructure<Books>();
		structure.setMessage("Book Deleted Successfully");
		structure.setStatus(HttpStatus.GONE.value());
		structure.setData(booksDto);
		return new ResponseEntity<ResponseStructure<Books>>(structure,HttpStatus.GONE);
	}
		else {
			throw new IsbnNotFoundException("Entered ISBN is Not Present in Database");
		}
	}
}
