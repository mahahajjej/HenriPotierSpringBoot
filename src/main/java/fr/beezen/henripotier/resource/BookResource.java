package fr.beezen.henripotier.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.beezen.henripotier.model.Books;
import fr.beezen.henripotier.repository.BookRepository;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = { "*" }, allowedHeaders = { "*" }, methods = { RequestMethod.GET })
public class BookResource {

	private BookRepository bookRepository = new BookRepository();

	@GetMapping(produces={"application/json"})
	public ResponseEntity<Books> getBooks() {

		Books books = bookRepository.findAll();

		return ResponseEntity.ok().body(books);

	}
}
