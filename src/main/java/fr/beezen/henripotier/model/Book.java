package fr.beezen.henripotier.model;

import java.io.Serializable;
import java.util.Arrays;

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;

	private String isbn;
	
	private String title;
	
	private int price;
	
	private String cover;
	
	private String[] synopsis;
	
	public Book() {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String[] getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String[] synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", cover=" + cover + ", synopsis="
				+ Arrays.toString(synopsis) + "]";
	}
	
	
}
