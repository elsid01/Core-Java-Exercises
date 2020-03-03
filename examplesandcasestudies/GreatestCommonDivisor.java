package examplesandcasestudies;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.println("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        
        int gcd = 1;//Initial gcd is 1
        int k =2;//Possible gcd
        while(k<=number1 && k<=number2) {
        	if(number1%k==0 && number2%k==0)
        		gcd=k;//update k
        	k++;
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd);
        
	}

}
