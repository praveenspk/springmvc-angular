/**
 * 
 */
package com.spk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spk.dao.BookDAO;
import com.spk.model.Book;

/**
 * @author Praveen
 *
 */

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO dao;

	@Transactional
	@Override
	public long saveBook(Book book) {
		return dao.saveBook(book);
	}

	@Override
	@Transactional
	public List<Book> getBooks() {
		return dao.getAllBooks();
	}

	@Transactional
	@Override
	public Book getBook(long id) {

		return dao.getBook(id);
	}

	@Transactional
	@Override
	public void updateBook(long id, Book book) {
		dao.updateBook(id, book);

	}

	@Transactional
	@Override
	public void deleteBook(long id) {
		dao.deleteBook(id);

	}

}
