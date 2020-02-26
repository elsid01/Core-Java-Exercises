package programmingexercises;

import java.util.Scanner;

public class PoundsToKilograms {

	public static void main(String[] args) {
		
		//Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		//Enter pounds 
		System.out.print("Enter a  number in pounds: ");
		double pounds = input.nextDouble();
		
		//Obtain kilograms
		double kilograms = pounds*0.454;
		
		// display
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
		

	}

}
