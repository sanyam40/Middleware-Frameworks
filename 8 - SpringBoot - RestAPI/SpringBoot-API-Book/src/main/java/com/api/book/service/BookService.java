package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.entity.Book;

@Component
public class BookService {
	
	private static List<Book>list=new ArrayList<>();
	
	static {
		list.add(new Book(12,"JAVA-1","XYZ"));
		list.add(new Book(13,"JAVA-2","XYA"));
		list.add(new Book(14,"JAVA-3","XYB"));
	}
	
	public List<Book>getAllBooks(){
		return list;
	}
	
	public Book getBookById(int id){
		Book book=null;
		try {
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return book;
	}
	
	public Book addBook(Book a) {
		list.add(a);
		return a;
	}

	/* DELETE THR DATA OF BOOK */
	public void deleteBook(int id) {
		list=list.stream().filter(e->{
			if(e.getId()!=id) {
				return true;
			}
			else {
				return false;
			}
		}).collect(Collectors.toList());
	}

	/* UPDATE THE DATA OF BOOK */
	public void updateBook(Book book, int id) {
				list=list.stream().map(b->{
					if(b.getId()==id) {
						b.setTitle(book.getTitle());
						b.setAuthor(book.getAuthor());
					}
					return b;
				}).collect(Collectors.toList());
	}
}
