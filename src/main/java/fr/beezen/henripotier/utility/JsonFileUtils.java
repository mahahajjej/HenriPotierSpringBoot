package fr.beezen.henripotier.utility;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import fr.beezen.henripotier.model.Book;

public class JsonFileUtils {

	private InputStream booksFileInputStream = null;

	public List<Book> readBooksJson() {

		List<Book> bookList = new ArrayList<>();
		
		booksFileInputStream = JsonFileUtils.class.getResourceAsStream("Books.json");
		
		
		StringWriter writer = new StringWriter();
		

		try {

			IOUtils.copy(booksFileInputStream, writer);

		} catch (IOException e) {

			e.printStackTrace();
			return Collections.emptyList();

		} finally {

			try {

				booksFileInputStream.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		String jsonData = writer.toString();
		JSONArray books;

		try {

			books = new JSONArray(jsonData);

		} catch (JSONException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}

		JSONObject bookJson;
		Book bookObj = null;

		for (int i = 0; i < books.length(); i++) {

			try {

				bookJson = books.getJSONObject(i);

			} catch (JSONException e) {

				e.printStackTrace();
				return Collections.emptyList();
			}
			
			try {
				
				bookObj = getBook(bookJson);
				
			} catch (JSONException e) {
				
				e.printStackTrace();
				return bookList;
			}
			
			bookList.add(bookObj);
			
		}

		return bookList;
	}

	private static Book getBook(JSONObject bookNode) throws JSONException {
		Book book = new Book();
		
		book.setCover(bookNode.getString("cover"));
		book.setIsbn(bookNode.getString("isbn"));
		book.setPrice(bookNode.getInt("price"));
		book.setTitle(bookNode.getString("title"));
		
		JSONArray synopsisJson = bookNode.getJSONArray("synopsis");
		String[] synopsis = new String[synopsisJson.length()];

		for(int i = 0; i < synopsisJson.length(); i++)
			synopsis[i] = synopsisJson.getString(i);
		
		book.setSynopsis(synopsis);
		
		return book;
	}
}
