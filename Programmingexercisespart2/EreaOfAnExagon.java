package Programmingexercisespart2;

import java.util.Scanner;

public class EreaOfAnExagon {

	public static void main(String[] args) {
		// Create a scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the side of the hexagon
		System.out.println("Enter the side: ");
		
		double side = input.nextDouble();
		
		//Compute the erea 
		
		double area = ((3*Math.sqrt(3))/2)*Math.pow(side, 2);
		
		//Display the result
		System.out.println("The area of the hexagon is " + area);

	}

}
