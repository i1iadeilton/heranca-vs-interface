package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {

	private Double width;
	private Double height;
	
	public Rectangle(Color color, Double weidth, Double height) {
		super(color);
		this.width = weidth;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double weidth) {
		this.width = weidth;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double hight) {
		this.height = hight;
	}

	@Override
	public double area() {
		
		return width * height;
	}
	
	
}
