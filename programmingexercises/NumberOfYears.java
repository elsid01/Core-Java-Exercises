package programmingexercises;

import java.util.Scanner;

public class NumberOfYears {

	public static void main(String[] args) {
		//Create scanner
		System.out.println("Enter the number of minutes: ");
		Scanner input = new Scanner(System.in);
		
		//Enter the minutes
		long minutes = input.nextLong();
		
		//Obtain years and days
		
		int days = (int)(minutes/(24*60));
		int years = (int)(days/ 365);
		
		//Display 
		System.out.println(minutes +" minutes is approximately " + years
				+ " years and " + days%365 + " days");

	}

}
