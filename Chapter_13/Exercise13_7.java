import java.util.Scanner;
/*
 * Cody Henopp
 * 
 * 07/27/2020
 * 
 * This program displays an array of 5 Geometric Objects with the area perimeter and the howToColor method
 * on each displaying "Color all three sides"
 */

public class Exercise13_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TriangleFromGeometricObject[] objects = new TriangleFromGeometricObject[5];
		double side1 = 0.0;
		double side2 = 0.0;
		double side3 = 0.0;
		boolean run = true;
		for (int i = 0; i < objects.length; i++) {
			
		
		
		System.out.println("Enter in all values asked for the triangle. ");

		System.out.println("");

		System.out.println("Enter a value for side1: ");
		side1 = input.nextDouble();

		System.out.println("Enter a value for side2: ");
		side2 = input.nextDouble();

		System.out.println("Enter a value for side3: ");
		side3 = input.nextDouble();
		
		objects[i] = new TriangleFromGeometricObject(side1, side2, side3);
		}	

		System.out.println("The area of triangle 1 is: " + objects[0].getArea());

		System.out.println("The perimeter is: " + objects[0].getPerimeter());

		System.out.println(Colorable.howToColor());
		
		System.out.println("The area of triangle 2 is: " + objects[1].getArea());

		System.out.println("The perimeter is: " + objects[1].getPerimeter());

		System.out.println(Colorable.howToColor());
		
		System.out.println("The area of triangle 3 is: " + objects[2].getArea());

		System.out.println("The perimeter is: " + objects[2].getPerimeter());

		System.out.println(Colorable.howToColor());
		
		System.out.println("The area of triangle 4 is: " + objects[3].getArea());

		System.out.println("The perimeter is: " + objects[3].getPerimeter());

		System.out.println(Colorable.howToColor());
		
		System.out.println("The area of triangle 5 is: " + objects[4].getArea());

		System.out.println("The perimeter is: " + objects[4].getPerimeter());

		System.out.println(Colorable.howToColor());

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
	private double side1 = 0;
	private double side2 = 0;
	private double side3 = 0;


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
}
	class Colorable 
	extends TriangleFromGeometricObject {
		private String howToColor = "Color all three sides.";

		public Colorable() {

		}
		public Colorable (String howToColor){
			this.howToColor = howToColor;
		}

		public static String howToColor() {
			return "Color all three sides";
		}
		void howToColor(String howToColor) {
			this.howToColor = howToColor;
		}
	
}
