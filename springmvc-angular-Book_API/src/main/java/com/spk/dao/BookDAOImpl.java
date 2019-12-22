/**
 * 
 */
package com.spk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spk.model.Book;

/**
 * @author Praveen
 *
 */

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	public long saveBook(Book book) {
		factory.getCurrentSession().save(book);
		return book.getIsbn();
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list;
		list = factory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public Book getBook(long id) {
		return factory.getCurrentSession().get(Book.class, id);

	}

	@Override
	public void updateBook(long id, Book book) {
		Session session = factory.getCurrentSession();
		Book book2 = session.byId(Book.class).load(id);
		book2.setTitle(book.getTitle());
		book2.setAuthor(book.getAuthor());
		book2.setPrice(book.getPrice());
		book2.setPublication(book.getPublication());

		session.flush();

	}

	@Override
	public void deleteBook(long id) {
		Book book = factory.getCurrentSession().byId(Book.class).load(id);
		factory.getCurrentSession().delete(book);

	}

}
