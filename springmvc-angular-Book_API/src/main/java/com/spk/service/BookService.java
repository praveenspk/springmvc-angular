/**
 * 
 */
package com.spk.service;

import java.util.List;

import com.spk.model.Book;

/**
 * @author Praveen
 *
 */
public interface BookService {

	long saveBook(Book book);

	List<Book> getBooks();

	Book getBook(long id);

	void updateBook(long id, Book book);

	void deleteBook(long id);

}
