package com.hire3x.LibraryManagementSystem.exception;

import lombok.Getter;

@Getter
public class IsbnNotFoundException extends RuntimeException{

	private String message;

	public IsbnNotFoundException(String message) {
		super();
		this.message = message;
	}
}
