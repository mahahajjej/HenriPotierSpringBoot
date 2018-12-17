package fr.beezen.henripotier.repository;

import java.util.List;

import fr.beezen.henripotier.model.Book;
import fr.beezen.henripotier.model.Books;
import fr.beezen.henripotier.utility.JsonFileUtils;

public class BookRepository {

	private JsonFileUtils booksJsonParser = new JsonFileUtils();
	
	public Books findAll() {
		
		List<Book> list = booksJsonParser.readBooksJson();
		
		Books books = new Books();
		books.setBooks(list);
		
		return books;
	}
}
