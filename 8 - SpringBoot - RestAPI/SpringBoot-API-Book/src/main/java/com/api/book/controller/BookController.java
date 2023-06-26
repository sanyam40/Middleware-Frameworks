package com.api.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entity.Book;
import com.api.book.service.BookService;

@RestController
public class BookController {
	
//	--> POST : CREATE - PORT : 201
//	--> GET : READ - PORT : 200,204,206
//	--> PUT : UPDATE - PORT : 200
//	--> DELETE : DELETE - PORT : 204
//  --> build() is to create an object
	
	@Autowired
	private BookService bookService;
	
	/* READING DATA ALL DATA */
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book>list=this.bookService.getAllBooks();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list)); // return 200 OK STATUS
	}
	
	/* READING DATA DATA BY ID */
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id")int id) {
		Book book=bookService.getBookById(id);
		
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(book));
	}
	
	/* CREATING NEW DATA */
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b=null;
		
		try {
		b=this.bookService.addBook(book);
		System.out.println(book);
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}	
	}
	
	/* DELETING DATA */
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bookId")int id) {
		
		try {
		this.bookService.deleteBook(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/* UPDATE DATA */
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable("bookId")int id) {
		
		try {
			this.bookService.updateBook(book,id);
			return ResponseEntity.ok().body(book);
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
