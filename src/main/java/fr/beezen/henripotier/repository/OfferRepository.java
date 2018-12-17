package fr.beezen.henripotier.repository;

import java.util.ArrayList;
import java.util.List;

import fr.beezen.henripotier.model.MinusOffer;
import fr.beezen.henripotier.model.Offer;
import fr.beezen.henripotier.model.Offers;
import fr.beezen.henripotier.model.PercentageOffer;
import fr.beezen.henripotier.model.SliceOffer;

public class OfferRepository {
	
	public Offers findAll() {
		
		List<Offer> list = new ArrayList<>();
		
		list.add(new PercentageOffer());
		list.add(new MinusOffer());
		list.add(new SliceOffer());
		
		Offers offers = new Offers();
		offers.setOffers(list);
		
		return offers;
	}
	
	public Offers findOne(){
		
		List<Offer> list = new ArrayList<>();
		
		list.add(new PercentageOffer());
		
		Offers offers = new Offers();
		offers.setOffers(list);
		
		return offers;
	}
}
