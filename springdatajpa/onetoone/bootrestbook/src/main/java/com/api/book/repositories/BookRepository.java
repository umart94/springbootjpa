package com.api.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.book.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public Book findById(int id);

}
