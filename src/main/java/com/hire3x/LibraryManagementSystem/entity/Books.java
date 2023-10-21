package com.hire3x.LibraryManagementSystem.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Books {
	@Id
	private long isbn;
	private String title;
	private String author;
	private LocalDate publicationyear;
	private String genre;
	
}
