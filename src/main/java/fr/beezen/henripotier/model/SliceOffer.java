package fr.beezen.henripotier.model;

import java.io.Serializable;

public class SliceOffer implements Offer, Serializable {

	private static final long serialVersionUID = 1L;

	private String type = "slice";
	
	private int sliceValue = 100;
	
	private int value = 12;

	public SliceOffer() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSliceValue() {
		return sliceValue;
	}

	public void setSliceValue(int sliceValue) {
		this.sliceValue = sliceValue;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
