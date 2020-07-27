import java.util.Scanner;
/*
 * Cody Henopp
 * 
 * 07/27/2020
 * 
 * This program creates an Octagon and then creates a clone for the Octagon and compares the two.
 */

public class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter in the length of the sides: ");
		double side = input.nextDouble();
		
		OctagonFromGeometricObject octagon = new OctagonFromGeometricObject(side);
		
		
		System.out.println("The area of the Octagon is: " + octagon.getArea());
		
		OctagonFromGeometricObject octagon1 = octagon;
		OctagonFromGeometricObject octagon2 = (OctagonFromGeometricObject)octagon.clone();
		
		System.out.println(octagon1.compareTo(octagon2));
		
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

class OctagonFromGeometricObject implements Cloneable, Comparable<OctagonFromGeometricObject>{
	private double side = 0;
	private double area;

	public OctagonFromGeometricObject() {

	}
	public OctagonFromGeometricObject(double side){
		this.side = side;
	}
	public OctagonFromGeometricObject(double side, double area) {
		this.side = side;
		this.area = area;
	}
	double getSide() {
		return side;
	}
	void setSide(double side) {
		this.side = side;
	}
	
	double getArea() {
		double area = ((2 + 4 / (Math.sqrt(2)))) * side * side;
		return area;
	}
	double getPerimeter() {
		return (side * 8);
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int compareTo(OctagonFromGeometricObject o) {
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else 
			return 0;
	}
}
