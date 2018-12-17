package fr.beezen.henripotier.model;

import java.io.Serializable;

public class PercentageOffer implements Offer, Serializable{

	private static final long serialVersionUID = 1L;

	private String type = "percentage";
	
	private int value = 4;
	
	public PercentageOffer() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
