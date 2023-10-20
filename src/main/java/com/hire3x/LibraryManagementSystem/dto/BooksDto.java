package com.hire3x.LibraryManagementSystem.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BooksDto {
	private long isbn;
	private String title;
	private String author;
	private LocalDate publicationyear;
	private String genre;

}
