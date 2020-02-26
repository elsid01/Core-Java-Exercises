package programmingexercises;

import java.util.Scanner;

public class DigitsInAInteger {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Enter the number
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		//Obtain digits
		int digit1= number%10;
		number = number/10;
		
		int digit2= number%10;
		number = number/10;
		
		int digit3= number;
		
		//Obtain sum
		
		int sum = digit1+digit2+digit3;
		
		
		//Display
        System.out.println("The sum of the digits is: " + sum);
	}

}
