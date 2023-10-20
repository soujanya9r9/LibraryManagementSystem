package com.hire3x.LibraryManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hire3x.LibraryManagementSystem.entity.Books;

public interface BookRepository extends JpaRepository<Books, Long> {

}
