package progrmmingExercisesPartTwo;

import java.util.Scanner;



public class NumberOfDaysInAMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to Enter input
		System.out.println("Enter a month in the year (e.g., 1 for Jan): ");
		int month = input.nextInt();
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		int numberOfDaysInMonth = 0;
		
		switch(month) {
		case 1:
			System.out.println("January " + year);
			numberOfDaysInMonth = 31;
			break;
			
		case 2:
			System.out.println("February " + year);
			if(year%400==0 || (year%4==0 && year%100 !=0)) {
				numberOfDaysInMonth = 29;
			}else {
				numberOfDaysInMonth = 28;
			}
			break;
			
		case 3:
			System.out.println("March " + year);
			numberOfDaysInMonth = 31;
			break;
			
		case 4:
			System.out.println("April " + year);
			numberOfDaysInMonth = 30;
			break;
			
		case 5:
			System.out.println("May " + year);
			numberOfDaysInMonth = 31;
			break;
			
		case 6:
			System.out.println("Jane " + year);
			numberOfDaysInMonth = 30;
			break;
			
		case 7:
			System.out.println("July " + year);
			numberOfDaysInMonth = 31;
			break;
			
		case 8:
			System.out.println("August " + year);
			numberOfDaysInMonth = 31;
			break;
			
		case 9:
			System.out.println("September " + year);
			numberOfDaysInMonth = 30;
			break;
			
		case 10:
			System.out.println("October " + year);
			numberOfDaysInMonth = 31;
			break;
			
		case 11:
			System.out.println("November " + year);
			numberOfDaysInMonth = 30;
			break;
			
		case 12:
			System.out.println("December " + year);
			numberOfDaysInMonth = 31;
			break;
		}
		System.out.println(" has " + numberOfDaysInMonth + " days");

	}

}
