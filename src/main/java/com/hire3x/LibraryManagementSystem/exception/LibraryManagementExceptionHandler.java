package com.hire3x.LibraryManagementSystem.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hire3x.LibraryManagementSystem.util.ResponseStructure;

@RestControllerAdvice
public class LibraryManagementExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> isbnNotFoundException(IsbnNotFoundException ex){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setMessage("Incorrect ISBN");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(ex.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}

}
