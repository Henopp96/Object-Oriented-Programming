import java.util.Scanner;
/*
 * Cody Henopp
 * 
 * 07/14/2020
 * 
 * This program randomly generates 100 values in an array and asks for an index in the array.
 */
public class Exercise12_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] random = new int[100];
		for (int number = 0; number < random.length; number++) {
			random[number] = (int)(Math.random() * 100);
			
		
		
	}
		System.out.println("Enter in the index(0-99): ");
	try {
		System.out.println("The index matching your input is: " + random[input.nextInt()]);
	}
	catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Out of Bounds.");
	}
}
}
