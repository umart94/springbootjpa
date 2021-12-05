package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.entities.Book;

@Component
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(12,"Java Complete Reference","XYZ"));
		list.add(new Book(36,"Python Complete Reference","MNP"));
		list.add(new Book(12963,"C# Complete Reference","QRST"));
	}
	
	
	public List<Book> getAllBooks(){
		return list;
	}
	
	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e->e.getId() == id ).findFirst().get();
		return book;
	}
	
	public Book addBook(Book b) {
		list.add(b);
		return b;
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
		list = list.stream().filter(book ->book.getId()!=id).collect(Collectors.toList());
	}
	
	
	public void updateBook(Book book,int bookId) {
		list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}
	
	

}
