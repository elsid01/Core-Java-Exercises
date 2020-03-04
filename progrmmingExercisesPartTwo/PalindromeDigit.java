package progrmmingExercisesPartTwo;

import java.util.Scanner;

public class PalindromeDigit {

	public static void main(String[] args) {
		// Create scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the use for a number of three digits
		System.out.println("Enter a number of three digits to check if it is a palindrome: ");
        
	    String number = input.nextLine();
	    
	    //Check if palindrome
	    
	    if(number.charAt(0) == number.charAt(2) ) {
	    	System.out.println(number + " is a palindrome");
	    }else {
	    	System.out.println(number + " is not a palindrome");
	    }
	    
		
		
	}

}
