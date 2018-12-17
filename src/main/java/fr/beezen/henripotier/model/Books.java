package fr.beezen.henripotier.model;

import java.io.Serializable;
import java.util.List;

public class Books implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Book> books;
	
	public Books() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
