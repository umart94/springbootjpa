package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.entities.Book;
import com.api.book.repositories.BookRepository;

@Component
public class BookService {
	
	
	@Autowired
	private BookRepository bookRepository;
//	private static List<Book> list = new ArrayList<>();
//	
//	static {
//		list.add(new Book(12,"Java Complete Reference","XYZ"));
//		list.add(new Book(36,"Python Complete Reference","MNP"));
//		list.add(new Book(12963,"C# Complete Reference","QRST"));
//	}
//	
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book getBookById(int id) {
		Book book = null;
		try {
		//book = list.stream().filter(e->e.getId() == id ).findFirst().get();
			book = bookRepository.findById(id);
		} catch(Exception e) {
			
		}
		return book;
	}
	
	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
		return result;
	}
	
	public void deleteBook(int id) {
//		list.stream().filter(book -> {
//			if(book.getId()!=id) {
//				return true;
//			} else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
		
		//or
		//list = list.stream().filter(book ->book.getId()!=id).collect(Collectors.toList());
		
		bookRepository.deleteById(id);
	}
	
	
	public void updateBook(Book book,int bookId) {
//		list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		bookRepository.save(book);
	}
	
	

}
