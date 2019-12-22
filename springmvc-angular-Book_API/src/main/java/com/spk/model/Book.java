/**
 * 
 */
package com.spk.model;


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
	private long isbn;
	private String title;
	private String author;
	private String publication;
	private Double price;

	public Book() {
	}

	public Book(long isbn, String title, String author, String publication, Double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.price = price;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
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
