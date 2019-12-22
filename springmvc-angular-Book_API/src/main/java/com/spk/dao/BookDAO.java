/**
 * 
 */
package com.spk.dao;

import java.util.List;

import com.spk.model.Book;

/**
 * @author Praveen
 *
 */
public interface BookDAO {

	long saveBook(Book book);

	List<Book> getAllBooks();

	Book getBook(long id);

	void updateBook(long id, Book book);

	void deleteBook(long id);

}
