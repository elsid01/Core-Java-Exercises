package programmingexercises;

import java.util.Scanner;

public class FeetIntoMeter {

	public static void main(String[] args) {
		//Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		//Enter length in feet
		System.out.print("Enter a value for feet ");
		double feet = input.nextDouble();
		
		//Obtain meters
		
		double meters =  feet*0.305;
		
		//Display
		
		System.out.println(feet + " feet is " + meters + " meters");
		
		

	}

}
