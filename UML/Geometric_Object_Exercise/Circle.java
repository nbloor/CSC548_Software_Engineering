package objects;

public class Circle extends GeometricObject {
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public void printCircle() {
		System.out.println("A circle created on " + this.getDateCreated());
		System.out.println("color: " + this.getColor() + " and filled: " + this.isFilled());
	}
}
