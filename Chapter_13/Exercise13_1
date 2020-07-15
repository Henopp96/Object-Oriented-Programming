import java.util.Scanner;
/*
 * Cody Henopp
 * 
 * 07/15/2020
 * 
 * This program creates a triangle based on what is entered into the correct spaces and displays the area,
 * perimeter, color, and true or false on if the triangle is filled.
 */

public class Exercise13_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		Object[] objects = new Object[5];
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Exercise13_1)
			System.out.println("Color all three sides.");
		}
		while (run) {
		System.out.println("Enter in all values asked for the triangle. ");

		System.out.println("");

		System.out.println("Enter a value for side1: ");
		double side1 = input.nextDouble();

		System.out.println("Enter a value for side2: ");
		double side2 = input.nextDouble();

		System.out.println("Enter a value for side3: ");
		double side3 = input.nextDouble();

		System.out.println("Enter a color for the triangle: ");
		String color = input.next();

		System.out.println("Enter true or false as to if the triangle is filled: ");
		boolean filled = input.nextBoolean();

		}
		TriangleFromGeometricObject triangle = new TriangleFromGeometricObject(side1, side2, side3);
		
		

		System.out.println("The area of the triangle is: " + triangle.getArea());

		System.out.println("The perimeter is: " + triangle.getPerimeter());

		System.out.println("The color is " + color);

		System.out.println("The date created is " + triangle.getDateCreated());
		
		System.out.println(triangle.howToColor());

		if(filled == true) {
			System.out.println("The triangle is filled.");
		}

		else {
			System.out.println("The triangle is not filled.");
		}
	
		
	}
}
abstract class GeometricObject{
	private String color = "white";
	private boolean filled = true;
	private java.util.Date dateCreated;

	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

}

class TriangleFromGeometricObject
extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	private String howToColor = "Color all three sides.";

	public TriangleFromGeometricObject() {

	}
	public TriangleFromGeometricObject(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public TriangleFromGeometricObject(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	double getSide1() {
		return side1;
	}
	void setSide1(double side1) {
		this.side1 = side1;
	}
	double getSide2() {
		return side2;
	}
	void setSide2(double side2) {
		this.side2 = side2;
	}
	double getSide3() {
		return side3;
	}
	void setSide3(double side3) {
		this.side3 = side3;
	}
	double getArea() {
		double s = ((side1 + side2 + side3) / 2);
		double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
		return area;
	}
	double getPerimeter() {
		return (side1 + side2+ side3);
	}
	public String howToColor() {
		return "Color all three sides";
	}
	void howToColor(String howToColor) {
		this.howToColor = howToColor;
	}

}
