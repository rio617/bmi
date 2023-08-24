package model;

import java.io.Serializable;

public class Health implements Serializable {
	private double height,weigth,bmi;
	private String bodyType;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weigth;
	}
	public void setWeight(double weigth) {
		this.weigth = weigth;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	

}
