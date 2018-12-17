package fr.beezen.henripotier.model;

import java.io.Serializable;
import java.util.List;

public class Offers implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Offer> offers;
	
	public Offers() {
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
	
	
}
