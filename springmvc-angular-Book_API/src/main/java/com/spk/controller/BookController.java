/**
 * 
 */
package com.spk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spk.model.Book;
import com.spk.service.BookService;

/**
 * @author Praveen
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Book book) {
		long id = service.saveBook(book);
		return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
	}

	@GetMapping("/list")
	public ResponseEntity<List<Book>> listBooks() {
		List<Book> books = service.getBooks();
		return ResponseEntity.ok().body(books);
	}

	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable long id) {
		Book book = service.getBook(id);
		return ResponseEntity.ok().body(book);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateBook(@PathVariable long id, @RequestBody Book book) {
		service.updateBook(id, book);
		return ResponseEntity.ok().body("Book has been updated Successfully : " + id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable long id) {
		service.deleteBook(id);
		return ResponseEntity.ok().body("Book has been deleted having Isbn : " + id);
	}
}
