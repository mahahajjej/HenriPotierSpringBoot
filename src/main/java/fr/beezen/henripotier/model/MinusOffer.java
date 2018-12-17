package fr.beezen.henripotier.model;

import java.io.Serializable;

public class MinusOffer implements Offer, Serializable {

	private static final long serialVersionUID = 1L;

	private String type = "minus";
	
	private int value = 15;
	
	public MinusOffer() {
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
