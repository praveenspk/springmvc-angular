/**
 * 
 */
package com.spk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Praveen
 *
 */

@Entity(name = "Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String isbn;
	@Column
	private String title;
	@Column
	private String author;
	@Column
	private String publication;
	@Column
	private Double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, String title, String author, String publication, Double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publication=" + publication
				+ ", price=" + price + "]";
	}

}
