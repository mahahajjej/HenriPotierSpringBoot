package fr.beezen.henripotier.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.beezen.henripotier.model.Offers;
import fr.beezen.henripotier.repository.OfferRepository;

@RestController
@RequestMapping("api/offers")

@CrossOrigin(origins = { "*" }, allowedHeaders = { "*" }, methods = { RequestMethod.GET })
public class OfferResource {

	private OfferRepository offerRepository = new OfferRepository();

	@GetMapping(value = "/{purchasedBooks}", produces={"application/json"})
	public ResponseEntity<Offers> getOffers(@PathVariable Long purchasedBooks) {

		if (purchasedBooks == 1) {

			Offers offer = offerRepository.findOne();
			return ResponseEntity.ok().body(offer);

		} else if (purchasedBooks > 1) {

			Offers offers = offerRepository.findAll();
			return ResponseEntity.ok().body(offers);
		}

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
}
